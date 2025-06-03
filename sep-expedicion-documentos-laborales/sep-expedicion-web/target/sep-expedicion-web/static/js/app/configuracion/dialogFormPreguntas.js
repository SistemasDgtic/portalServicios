define(["dijit/form/Form",
        "dijit/form/ValidationTextBox", 
        "dijit/form/Button", 
        "dijit/form/Select",
        "dijit/Dialog", 
        "dijit/registry",
        "app/util/constants", 
        'app/util/text!static/html/configuracion/dialogFormPreguntas.html!strip;no-cache',        
        "dojo/_base/lang",
        "dojo/dom-style"],
        function(Form, 
                    ValidationTextBox,
                    Button,
                    Select,
                    Dialog,
                    registry,
                    constants,
                    template,                    
                    lang,                     
                    Style) {

	var modConfig;
	var dialogCapPreguntas, formCapPreguntas, idPreguntaCap, descripcionCap, ActivoCap, btnAceptarCap;        
        var aleatorio = null;
	
	function init( config ){
		modConfig = config;
		if ( registry.byId("dialogFormPreguntas") ){
			dialogCapPreguntas = registry.byId("dialogFormPreguntas");
		}else{
			aleatorio = "tps009" + Math.floor(Math.random() * 1000);
			var output = lang.replace(
				template,
				{ aleatorio: aleatorio }
			);
			
			dialogCapPreguntas = new Dialog({
				title: "Preguntas Clave",
				content: output,
				id: 'dialogFormPreguntas' 
			});
			
			formCapPreguntas = new Form({}, 'capPreguntasForm' + aleatorio );
	
			idPreguntaCap = new ValidationTextBox({
				placeHolder: 'Auto-Generado',
				regExp: constants.NUMBER_VALID,
				type: 'text',
				style: 'width: 100px;',
				required: false,
				uppercase: true,
				maxLength: 6
			}, 'idPregunta' + aleatorio);
	
			descripcionCap = new ValidationTextBox({
				placeHolder: 'Ingrese la Pregunta Clave',
				regExp: constants.CHARACTERS_VALID,
				type: 'text',
				style: 'width: 455px;',
				required: true,
				uppercase: false,
				maxLength: 100
			}, 'descripcion' + aleatorio);
                        
                        ActivoCap = new Select({
                            name: "activo",
                            options: [ { label: "Activa", value: "true" }, { label: "Inactiva", value: "false" } ],
                            placeHolder: 'Indique si la pregunta se encontrará activa',
                            required: true
                        }, 'activo' + aleatorio);
						
			new Button({
				type: 'button',
				label: 'Cancelar',
				onClick: function(){
					onCancelar();
				}
			}, 'btnCancelarPregunta' + aleatorio);
			
			btnAceptarCap = new Button({
				type: 'button',
				label: 'Aceptar',
				onClick: function(){
					onAceptar();
				}
			}, 'btnAceptarPregunta' + aleatorio);
		}
	}  
        
	function onAceptar(){
		if ( dialogCapPreguntas.validate() ){			
			modConfig.onAceptar({
				idPregunta: idPreguntaCap.get('value'),
				descripcion: descripcionCap.get('value'),
                                activo: ActivoCap.get('value')
			});
                        hide();
		}
	}
	
	function onCancelar(){
		hide();
	}
	
	function setOnAceptar( objectFunction ){
		modConfig.onAceptar = objectFunction;
	}
	
	function show( object, mode ){
		btnAceptarCap.set('disabled', false );
		if ( object ){
			idPreguntaCap.set('value', object.idPregunta);
			descripcionCap.set('value', object.descripcion);
                        ActivoCap.set('value', object.activo);
		}else{
			idPreguntaCap.reset();
			descripcionCap.reset();
                        ActivoCap.reset();
		}
		if ( mode == 'read' ){
			idPreguntaCap.set('disabled', true);
			descripcionCap.set('disabled', true);
                        ActivoCap.set('disabled', true);
			btnAceptarCap.set('disabled', true );
		}
		if ( mode == 'edit' ){
			idPreguntaCap.set('disabled', true);
			descripcionCap.set('disabled', false);
                        ActivoCap.set('disabled', false);
		}
		
		if ( mode == 'new' ){
			idPreguntaCap.set('disabled', true);
			descripcionCap.set('disabled', false);	
                        ActivoCap.set('disabled', false);
		}
		dialogCapPreguntas.show();
	}
	
	function hide(){
		dialogCapPreguntas.hide();
	}

	return {
		init : init,
		show: show,
		hide: hide,
		setOnAceptar: setOnAceptar
	};

});
		


