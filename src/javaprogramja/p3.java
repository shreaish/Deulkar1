package javaprogramja;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class p3
{
public static void main(String[] args) throws IOException 
{
	String path="F:\\Excalsheet\\apache.xlsx";
	FileInputStream file=new FileInputStream(path);
	XSSFWorkbook book =new XSSFWorkbook(file);
	XSSFSheet sheet=book.getSheet("selenium");
	XSSFRow row=sheet.getRow(0);
	XSSFCell cell=row.getCell(0);
	String aa=cell.getStringCellValue();
	System.out.println(aa);
	String bb=book.getSheet("selenium").getRow(1).getCell(0).getStringCellValue();
	System.out.println(bb);
	
	
	
	
	
	
}
}
