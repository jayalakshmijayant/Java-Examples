import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;


public class ReadingPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		System.out.println(System.getProperty("user.dir"));
		Properties prop=new Properties();
		FileInputStream fis = new FileInputStream("C:\\Learn Java and Selenium\\MODULE 7\\src\\config\\Employee.properties");
		//FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\config\\Employee.properties");
		prop.load(fis);
		
		System.out.println("Name is: "+prop.getProperty("name"));
		System.out.println("Dob is: "+prop.getProperty("Dob"));
		//FileOutputStream o=new FileOutputStream(System.getProperty("user.dir")+"\\src\\config\\Employee.properties");
		//prop.put("Country", "India");
		//prop.setProperty("City", "Chennai");	
	//	prop.setProperty("Country", "India");
	}

}
