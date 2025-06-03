define(["dijit/form/Form",
        "dijit/form/ValidationTextBox",
        "dijit/form/Button",
        "dijit/Dialog",
        "dijit/registry",
        "app/util/constants",
        "dijit/form/FilteringSelect",
        'app/util/text!static/html/configuracion/dialogFormUsuario.html!strip;no-cache',
        "dijit/form/Select",
        "dojo/_base/lang",
        "dijit/form/CheckBox",
        "app/util/jsUtils",
        "dojo/dom-style"],
        function(Form,
                 ValidationTextBox,
                 Button,
                 Dialog, 
                 registry,
                 constants,
                 FilteringSelect,
                 template,
                 Select,
                 lang,
                 CheckBox,
                 jsUtils,
                 Style) {

	var modConfig;
	var dialogCapUsuario, formCapUsuario, idUsuarioCap, usernameCap, passwordCap, passwordCapConf, rolCap, rolAnt;
        var ckBoxPasswordCap, nombreUsuarioCap, usuarioActivoCap, emailCap, idPreguntaCap, respuestaCap, usuarioHabilCap, btnAceptarCap;
	var aleatorio = null;
        
	function init( config ){
		modConfig = config;
		if ( registry.byId("dialogFormUsuario") ){
			dialogCapUsuario = registry.byId("dialogFormUsuario");
		}else{
			aleatorio = "tps005" + Math.floor(Math.random() * 1000);
			var output = lang.replace(
				template,
				{ aleatorio: aleatorio }
			);
			
			dialogCapUsuario = new Dialog({
				title: "Usuario",
				content: output,
				id: 'dialogFormUsuario' 
			});
			
			formCapUsuario = new Form({}, 'capUsuarioForm' + aleatorio );
	
			idUsuarioCap = new ValidationTextBox({
				placeHolder: 'Auto-Generado',
				regExp: constants.NUMBER_VALID,
				type: 'text',
				style: 'width: 100px;',
				required: false,
				uppercase: true,
				maxLength: 6
			}, 'idUsuario' + aleatorio);  
                        
                        idPreguntaCap = new FilteringSelect({
                            name: "idPregunta",
                            id: 'idPregunta' + aleatorio,     
                            searchAttr: "descripcion",
                            placeHolder: 'Seleccione la pregunta',
                            style: constants.LONG_STYLE,
                            required: true
                        }, "idPregunta" + aleatorio);

                        jsUtils.getMemory({
                            urlBase: dojo.config.app.urlBase,
                            requestMapping: 'configuracion/preguntas/todos/' + Math.floor(Math.random() * 1000),
                            idProperty: 'idPregunta',
                            load: function(object) {
                                idPreguntaCap.set('store', object);
                            }
                        });
			
			usernameCap = new ValidationTextBox({
				placeHolder: 'Indique clave del Usuario',
				regExp: constants.RFC_VALID,
				type: 'text',
				style: 'width: 455px;',
				required: true,
				uppercase: false,
				maxLength: 13
			}, 'username' + aleatorio);

			passwordCap = new ValidationTextBox({
				placeHolder: 'Indique la Contrase\u00F1a',
				regExp: constants.PASSWORD_VALID,
				type: 'text',
				style: 'width: 180px;',
				required: true,
				uppercase: false,
				type: 'password',
				maxLength: 60
			}, 'Password' + aleatorio);
			
			passwordCapConf = new ValidationTextBox({
				placeHolder: 'Confirme la Contrase\u00F1a',
				regExp: constants.PASSWORD_VALID,
				type: 'text',
				style: 'width: 180px;',
				required: true,
				uppercase: false,
				type: 'password',
				maxLength: 60
			}, 'PasswordC' + aleatorio);
			
			ckBoxPasswordCap = new CheckBox({
		        name: "ckPassword",
		        value: "true",
		        checked: false,
		        title: "Seleccione si desea actualizar contrase\u00F1a",
                            onChange: function(b){ 
                                    onActPassword(b);
                            }
                        }, 'ckPassword' + aleatorio);
	
			nombreUsuarioCap = new ValidationTextBox({
				placeHolder: 'Indique Nombre del usuario',
				regExp: constants.CHARACTERS_VALID,
				type: 'text',
				style: 'width: 455px;',
				required: true,
				uppercase: true,
				maxLength: 100
			}, 'nombreUsuario' + aleatorio);
                        
                        emailCap = new ValidationTextBox({
				placeHolder: 'Indique e-mail del usuario',
				regExp: constants.MAIL_VALID,
				type: 'text',
				style: 'width: 455px;',
				required: true,
				uppercase: false,
				maxLength: 100
			}, 'email' + aleatorio);
                        
                        respuestaCap = new ValidationTextBox({
				placeHolder: 'Indique respuesta a la pregunta seleccionada',
				regExp: constants.CHARACTERS_VALID,
				type: 'text',
				style: 'width: 455px;',
				required: true,
				uppercase: true,
				maxLength: 30
			}, 'respuesta' + aleatorio);
			
			usuarioActivoCap = new Select({
				name: "lUsuarioActivo",
				options: [ { label: "Activo", value: "true" }, { label: "Inactivo", value: "false" } ],
				placeHolder: 'Indique si el usuario esta activo',
				style: 'width: 455px;',
				required: true
			}, 'usuarioActivo' + aleatorio);
                        
                        usuarioHabilCap = new ValidationTextBox({				
				regExp: constants.CHARACTERS_VALID,
				type: 'hidden',
				style: 'width: 455px;',
				required: true,
				maxLength: 30
			}, 'usuarioHabilitado' + aleatorio);                        
                       
                        rolCap = new Select({
				name: "lIdRol",
				options: [ { label: "Usuario", value: "2" }, { label: "Administrador", value: "1" } , { label: "Personal de Apoyo", value: "3" } ],
				placeHolder: 'Indique el Rol del usuario',
				style: 'width: 455px;',
				required: true
			}, 'idRol' + aleatorio);
						
			new Button({
				type: 'button',
				label: 'Cancelar',
				onClick: function(){
					onCancelar();
				}
			}, 'btnCancelarUsuario' + aleatorio);
			
			btnAceptarCap = new Button({
				type: 'button',
				label: 'Aceptar',
				onClick: function(){
					onAceptar();
				}
			}, 'btnAceptarUsuario' + aleatorio);
		}
	}
	
	function onActPassword(objectValue){
		if (objectValue==true){
			passwordCap.set('disabled', false);
			passwordCapConf.set('disabled', false);
		}else{
			passwordCap.set('disabled', true);
			passwordCapConf.set('disabled', true);
		}
	}       
                
        function onAceptar() {
            if (formCapUsuario.validate()) {
                if (passwordCap.get('value') != passwordCapConf.get('value')) {
                    alert("La contrase\u00F1a y su confirmaci\u00F3n no son iguales, verifique");
                    return(-1);
                }
                var pass = (passwordCap.get('value') == "") ? usernameCap.get('value') : passwordCap.get('value');
                var email = (emailCap.get('value') == "") ? "" : emailCap.get('value');
                var resp = (respuestaCap.get('value') == "") ? "" : respuestaCap.get('value');
                var uAct = (usuarioActivoCap.get('value') == "") ? true : usuarioActivoCap.get('value');
                modConfig.onAceptar({
                    idUsuario: parseInt(idUsuarioCap.get('value')),
                    idPregunta: idPreguntaCap.item.idPregunta,
                    username: usernameCap.get('value'),
                    password: pass,
                    nombreUsuario: nombreUsuarioCap.get('value'),
                    email: email,
                    respuesta: resp,
                    usuarioActivo: uAct,
                    usuarioHabilitado: usuarioHabilCap.get('value'),       
                    idRol: rolCap.get('value'),
                    idRolAnterior: rolAnt
                }, ckBoxPasswordCap.get('value'), rolAnt);
                hide();
            }
        }
	
	function onCancelar(){
		hide();
	}
	
	function setOnAceptar( objectFunction ){
		modConfig.onAceptar = objectFunction;                
	}
	
	function show( object, rol, mode ){
		btnAceptarCap.set('disabled', false );
		if ( object ){                        
			idUsuarioCap.set('value', object.idUsuario);
                        idPreguntaCap.set('value', object.idPregunta);
			usernameCap.set('value', object.username);
			passwordCap.set('value', object.password);
			passwordCapConf.set('value', object.password);
			nombreUsuarioCap.set('value', object.nombreUsuario);
                        emailCap.set('value', object.email);
                        respuestaCap.set('value', object.respuesta);
			usuarioActivoCap.set('value', object.usuarioActivo);
                        usuarioHabilCap.set('value', object.usuarioHabilitado);
                        rolCap.set('value', object.idRol); 
                        rolAnt = object.idRol;
			ckBoxPasswordCap.reset();                         
		}else{
			idUsuarioCap.reset();
                        idPreguntaCap.reset();
			usernameCap.reset();
			passwordCap.reset();
			passwordCapConf.reset();
			nombreUsuarioCap.reset();
                        emailCap.reset();
                        respuestaCap.reset();                        
			usuarioActivoCap.reset();
                        usuarioHabilCap.reset();
                        rolCap.reset();
		}
		if ( mode == 'read' ){
			idUsuarioCap.set('disabled', true);
                        idPreguntaCap.set('disabled', true);
			usernameCap.set('disabled', true);
			passwordCap.set('disabled', true);
			passwordCapConf.set('disabled', true);
			nombreUsuarioCap.set('disabled', true);
                        emailCap.set('disabled', true);
                        respuestaCap.set('disabled', true);
			usuarioActivoCap.set('disabled', true);
			btnAceptarCap.set('disabled', true );
                        usuarioHabilCap.set('disabled', true );
                        rolCap.set('disabled', true );
			Style.set('actP' + aleatorio, "display", "none");
		}
		if ( mode == 'edit' ){
			idUsuarioCap.set('disabled', true);
                        idPreguntaCap.set('disabled', false);
			usernameCap.set('disabled', false);
			passwordCap.set('disabled', true);
			passwordCapConf.set('disabled', true);
			nombreUsuarioCap.set('disabled', false);
                        emailCap.set('disabled', false);
                        respuestaCap.set('disabled', false);
			usuarioActivoCap.set('disabled', false);
                        usuarioHabilCap.set('disabled', true );
                        if(rol == 'ROLE_ADMINISTRADOR'){                            
                            rolCap.set('disabled',false);
                        } else {
                            rolCap.set('disabled',true);
                        }
			Style.set('actP' + aleatorio, "display", "block");
		}		
		if ( mode == 'new' ){
			idUsuarioCap.set('disabled', true);
                        idPreguntaCap.set('disabled', true); 
                        idPreguntaCap.set('value',1);
			usernameCap.set('disabled', false);
			passwordCap.set('disabled', true);
			passwordCapConf.set('disabled', true);                        
			nombreUsuarioCap.set('disabled', false);
                        emailCap.set('disabled', true);                        
                        respuestaCap.set('disabled', true);                        
			usuarioActivoCap.set('disabled', true);
                        usuarioHabilCap.set('disabled', true );
                        rolCap.set('disabled', false );
			Style.set('actP' + aleatorio, "display", "none");
		}
		dialogCapUsuario.show();
	}
	
	function hide(){
		dialogCapUsuario.hide();
	}

	return {
		init : init,
		show: show,
		hide: hide,
		setOnAceptar: setOnAceptar
	};

});
		