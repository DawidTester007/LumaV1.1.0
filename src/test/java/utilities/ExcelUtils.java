package utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	public  FileInputStream fi;
	public  FileOutputStream fo;
	public  XSSFWorkbook wb;
	public  XSSFSheet ws;
	public  XSSFRow row;
	public  XSSFCell cell;
	public 	String path;
	ExcelUtils(String path){
		
		this.path = path;
		
	}
	
	public int getRowCount(String xlsheet) throws IOException
	{
		fi = new FileInputStream(this.path);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(xlsheet);
		int rowcount = ws.getLastRowNum();
		wb.close();
		fi.close();
		return rowcount;
		
	}
	
	public int getCellCount(String xlsheet, int rownum) throws IOException 
	{
		fi = new FileInputStream(this.path);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(xlsheet);
		row = ws.getRow(rownum);
		int cellcount = row.getLastCellNum();
		wb.close();
		fi.close();
		return cellcount;
		
	}
	
	public String getCellData(String xlsheet, int rownum, int colnum) throws IOException 
	{
		fi = new FileInputStream(this.path);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(xlsheet);
		row = ws.getRow(rownum);
		cell=row.getCell(colnum);
		
		String data;
		try
		{
			data=cell.toString();
			
		}
		catch(Exception e)
		{
			data="";
		}
		wb.close();
		fi.close();
		return data;
		
		
		
	}
	
	public  void setCellData( String xlsheet, int rownum, int colnum, String data) throws IOException 
	{
		fi = new FileInputStream(this.path);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(xlsheet);
		row = ws.getRow(rownum);
		
		cell = row.createCell(colnum);
		cell.setCellValue(data);
		fo = new FileOutputStream(this.path);
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();
		
		
	}	
}
