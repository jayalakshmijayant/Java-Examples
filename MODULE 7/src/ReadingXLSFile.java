

import java.io.*;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.*;
import org.apache.poi.ss.formula.udf.UDFFinder;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Name;
import org.apache.poi.ss.usermodel.PictureData;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.SheetVisibility;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;

public class ReadingXLSFile {

	public static void main(String[] args) throws IOException {
		//creating a workbook.xls file in user.dir. path. means under current project - module 7
		Workbook wb=new HSSFWorkbook();
		FileOutputStream fileOut = new FileOutputStream("workbook.xls");
	    //wb.write(fileOut);
	  //  fileOut.close();
	    //creating sheets in that xls file
	    Sheet sheet1 = wb.createSheet("new sheet");
	    Sheet sheet2 = wb.createSheet("second sheet");
	    
	    Row r1=sheet1.createRow(0);
	    r1.createCell(0).setCellValue("name");
	    r1.createCell(1).setCellValue("age");
	    r1.createCell(2).setCellValue("Date");
	    
	    Row r2=sheet1.createRow(1);
	    r2.createCell(0).setCellValue("Jaya");
	    r2.createCell(1).setCellValue(28);
	    r2.createCell(2).setCellValue("19/05/1989");
	    
	    Row r3=sheet1.createRow(2);
	    r3.createCell(0).setCellValue("Siri");
	    r3.createCell(1).setCellValue(31);
	    r3.createCell(2).setCellValue("24/06/1986");
	    
	    Row r4=sheet1.createRow(3);
	    r4.createCell(0).setCellValue("Dhriti");
	    r4.createCell(1).setCellValue(4);
	    r4.createCell(2).setCellValue("01/01/2014");
	    
	    
	    wb.write(fileOut);
	    fileOut.close();
	    
	    
	}

}
