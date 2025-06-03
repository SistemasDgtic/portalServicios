
package mx.sep.util.servicios;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map.Entry;
import mx.sep.util.datos.vo.ReportUrlVO;

public class URLUtil {
	public static URL createURL(ReportUrlVO reportUrlBean) throws MalformedURLException, UnsupportedEncodingException {
		StringBuilder uri = new StringBuilder();
		uri.append( reportUrlBean.getUrl() );
		uri.append( "/" );
		uri.append( reportUrlBean.getAction() );
		if (!reportUrlBean.getParameters().isEmpty()) {
			uri.append( "?" );
			String valueReplaceScapeCode = null;
			for (Entry<String, ? extends Object> entry : reportUrlBean.getParameters().entrySet()) {
				if ( entry.getValue().equals("") )
					continue;
				uri.append( entry.getKey() );
				uri.append( "=" );
				valueReplaceScapeCode = URLEncoder.encode( entry.getValue()+"", "UTF-8" );
				uri.append( valueReplaceScapeCode );
				uri.append( "&" );
			}
		}
		return  new URL( uri.toString() );
	}
	
}
