package mx.sep.util.servicios;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * Fecha de creacion: 08-11-2009
 * Autor: Horacio Sanchez Barrera
 * Descripci�n: Capa de servicio, para proyectos web
 * version: 1.0
*/
public abstract class SupportService {
	@Autowired
	private Map<String, Resource> adjuntoInlineMail;
	/**
	 *  Obtiene el byte[] del reporte ejecutado via URL
	 * @param url
	 * @return
	 * @throws IOException
	 */
	public byte[] callURL(URL url) throws IOException {
		byte[] bytes = null;
		if ( "https".equalsIgnoreCase( url.getProtocol() + "" ) ){
			bytes = resourceToBytes( url );
		} else {
			UrlResource urlResource = new UrlResource( url );
				bytes = resourceToBytes( urlResource );
		}
		LoggerUtil.debug(this, bytes.length);
		return bytes;
	}

	/**
	 * Lee el template HTML del email y reemplaza los valores a mostrar
	 * @param parametros
	 * @return
	 * @throws Exception
	 */
	public byte[] resourceToBytes( Resource resource ) throws IOException  {
	    InputStream is = resource.getInputStream();
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		int bytesRead;
		byte bytes[] = new byte[1024];
		while ( ( bytesRead = is.read( bytes ) ) != -1 ) {
			bos.write( bytes, 0, bytesRead );
		}
		bos.close();
		is.close();
		bos.flush();
		return bos.toByteArray();
		
	}

	public byte[] resourceToBytes(URL url) throws IOException {
		HttpsURLConnection httpsCon = (HttpsURLConnection) url.openConnection();
		httpsCon.setHostnameVerifier(new HostnameVerifier() {

			public boolean verify(String hostname, SSLSession session) {
				return true;
			}
		});
		httpsCon.connect();
		InputStream is = httpsCon.getInputStream();
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		int bytesRead;
		byte bytes[] = new byte[ 1024 ];
		while ( ( bytesRead = is.read( bytes ) ) != -1 ) {
			bos.write( bytes, 0, bytesRead );
		}
		bos.close();
		is.close();
		bos.flush();
		httpsCon.disconnect();
		return bos.toByteArray();

	}
	
	public Map<String, byte[]> obtieneAdjuntoInline() throws FileNotFoundException, IOException{
		Map<String, byte[]> inline = new HashMap<String, byte[]>();
		for (Entry<String, Resource> entry : adjuntoInlineMail.entrySet()) {
			byte[] bytes = this.resourceToBytes( adjuntoInlineMail.get( entry.getKey() ) );
			inline.put( entry.getKey(), bytes );
		}
		return inline;
	}    
	
	public void setAdjuntoInlineMail(Map<String, Resource> adjuntoInlineMail) {
		this.adjuntoInlineMail = adjuntoInlineMail;
	}
}
