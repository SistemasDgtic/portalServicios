/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sep.expedicion.web.controller;

import java.io.IOException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mx.sep.util.web.exporter.grid.DataExporter;
import mx.sep.util.web.exporter.grid.ExporterExcel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import static mx.sep.util.servicios.Constants.SESSION_DATA_EXPORTER;
/**
 *
 * @author jose.hernandezb
 */
@Controller
@RequestMapping("/exporter")
public class Exporter {

	@RequestMapping(value = "/addData", method=RequestMethod.POST)
	@ResponseBody
	public void agregar(@RequestBody DataExporter exporter, HttpServletRequest request) throws Exception {
		if (request.getSession() != null ){
			request.getSession().removeAttribute(SESSION_DATA_EXPORTER);
			request.getSession().setAttribute(SESSION_DATA_EXPORTER, exporter);
		}
		
	}
	
	@RequestMapping(value= "/excel", method = RequestMethod.GET)   
	public void downloadArchivo(HttpServletRequest request, HttpServletResponse response) throws Exception { 
		try {
			DataExporter exporter = (DataExporter) request.getSession().getAttribute(SESSION_DATA_EXPORTER);
			ServletOutputStream out = response.getOutputStream();
			ExporterExcel exporterExcel = new ExporterExcel(exporter);
			byte[] archivo = exporterExcel.getExcel();
			response.setContentLength(archivo.length);
			response.setCharacterEncoding("UTF-8");
			response.setContentType( "application/vnd.ms-excel" );
			response.setHeader("Content-Disposition", "attachment;filename=" + exporter.getNameSheet() + ".xls");
			out.write(archivo);
			out.flush();
			//request.getSession().removeAttribute(SESSION_DATA_EXPORTER);
		} catch (IOException e) {
			// TODO Auto-generated catch block
		}
		
	}
	
}
