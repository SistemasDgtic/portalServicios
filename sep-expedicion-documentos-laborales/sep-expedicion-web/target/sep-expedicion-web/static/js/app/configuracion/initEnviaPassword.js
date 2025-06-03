define(["dijit/form/Form",
        "dijit/form/ValidationTextBox",
        "dijit/form/Button",
        "dijit/form/CheckBox",
        "dijit/form/FilteringSelect",
        "dijit/registry",
        "app/util/constants",
        "dojox/widget/Standby",
        "dojo/_base/lang",
        "dojo/dom-style",
        "dojo/_base/xhr",
        "app/util/jsUtils"
],
function(Form,
        ValidationTextBox,
        Button,
        CheckBox,
        FilteringSelect,
        registry,
        constants,
        Standby,
        lang,
        Style,
        xhr,
        jsUtils
){
         
            var formEnviaPassword, username, preguntaCap, 
            respuestaCap, btnAceptarCap, objectSet;

            function init() {
                initCampos();
                initBotones();
                standby.hide();
            }

            function initCampos() {
            	formEnviaPassword = new Form({}, 'formEnviaPassword');
            	
            	 standby = new Standby({
                     id: 'standby_initEnviaPassword',
                     target: "formEnviaPassword",
                     'class': "dijitContentPaneLoading"
                 });
            	 document.body.appendChild(standby.domNode);
                 standby.startup();
                 standby.show();

                username = new ValidationTextBox({
                    name: 'username',
                    id: 'username',
                    placeHolder: 'Indique su R.F.C.',
                    type: 'text',
                    regExp: constants.RFC_VALID,
                    style: constants.LONG_STYLE,
                    uppercase: true,
                    required: true,
                    disabled: false,
                    maxLength: 13,
                    onChange: function(data){
                    	preguntaCap.reset();
                    	respuestaCap.reset();
                    	btnAceptarCap.set('disabled', true);
        				respuestaCap.set('disabled', true);
                    	setUsuario();
                    }
                }, 'username');

                preguntaCap = new FilteringSelect({
                	name: "idPregunta",
                    id: 'idPregunta',
                    searchAttr: "descripcion",
                    placeHolder: 'Seleccione la pregunta',
                    style: constants.LONG_STYLE,
                    required: false,  
                    readOnly: true
                }, "idPregunta");
                                
                jsUtils.getMemory({
                    urlBase: dojo.config.app.urlBase,
                    requestMapping: 'configuracion/preguntas/todos/' + Math.floor(Math.random() * 1000),
                    load: function(object) {
                        preguntaCap.set('store', object);
                    }
                });

                respuestaCap = new ValidationTextBox({
                    name: 'respuesta',
                    id: 'respuesta',
                    placeHolder: 'Indique la respuesta a la pregunta seleccionada',
                    type: 'text',
                    style: constants.LONG_STYLE,
                    required: true,
                    uppercase: true,
                    disabled: true,
                    maxLength: 30
                }, 'vRespuesta');                             
            }

            function initBotones() {
                new Button({
                    type: 'button',
                    label: 'Cancelar',
                    onClick: function() {
                    	standby.destroy();
                    	location.href="login.jsp";
                    }
                }, 'btnCancelarUsuario');

                btnAceptarCap = new Button({
                    type: 'button',
                    label: 'Aceptar',
                    disabled: true,
                    onClick: function() {
                        onAceptar();
                    }
                }, 'btnAceptarUsuario');
            }
            
            function setUsuario() {
            	if (formEnviaPassword.validate()) {
            		var object = {
            				username: username.get('value')
            		}
            		xhr.post({
            			url: dojo.config.app.urlBase + 'configuracion/usuario/enviaPassword/buscaPorRfc',
            			postData: dojo.toJson( object ),
            			headers : {
            				"Content-Type" : "application/json; charset=UTF-8"
            			},					
            			handleAs: 'json',
            			load: function(data){
            				if(!data[0]){
            					alert("El RFC no esta registrado como empleado activo de la Secretar\u00EDa");
            					return;
            				}else{
            					if(data[0].usuarioHabilitado == false){
            						alert("El usuario no ha sido registrado");
            						return;
            					}
            					if(data[0].usuarioActivo == false){
            						alert("El usuario se encuentra inhabilitado para ingresar al Portal de Autoservicios");
            						return;
            					}else{
            						preguntaCap.reset();
            						respuestaCap.set('disabled', false);
            						btnAceptarCap.set('disabled', false);            						
            						objectSet = {
            							idPregunta: data[0].idPregunta
            						};                                   						
            						jsUtils.setVarWidgetFromObject( objectSet, null );
            					}
            				}        				
            			}
            		});
            	}      	
            }
                
            function onAceptar() {
            	if (formEnviaPassword.validate()) {                  
            		var object = {
            				username: username.get('value'),
                            respuesta: respuestaCap.get('value')
            		};                       
                    xhr.post({
                    	url: dojo.config.app.urlBase + 'configuracion/usuario/enviaPassword/buscaPorRespyRfc',
                		postData: dojo.toJson( object ),
                		headers : {
                			"Content-Type" : "application/json; charset=UTF-8"
                		},					
                		handleAs: 'json',
                		load: function(data){
                			if(!data[0]){
                				alert("La respuesta es incorrecta");
                				return;
                			}else{
                				//alert("Correcto, la contrase\u00F1a se enviara al correo: " + data[0].email  );
                				object.email = data[0].email;
                				object.idUsuario = data[0].idUsuario;     
                				/*
                				xhr.post({
                					url: dojo.config.app.urlBase + 'configuracion/usuario/enviaPassword/enviaMail/',
                            		postData: dojo.toJson( object ),
                            		headers : {
                            			"Content-Type" : "application/json; charset=UTF-8"
                            		},					
                            		handleAs: 'json'                           			
                            	});  
                				respuestaCap.set('disabled', true);
                				formEnviaPassword.reset();
                				btnAceptarCap.set('disabled', true);
                				*/
                				jsUtils.submitObject({
                                    urlBase: dojo.config.app.urlBase,
                                    requestMapping: 'configuracion/usuario/enviaPassword/enviaMail',
                                    data: object,
                                    configModule: { standby: standby},
                                    load: function(data) { 
                                    	console.log(object);
                                    	alert("Correcto, la contrase\u00F1a se envi\u00F3 al correo: " + object.email  );                                    	                                     
                                        standby.destroy();
                                        location.href="login.jsp";
                                    }
                                });
                			}                				
                		}
                	});
            	}
            }

            return {
                init: init
            };
        });