define(["dijit/form/Form",
    "dijit/form/ValidationTextBox",
    "dijit/form/Button",
    "dijit/form/Select",
    "dijit/form/FilteringSelect",
    "dijit/Dialog",
    "dijit/registry",
    "app/util/constants",
    'app/util/text!static/html/configuracion/dialogFormDatosDim.html!strip;no-cache',
    "dojo/_base/lang",
    "dojo/dom-style",
    "dojo/store/Memory",
    "dijit/form/DateTextBox"
],
        function(Form,
                ValidationTextBox,
                Button,
                Select,
                FilteringSelect,
                Dialog,
                registry,
                constants,
                template,
                lang,
                Style,
                Memory,
                DateTextBox
                ) {

            var modConfig;
            var dialogCapDatosDim, formCapDatosDim, idDatosCap, anioCap, folioCap, fechaCap, usuarioCap, btnAceptarCap, btnCancelarCap;
            var aleatorio = null;

            function init(config) {
                modConfig = config;
                if (registry.byId("dialogFormDatosDim")) {
                    dialogCapDatosDim = registry.byId("dialogFormDatosDim");
                } else {
                    aleatorio = "dialogDatosDim" + Math.floor(Math.random() * 1000);
                    var output = lang.replace(
                            template,
                            {aleatorio: aleatorio}
                    );
                    dialogCapDatosDim = new Dialog({
                        title: "Datos de Presentaci\u00F3n del DIM",
                        content: output,
                        id: 'dialogFormDatosDim'
                    });

                    formCapDatosDim = new Form({}, 'capDatosDimForm' + aleatorio);

                    idDatosCap = new ValidationTextBox({
                        placeHolder: 'Auto-Generado',
                        regExp: constants.NUMBER_VALID,
                        type: 'text',
                        style: 'width: 100px;',
                        required: false,
                        uppercase: true,
                        maxLength: 6
                    }, 'idDatosCap' + aleatorio);

                    anioCap = new ValidationTextBox({
                        placeHolder: 'Ingrese el A\u00F1o',
                        name: 'anioCap',
                        id: 'anioCap' + aleatorio,
                        regExp: constants.ANIO_VALID,
                        type: 'text',
                        style: 'width: 200px;',
                        required: true,
                        maxLength: 4
                    }, 'anioCap' + aleatorio);

                    folioCap = new ValidationTextBox({
                        placeHolder: 'Indique el N\u00FAmero de Folio',
                        name: 'folioCap',
                        id: 'folioCap' + aleatorio,
                        regExp: constants.INTEXT_VALID,
                        required: true,
                        uppercase: true,
                        type: 'text',
                        style: 'width: 200px'
                    }, 'folioCap' + aleatorio);

                    fechaCap = new DateTextBox({
                        name: 'fechaCap',
                        id: "fechaCap" + aleatorio,
                        invalidMessage: "Fecha inv\u00E1lida.",
                        regExp: constants.DOJO_SHORT_DATE,
                        placeHolder: 'dd/mm/aaaa',
                        required: true,
                        style: constants.MEDIUM_STYLE,
                        type: 'text'
                    }, 'fechaCap' + aleatorio);

                    usuarioCap = new ValidationTextBox({
                        name: 'usuarioCap',
                        id: 'usuarioCap' + aleatorio,
                        uppercase: true,
                        type: 'text',
                        style: 'width: 200px'
                    }, 'usuarioCap' + aleatorio);

                    btnAceptarCap = new Button({
                        type: 'button',
                        label: 'Aceptar',
                        onClick: function() {
                            onAceptar();
                        }
                    }, 'btnAceptarCap' + aleatorio);

                    btnCancelarCap = new Button({
                        type: 'button',
                        label: 'Cancelar',
                        onClick: function() {
                            onCancelar();
                        }
                    }, 'btnCancelarCap' + aleatorio);

                }
            }

            function onAceptar() {
                if (dialogCapDatosDim.validate()) {
                    if ((usuarioCap.get('value') != "") && (anioCap.get('value') != "") && (folioCap.get('value') != "") && (fechaCap.get('value') != "")) {
                        modConfig.onAceptar({
                            idDatos: idDatosCap.get('value'),
                            anio: anioCap.get('value'),
                            numFolio: folioCap.get('value'),
                            fechaPresentacion: fechaCap.get('value'),
                            usuario: usuarioCap.get('value')
                        });
                        hide();
                    } else {
                        alert("Capture los campos requeridos");
                        return;
                    }
                }
            }

            function onCancelar() {
                hide();
            }

            function setOnAceptar(objectFunction) {
                modConfig.onAceptar = objectFunction;
            }

            function show(object, mode, usuario) {
                btnAceptarCap.set('disabled', false);
                if (object) {
                    idDatosCap.set('value', object.idDatos);
                    usuarioCap.set('value', usuario);                   
                    anioCap.set('value', object.anio);
                    folioCap.set('value', object.numFolio);
                    fechaCap.set('value', dojo.date.locale.format(new Date(object.fechaPresentacion), {datePattern: constants.DOJO_SHORT_DATE, selector: "date"}));
                } else {
                    idDatosCap.reset();
                    usuarioCap.set('value', usuario);
                    anioCap.reset();
                    folioCap.reset();
                    fechaCap.reset();
                }
                if (mode == 'edit') {
                    idDatosCap.set('disabled', true);
                    usuarioCap.set('disabled', true);
                    anioCap.set('disabled', false);
                    folioCap.set('disabled', false);
                    fechaCap.set('disabled', false);
                }
                if (mode == 'new') {
                    idDatosCap.set('disabled', true);
                    usuarioCap.set('disabled', true);
                    anioCap.set('disabled', false);
                    folioCap.set('disabled', false);
                    fechaCap.set('disabled', false);
                }
                dialogCapDatosDim.show();
            }

            function hide() {
                dialogCapDatosDim.hide();
            }

            return {
                init: init,
                show: show,
                hide: hide,
                setOnAceptar: setOnAceptar
            };
        });




