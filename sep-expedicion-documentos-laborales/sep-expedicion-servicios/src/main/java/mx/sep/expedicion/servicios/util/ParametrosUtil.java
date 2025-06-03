/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sep.expedicion.servicios.util;

import java.util.HashMap;
import mx.sep.util.servicios.LoggerUtil;

/**
 *
 * @author jose.hernandezb
 */
public class ParametrosUtil {

	private static ParametrosUtil instance;
	private static HashMap<String, Object> parametros = null;
//	private ParametrosService parametrosService;

	public ParametrosUtil() {
	}

	public static synchronized ParametrosUtil getInstance() {
		if (instance == null) {
			instance = new ParametrosUtil();
		}
		return instance;
	}

	public synchronized void run() throws Exception {
		if (parametros == null) {
			try {
	//			parametros = parametrosService.loadParametros();

			} catch (Exception e) {
				LoggerUtil.warning(this, "Ocurrio un error al cargar los parametros de configuracion");

				e.printStackTrace();
			}
		}

	}

	public static synchronized void destroy() {
		instance = null;
	}

	public static synchronized void valid() {
		if (parametros == null) {
			try {
				instance.run();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static Object getParametro(String param) {
		valid();
		Object obj = parametros.get(param);
		return obj;
	}
	/*
	public void setParametrosService(ParametrosService parametrosService) {
		//this.parametrosService = parametrosService;
	}*/
}
