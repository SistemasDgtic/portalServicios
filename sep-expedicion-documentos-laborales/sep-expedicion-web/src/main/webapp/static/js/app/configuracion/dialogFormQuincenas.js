define(["dijit/form/Form",
    "dijit/form/ValidationTextBox",
    "dijit/form/Button",
    "dijit/form/Select",
    "dijit/form/FilteringSelect",
    "dijit/Dialog",
    "dijit/registry",
    "app/util/constants",
    'app/util/text!static/html/configuracion/dialogFormQuincenas.html!strip;no-cache',
    "dojo/_base/lang",
    "dojo/dom-style",
    "dojo/store/Memory"
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
                Memory
                ) {

            var modConfig;
            var dialogCapQuincenas, formCapQuincenas, anioCap, qnaCap, usuarioCap, btnAceptarCap, btnCancelarQna;
            var aleatorio = null;

            function init(config) {
                modConfig = config;
                if (registry.byId("dialogFormQuincenas")) {
                    dialogCapQuincenas = registry.byId("dialogFormQuincenas");
                } else {
                    aleatorio = "dialogQna" + Math.floor(Math.random() * 1000);
                    var output = lang.replace(
                            template,
                            {aleatorio: aleatorio}
                    );
                    dialogCapQuincenas = new Dialog({
                        title: "Control de Quincenas",
                        content: output,
                        id: 'dialogFormQuincenas'
                    });

                    formCapQuincenas = new Form({}, 'capQuincenasForm' + aleatorio);

                    usuarioCap = new ValidationTextBox({
                        placeHolder: 'Ingrese R.F.C.',
                        regExp: constants.RFC_VALID,
                        type: 'text',
                        style: 'width: 200px;',
                        required: false,
                        uppercase: true
                    }, 'usuario' + aleatorio);

                    anioCap = new ValidationTextBox({
                        placeHolder: 'Ingrese el A\u00F1o',
                        regExp: constants.ANIO_VALID,
                        type: 'text',
                        style: 'width: 200px;',
                        required: true,
                        uppercase: true,
                        maxLength: 4
                    }, 'anio' + aleatorio);

                    var qnaStore = new Memory({
                        data: [
                            {descripcion: "01", idQna: "01"},
                            {descripcion: "02", idQna: "02"},
                            {descripcion: "03", idQna: "03"},
                            {descripcion: "04", idQna: "04"},
                            {descripcion: "05", idQna: "05"},
                            {descripcion: "06", idQna: "06"},
                            {descripcion: "07", idQna: "07"},
                            {descripcion: "08", idQna: "08"},
                            {descripcion: "09", idQna: "09"},
                            {descripcion: "10", idQna: "10"},
                            {descripcion: "11", idQna: "11"},
                            {descripcion: "12", idQna: "12"},
                            {descripcion: "13", idQna: "13"},
                            {descripcion: "14", idQna: "14"},
                            {descripcion: "15", idQna: "15"},
                            {descripcion: "16", idQna: "16"},
                            {descripcion: "17", idQna: "17"},
                            {descripcion: "18", idQna: "18"},
                            {descripcion: "19", idQna: "19"},
                            {descripcion: "20", idQna: "20"},
                            {descripcion: "21", idQna: "21"},
                            {descripcion: "22", idQna: "22"},
                            {descripcion: "23", idQna: "23"},
                            {descripcion: "24", idQna: "24"}
                        ]
                    });

                    qnaCap = new FilteringSelect({
                        name: "quincena",
                        id: 'quincena' + aleatorio,
                        searchAttr: "descripcion",
                        store: qnaStore,
                        placeHolder: 'Seleccione',
                        style: constants.MEDIUM_STYLE,
                        required: true
                    }, "quincena" + aleatorio);

                    btnCancelarQna = new Button({
                        type: 'button',
                        label: 'Cancelar',
                        onClick: function() {
                            onCancelar();
                        }
                    }, 'btnCancelarQna' + aleatorio);

                    btnAceptarCap = new Button({
                        type: 'button',
                        label: 'Aceptar',
                        onClick: function() {
                            onAceptar();
                        }
                    }, 'btnAceptarQna' + aleatorio);
                }
            }

            function onAceptar() {
                if (dialogCapQuincenas.validate()) {
                    if ((usuarioCap.get('value') != "") && (anioCap.get('value') != "") && (qnaCap.get('value') != "")) {
                        modConfig.onAceptar({
                            qnaProc: anioCap.get('value') + dijit.byId('quincena' + aleatorio).get('displayedValue'),
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

            function show(object, mode) {
                btnAceptarCap.set('disabled', false);
                if (object) {
                    usuarioCap.set('value', object.usuario);
                    anioCap.reset();
                    qnaCap.reset();
                } else {
                    usuarioCap.reset();
                    anioCap.reset();
                    qnaCap.reset();
                }
                if (mode == 'new') {
                    usuarioCap.set('disabled', true);
                    anioCap.set('disabled', false);
                    qnaCap.set('disabled', false);
                }
                dialogCapQuincenas.show();
            }

            function hide() {
                dialogCapQuincenas.hide();
            }

            return {
                init: init,
                show: show,
                hide: hide,
                setOnAceptar: setOnAceptar
            };
        });
