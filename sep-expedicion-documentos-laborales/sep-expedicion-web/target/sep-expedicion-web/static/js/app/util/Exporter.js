define([
	"app/util/jsUtils",
	"dojo/io/iframe",
	"dojo/has", 
	"dojo/_base/sniff"
], function(
	jsUtils,
	ioIframe,
	has
){
function Exporter( object, configModule ){
	function excel(){
		jsUtils.submitObject({
			configModule: configModule,
			urlBase: configModule.urlBase,
			requestMapping: 'exporter/addData' + '?currentSystem=' + new Date().getTime(),
			data: object,
			load: function( response ){
				var url = configModule.urlBase + 'exporter/excel' + '?currentSystem=' + new Date().getTime();
				//if ( has("ie") ){
				window.document.location.href = url;
					/*return;
				}
				ioIframe.send({
					url: url,
					method: "GET",
					load: function(response, ioArgs){
						return response;
					},
					error: function(response, ioArgs){				
						console.log(response);
						return response;
					}
				});*/
			}
		});
	}
	
	function jasper( urlJasper, mimeType ){
		jsUtils.submitObject({
			configModule: configModule,
			urlBase: configModule.urlBase,
			requestMapping: 'exporter/addData' + '?currentSystem=' + new Date().getTime(),
			data: object,
			load: function( response ){
				var url = configModule.urlBase + urlJasper + '?currentSystem=' + new Date().getTime() + '&mimeType=' + mimeType;
				//if ( has("ie") ){
				window.document.location.href = url;
					/*return;
				}
				ioIframe.send({
					url: url,
					method: "GET",
					load: function(response, ioArgs){
						return response;
					},
					error: function(response, ioArgs){				
						console.log(response);
						return response;
					}
				});*/
			}
		});
	}
	
	
	return {
		excel: excel,
		jasper: jasper
	};
}
return Exporter;	
});


