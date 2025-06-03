/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sep.util.servicios;

import java.text.Collator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;


import org.apache.commons.beanutils.BeanUtils;
import org.springframework.core.io.Resource;


public class StringUtils {
	private static final String[] ACCENTS = new String[]{"á","é","í","ó","ú","ñ",
														 "Á","É","Í","Ó","Ú","Ñ"}; 
	private static final String[] ACCENTS_HTML = new String[]{"&aacute;","&eacute;","&iacute;","&oacute;","&uacute;","&ntilde;",
															  "&Aacute;","&Eacute;","&Iacute;","&Oacute;","&Uacute;","&Ntilde;"};
	private static final String[] ONLY_ACCENTS = new String[]{"á","é","í","ó","ú",
															  "Á","É","Í","Ó","Ú"};
	private static final String[] WITHOUT_ACCENTS = new String[]{"a","e","i","o","u",
															  "A","E","I","O","U"};
	
	
	public static boolean compare(String[] a, String[] b ){//Profesionista prof,String nombreTram, String primerApeTram,String segundoApeTram ){
		//boolean outcome = false;
		if( a == null || b == null || a.length != b.length ){
			return false;
		}
		 //Get the Collator for US English and set its strength to PRIMARY
		Collator usCollator = Collator.getInstance(new Locale("es","MX"));
		usCollator.setStrength(Collator.PRIMARY);
		int i=0;
		for( ;i<a.length;i++){
			String tmpA = a[i].replaceAll("'", "");
			String tmpB = b[i].replaceAll("'", "");
			if( usCollator.compare( tmpA, tmpB ) != 0 ){
				return false;
			}
		}
		return true;
		 
		 
		 //if( usCollator.compare(prof.getNombre().replaceAll("'", ""), nombreTram.replaceAll("'", "")) == 0 &&
		//		 usCollator.compare(prof.getPrimerApe().replaceAll("'", ""), primerApeTram.replaceAll("'", "")) == 0 &&
		//		 usCollator.compare(prof.getSegundoApe().replaceAll("'", ""), segundoApeTram.replaceAll("'", "")) == 0 ) {
		 //    outcome = true;
		 //}

		//return outcome;
	}	
	
	public static String replaceAccent( String str ){
		int i=0;		
		for( String _old: ACCENTS ){
			String _new = ACCENTS_HTML[i]; 
			str = str.replaceAll( _old, _new );
			i++;
		}		
		return str;
	}

	public static String replaceAccent( String str, Boolean onlyAccent ){
		if ( !onlyAccent ){
			return replaceAccent(str);
		}
		int i=0;
		for( String _old: ONLY_ACCENTS ){
			String _new = WITHOUT_ACCENTS[i];
			str = str.replaceAll( _old, _new );
			i++;
		}
		return str;
	}
	/**
	 * Dada una cadena reparte las palabras completas en un arreglo de Strings segun un tamaño especificado
	 * @param cadena Cadena a separa y repartir en campos
	 * @param longitud longitud de la cadena de cada campo
	 * @param campos arreglo a colocar el resultado de la separación
	 * @param index indice del arreglo a comenzar a llenar
	 */
	public static void allocateChain( int length, List<String> objectFields, Object object, List<String> archivoFields, Object archivoObject, String chainOriginal, int maxLength ) throws Exception{
		String remainderChain ="";
		int i = 0;
		for( String field:archivoFields ){
			String str = ""; 
			if( i >= objectFields.size() ){
				str = remainderChain;
			}else{
				str = remainderChain + BeanUtils.getProperty( object, objectFields.get( i ) );
			}
			
			i++;
			if( str.length() < length ){
				BeanUtils.setProperty( archivoObject, field, str );
				remainderChain = "";
				continue;
			}
			if( str.length() > length ){
				String first = str.substring( 0, length );
				int endIndex = first.lastIndexOf( " " );
				if( endIndex == -1 ){
					endIndex =  first.length();
				}
				String chain = str.substring( 0, endIndex );
				remainderChain = str.substring( endIndex, str.length() ) + " ";
				BeanUtils.setProperty( archivoObject, field, chain );
			}			
		}	
		String chainEnd = "";
		for( String field:archivoFields ){
			chainEnd += BeanUtils.getProperty( archivoObject,  field ) + " ";
		}
		chainEnd = chainEnd.trim();
		System.out.println( length + "::::::" + chainEnd + " == " + chainOriginal );
		
		if( !chainEnd.equals( chainOriginal ) && length < maxLength ){
			allocateChain(length+1, objectFields, object, archivoFields, archivoObject, chainOriginal, maxLength);
		}else if( chainEnd.equals( chainOriginal ) ){
			return;
		}else{
			throw new Exception( "No fue posible alojar string");	
		}
			
		
		
	}
	
	public static void main(String[] args) {
		
	}
	
	


	/**
	 * Convierte un Resource a String
	 * @param resource
	 * @return
	 * @throws Exception
	 */
	public static String resourceToString(Resource resource) throws Exception {
		StringBuilder contenido = new StringBuilder();
		Scanner scan = new Scanner( resource.getInputStream() );
		while (scan.hasNext()) {
			contenido.append( scan.nextLine() );
		}
		scan.close();
		resource.getInputStream().close();
		return contenido.toString();
	}
	public static String replaceFromMap(String texto, Map<String,String> replacement) throws Exception {
		String templateInfo = texto+"";
		for (Map.Entry<String, String> entry : replacement.entrySet()){
			templateInfo = templateInfo.replaceAll( entry.getKey(), entry.getValue() );
		}
		return templateInfo;
	}
	public static String lPad0(int asCad, int aiLongitud) {
		return String.format("%0" + aiLongitud + "d", asCad);
	}
	
	
	

}

