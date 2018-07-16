import java.io.*;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.*;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.CellReference;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.SpreadsheetVersion;
import org.apache.poi.ss.formula.udf.UDFFinder;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Name;
import org.apache.poi.ss.usermodel.PictureData;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.SheetVisibility;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class IterateThroughRows extends ReadingXLSFile{

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		FileInputStream ip=new FileInputStream("C:\\Learn Java and Selenium\\MODULE 7\\TestData.xls"); 
	try {
		HSSFWorkbook wb1=new HSSFWorkbook(ip);
		//Sheet sheet = wb1.getSheetAt(0);
		//Row r1=sheet1.getRow(0);
	    HSSFSheet sheet1 = wb1.getSheetAt(0);
	   System.out.println(sheet1.getLastRowNum());
	   Iterator<Row> rows=sheet1.iterator();
	   while(rows.hasNext()){
		   Row r=rows.next();
		   Iterator<Cell> cells=r.cellIterator();
		   while(cells.hasNext()){
			   Cell c=cells.next();
			
			   if(c.getCellTypeEnum()==CellType.STRING){
				   System.out.print(c.getStringCellValue()+"  ");
			   }else if(c.getCellTypeEnum()==CellType.NUMERIC  ){
				   System.out.print(c.getNumericCellValue()+"  ");
			   }
		   }
		   System.out.println();
	   }

	} catch (EncryptedDocumentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	
	
	}

}
