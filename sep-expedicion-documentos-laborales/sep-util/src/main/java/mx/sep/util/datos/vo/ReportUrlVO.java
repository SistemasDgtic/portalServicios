package mx.sep.util.datos.vo;

import java.util.Map;

/**
 *
 * @author jose.hernandezb
 */
public class ReportUrlVO {
	private static final long serialVersionUID = 1L;
	private String url;
	private String action;
	private Map<String, String> parameters;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public Map<String, String> getParameters() {
		return parameters;
	}
	public void setParameters(Map<String, String> parameters) {
		this.parameters = parameters;
	}
}
