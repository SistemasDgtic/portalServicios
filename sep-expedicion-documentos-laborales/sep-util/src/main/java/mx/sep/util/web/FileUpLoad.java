/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sep.util.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import mx.sep.util.modelo.Archivo;
import mx.sep.util.servicios.ErrorInfraestructura;
import mx.sep.util.servicios.LoggerUtil;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.util.MultiValueMap;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

/**
 *
 * @author jose.hernandezb
 */
public class FileUpLoad {

	private HttpServletRequest request;

	public FileUpLoad(HttpServletRequest request) {
		this.request = request;
	}

	public List<Archivo> getFiles() throws ErrorInfraestructura {
		List<Archivo> list = new ArrayList<Archivo>();
		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
		MultiValueMap<String, MultipartFile> mapaArchivos;
		mapaArchivos = multipartRequest.getMultiFileMap();
		String nombreArchivo = "";
		String type;
		try {
			if (mapaArchivos != null && mapaArchivos.size() > 0) {
				for (Map.Entry<String, List<MultipartFile>> listaElementos : mapaArchivos.entrySet()) {

					List<MultipartFile> listaArchivos = listaElementos.getValue();
					for (MultipartFile multipartFile : listaArchivos) {

						nombreArchivo = multipartFile.getOriginalFilename();
						type = multipartFile.getContentType();
						
						list.add( new Archivo( nombreArchivo, multipartFile.getBytes() ) );
						LoggerUtil.debug(this, "NOMBRE DEL ARCHIVO: " + nombreArchivo + ", TIPO: " + type);
					}
				}
			}
		} catch (IOException ioe) {
			throw new ErrorInfraestructura(ioe, "servicios.archivos.error.upload", new Object[]{nombreArchivo});
		}
		return list;
	}
	
	public Map getFields() throws FileUploadException {
		List lFiles = null;
		ServletFileUpload lUpload = new ServletFileUpload();
		lFiles = lUpload.parseRequest(request);
		Map lReturn = new HashMap();
		Iterator it = lFiles.iterator();
		FileItem item = null;
		while (it.hasNext()) {
			item = (FileItem) it.next();
			if (!item.isFormField()) {
				FileItem lFileItem = item;
				lReturn.put(item.getFieldName(), lFileItem);
			} else {
				lReturn.put(item.getFieldName(), item.getString());
			}
		} // termino del while
		return lReturn;
	}
	
}
