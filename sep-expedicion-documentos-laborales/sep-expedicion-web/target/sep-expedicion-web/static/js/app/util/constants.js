define([
], function(
){
	return{
		CHARACTERS_VALID: "((^[0-9A-Za-z\\s\u00f1\u00d1.,\\-_?\u00e1\u00e9\u00ed\u00f3\u00fa\u00c1\u00c9\u00cd\u00d3\u00da\u00e4\u00eb\u00ef\u00f6\u00fc\u00c4\u00cb\u00cf\u00d6\u00dc\u00BF/])|(^[0-9A-Za-z\\s\u00f1\u00d1.,\\-_?\u00e1\u00e9\u00ed\u00f3\u00fa\u00c1\u00c9\u00cd\u00d3\u00da\u00e4\u00eb\u00ef\u00f6\u00fc\u00c4\u00cb\u00cf\u00d6\u00dc\u00BF/]+))([0-9A-Za-z\\s\u00f1\u00d1.,\\-_?\u00e1\u00e9\u00ed\u00f3\u00fa\u00c1\u00c9\u00cd\u00d3\u00da\u00e4\u00eb\u00ef\u00f6\u00fc\u00c4\u00cb\u00cf\u00d6\u00dc\u00BF]$)",
                CHARACTERS_SIN_ACENTO_VALID: "((^[0-9A-Za-z\\sñÑ.,\\-_/]?)|(^[0-9A-Za-z\\sñÑ.,\\-_/]+))([0-9A-Za-z\\sñÑ.,\\-_]$)",
                CHARACTERS_VALID_EXT: "((^[0-9A-Za-z\\s\u00f1\u00d1.,\\()-_\u00e1\u00e9\u00ed\u00f3\u00fa\u00c1\u00c9\u00cd\u00d3\u00da\u00e4\u00eb\u00ef\u00f6\u00fc\u00c4\u00cb\u00cf\u00d6\u00dc/]?)|(^[0-9A-Za-z\\s\u00f1\u00d1.,\\()-_\u00e1\u00e9\u00ed\u00f3\u00fa\u00c1\u00c9\u00cd\u00d3\u00da\u00e4\u00eb\u00ef\u00f6\u00fc\u00c4\u00cb\u00cf\u00d6\u00dc/]+))([0-9A-Za-z\\s\u00f1\u00d1.,\\()-_\u00e1\u00e9\u00ed\u00f3\u00fa\u00c1\u00c9\u00cd\u00d3\u00da\u00e4\u00eb\u00ef\u00f6\u00fc\u00c4\u00cb\u00cf\u00d6\u00dc]$)",
		NOMBRE_VALID: "((^[A-Za-z\\s\u00f1\u00d1.,\\-_\u00e1\u00e9\u00ed\u00f3\u00fa\u00c1\u00c9\u00cd\u00d3\u00da\u00e4\u00eb\u00ef\u00f6\u00fc\u00c4\u00cb\u00cf\u00d6\u00dc]?)|(^[A-Za-z\\s\u00f1\u00d1.,\\-_\u00e1\u00e9\u00ed\u00f3\u00fa\u00c1\u00c9\u00cd\u00d3\u00da\u00e4\u00eb\u00ef\u00f6\u00fc\u00c4\u00cb\u00cf\u00d6\u00dc]+))([A-Za-z\\s\u00f1\u00d1.,\\-_\u00e1\u00e9\u00ed\u00f3\u00fa\u00c1\u00c9\u00cd\u00d3\u00da\u00e4\u00eb\u00ef\u00f6\u00fc\u00c4\u00cb\u00cf\u00d6\u00dc]$)",
		CURP_VALID: "^[a-zA-Z]{4}\\d{6}[a-zA-Z]{6}\\d{2}$",
		INTEXT_VALID: "((^[0-9A-Za-z\\s\\-]?)|(^[0-9A-Za-z\\s\\-]+))([0-9A-Za-z\\s\\-]$)",
		TELEPHONE_VALID: "(^[0-9A-Za-z\\s.,\-]+)([0-9A-Za-z\\s.,\-]$)",
		LADA_VALID: "[0-9]+",
		NUMBER_VALID: "[0-9]+",
                ANIO_VALID: "[2][0-9][0-9][0-9]",
		BOOLEAN_VALID: "(\\W|^)(true|false)(\\W|$)",
		CEDULA_VALID: "[0-9]{7}",
		MAIL_VALID: "(^[0-9a-zA-Z]+(?:[._\\-0-9a-zA-Z]+)*)@([0-9a-zA-Z]+(?:[._-][0-9a-zA-Z]+)*\\.[0-9a-zA-Z]{2,3})$",
		CP_VALID: "\\d{5}",
		NUMBER_VALID_IN: "([0-9,\u0020]+)",
                RFC_VALID: "^[A-Z\u00D1]{4}\\d{6}[A-Z0-9]{3}$",
                PASSWORD_VALID: "[a-zA-Z0-9]{5,18}",
                UR_VALID:"[A-Z0-9]{3}",
		
		BIG_BIG_STYLE: "font-family: Arial, Verdana, Helvetica, sans-serif;font-size:0.9em;width:750px;",
		BIG_LONG_STYLE: "font-family: Arial, Verdana, Helvetica, sans-serif;font-size:0.9em;width:650px;",
		LONG_STYLE: "font-family: Arial, Verdana, Helvetica, sans-serif;font-size:0.9em;width:450px;",
		SHORT_STYLE: "font-family: Arial, Verdana, Helvetica, sans-serif;font-size:0.9em;width:95px;",
		MEDIUM_STYLE: "font-family: Arial, Verdana, Helvetica, sans-serif;font-size:0.9em;width:140px;",
		DEFAULT_STYLE: "font-family: Arial, Verdana, Helvetica, sans-serif;font-size:0.9em;width:210px;",
		CUSTOM_STYLE: "font-family: Arial, Verdana, Helvetica, sans-serif;font-size:0.9em;width:310px;",
		MASK_IMAGES: [
	                 			["Jpeg File", 	"*.jpg;*.jpeg"],
	                			["GIF File", 	"*.gif"],
	                			["PNG File", 	"*.png"],
	                			["All Images", 	"*.jpg;*.jpeg;*.gif;*.png"]
	                		],
		MASK_DOCUMENTOS: [
	                 			["Documento MsWord", "*.doc;*.docx"],
						["Hoja de c\u00E1lculo MsExcel", "*.xls;*.xlsx"],
						["PDF", "*.pdf"]
					],
		TYPE_FILES_FILTER: {
			//TYPE_FILE_MS_WORD: { type:"application/msword", descripcion: ".doc"},
			//TYPE_FILE_MS_XWORD: { type:"application/vnd.openxmlformats-officedocument.wordprocessingml.document", descripcion: ".docx"},
			//TYPE_FILE_MS_EXCEL: { type:"application/vnd.ms-excel", descripcion: ".xls"},
			//TYPE_FILE_MS_XEXCEL: { type:"application/vnd.openxmlformats-officedocument.spreadsheetml.sheet", descripcion: ".xlsx"},
			//TYPE_FILE_ZIP: { type:"application/zip", descripcion: ".zip"},
			TYPE_FILE_PDF: { type:"application/pdf", descripcion: ".pdf"}
		},
		TYPE_FILES_FILTER_CARGA_MASIVA: {
			TYPE_FILE_MS_EXCEL: { type:"application/vnd.ms-excel", subType: "xls", descripcion: ".xls"},
			TYPE_FILE_MS_XEXCEL: { type:"application/vnd.openxmlformats-officedocument.spreadsheetml.sheet", subType: "xlsx", descripcion: ".xlsx"}
		},
		TYPE_IMAGES_FILTER: {
			TYPE_IMAGE_GIF: { type:"image/gif", descripcion: ".gif", subType: 'gif'},
			TYPE_IMAGE_JPEG: { type:"image/jpeg", descripcion: ".jpeg", subType: 'jpeg'},
			TYPE_IMAGE_JPG: { type:"image/jpg", descripcion: ".jpg", subType: 'jpg'},
			TYPE_IMAGE_PNG: { type:"image/png", descripcion: ".png", subType: 'png'}
		},
		EXT_FILES: new Array('txt','csv'),
		
		DOJO_SHORT_DATE: 'yyyy-MM-dd', //copiada de mx.sep.sajja.servicios.util.DateUtils
                DOJO_DATETIME: 'dd-MM-yyyy HH:mm:ss',
		DEFAULT_TIME_FORMAT: 'HH:mm:ss', //copiada de mx.sep.sajja.servicios.util.DateUtils
		PLACEHOLDER_DATE: 'dd/mm/aaaa',
                ROLES: [
                    { label: "Usuario", value: "2" }, 
                    { label: "Administrador", value: "1" } , 
                    { label: "Personal de Apoyo", value: "3" }
                ],
                		
		TIPO_REGISTRO:{
			1: { id: 1, descripcion: 'ACTIVO'},
			2: { id: 2, descripcion: 'INACTIVO'}
		},
		
		BOOLEAN:{
			0: { id: 0, descripcion: 'NO', imageValido: '/images/error.png'},
			1: { id: 1, descripcion: 'SI', imageValido: '/images/ok.png'}
		},
				
		CAT_ESTATICO: {
			ORIGEN_CAPTURA: [
				{
					tpoOrigen: 1,
					descripcion: 'INDIVIDUAL'
				},
				{
					tpoOrigen: 2,
					descripcion: 'MASIVA'
				}
			],
			ESTATUS_SINIESTRO_CAPTURA: 1,
			ESTATUS_SINIESTRO_ENVIADO_SEGUIMIENTO: 2,
			ESTATUS_CONVENIO_FIRMADO: 5,
			ESTATUS_SINIESTRO_PAGO_A_CUENTA: 7,
			ESTATUS_SINIESTRO_FINIQUITADO: 8,
			RAMO_AFECTADO_AUTOS: 3,
			ID_CONVENIO_INTEGRADO: 1,
			ID_REFERENCIA_DEPOSITADO_TESOFE: 1,
			CONVENIO_INTEGRADO: 1,
			ESTATUS_MASIVO: {
				ESTATUS_SINIESTRO_VALIDADO_COMPLEMENTE: 104,
				ESTATUS_SINIESTRO_APLICADO: 105
			}
		}
		
	}
});


