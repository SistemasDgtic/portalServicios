/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sep.util.web.exporter.grid;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.CellRangeAddress;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;

/**
 *
 * @author jose.hernandezb
 */
public class ExporterExcel {
	private DataExporter dataExporter;
	private HSSFWorkbook workbook;
	private HSSFSheet sheet;
	
	private Integer totalColumnas = null;
	
	public ExporterExcel(DataExporter dataExporter) {
		this.dataExporter = dataExporter;
	}
	
	public byte[] getExcel() throws IOException{
		createSheet();
		createTitle();
		createHeaders();
		createBody();
		autoSizeColumns();
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		workbook.write(outputStream);
		byte[] byteArray = outputStream.toByteArray();
		return byteArray;
	}
	
	private void createSheet(){
		workbook = new HSSFWorkbook();
		sheet = workbook.createSheet( this.dataExporter.getNameSheet());
	}
	
	private void createTitle(){
		CellStyle style = workbook.createCellStyle();
		Font font = workbook.createFont();
		font.setFontName(HSSFFont.FONT_ARIAL);
		font.setFontHeightInPoints((short) 12);
		font.setBoldweight(Font.BOLDWEIGHT_BOLD);
		font.setColor(IndexedColors.BLACK.getIndex());
		style.setFont(font);
		style.setAlignment( CellStyle.ALIGN_CENTER );
		Row row = sheet.createRow(0);
		Cell cell = row.createCell(0);
		cell.setCellValue( this.dataExporter.getTitleMain() );
		cell.setCellStyle(style);
	}
	
	private void createHeaders(){
		CellStyle style = workbook.createCellStyle();
		Font font = workbook.createFont();
		font.setFontName(HSSFFont.FONT_ARIAL);
		font.setFontHeightInPoints((short) 10);
		font.setBoldweight(Font.BOLDWEIGHT_BOLD);
		font.setColor(IndexedColors.BLACK.getIndex());
		style.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex() );
		style.setFillPattern(CellStyle.SOLID_FOREGROUND);
		style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		style.setBorderTop(HSSFCellStyle.BORDER_THIN);
		style.setBorderRight(HSSFCellStyle.BORDER_THIN);
		style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		style.setFont(font);
		List<String> headers = this.dataExporter.getHeaders();
		totalColumnas = headers.size();
		Row row = sheet.createRow(1);
		Cell cell = null;
		for (int i = 0; i < headers.size(); i++) {
			String header = headers.get(i);
			cell = row.createCell(i);
			cell.setCellValue( header );
			cell.setCellStyle(style);
		}
	}
	
	private void createBody(){
		CellStyle style = workbook.createCellStyle();
		Font font = workbook.createFont();
		font.setFontName(HSSFFont.FONT_ARIAL);
		font.setFontHeightInPoints((short) 9);
		font.setColor(IndexedColors.BLACK.getIndex());
		style.setFont(font);
		style.setAlignment( CellStyle.ALIGN_LEFT );
		int rowBody = 2;
		List<List<String>> body = this.dataExporter.getBody();
		Row row = null;
		Cell cell = null;
		for (int i = 0; i < body.size(); i++) {
			List<String> contenidoFila = body.get(i);
			row = sheet.createRow( rowBody + i );
			for (int j = 0; j < contenidoFila.size(); j++) {
				String contenidoColumna = contenidoFila.get(j);
				cell = row.createCell(j);
				cell.setCellValue( contenidoColumna );
				cell.setCellStyle(style);
			}
		}
	}
	
	private void autoSizeColumns(){
		sheet.addMergedRegion(new CellRangeAddress(
			0, //first row (0-based)
			0, //last row  (0-based)
			0, //first column (0-based)
			totalColumnas  //last column  (0-based)
		));
		for (int i = 0; i < totalColumnas ; i++) {
			sheet.autoSizeColumn( i );
		}
		
	}
	
	
}
