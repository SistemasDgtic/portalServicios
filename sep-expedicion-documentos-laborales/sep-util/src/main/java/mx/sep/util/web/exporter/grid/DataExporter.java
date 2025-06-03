/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sep.util.web.exporter.grid;

import java.util.List;

/**
 *
 * @author jose.hernandezb
 */
public class DataExporter {
	private String titleMain;
	private List<String> headers;
	private List<List<String>> body;
	private String nameSheet;
	
	private List<Integer> idList;

	public String getTitleMain() {
		return titleMain;
	}

	public void setTitleMain(String titleMain) {
		this.titleMain = titleMain;
	}

	public List<String> getHeaders() {
		return headers;
	}

	public void setHeaders(List<String> headers) {
		this.headers = headers;
	}

	public List<List<String>> getBody() {
		return body;
	}

	public void setBody(List<List<String>> body) {
		this.body = body;
	}

	public String getNameSheet() {
		return nameSheet;
	}

	public void setNameSheet(String nameSheet) {
		this.nameSheet = nameSheet;
	}

	public List<Integer> getIdList() {
		return idList;
	}

	public void setIdList(List<Integer> idList) {
		this.idList = idList;
	}

	
}
