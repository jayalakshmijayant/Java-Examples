import java.io.*;

public class FileExamples  {

	public static void main(String[] args)throws IOException {
		
		//creating a new file
		File f=new File("C:\\JayaFileHandling\\temp.txt");
		f.createNewFile();
		if(f.exists()==true)
			System.out.println("file created");
		
		//writing in the file
		FileWriter w= new FileWriter("C:\\JayaFileHandling\\temp.txt");
		BufferedWriter bf=new BufferedWriter(w);
		bf.write("writing in the file");
		bf.newLine();
		bf.write("This is line1");
			bf.flush();
		
			//reading from a file. mostly used in selenium.
			FileReader r=new FileReader("C:\\JayaFileHandling\\temp.txt");
			BufferedReader b1=new BufferedReader(r);
			String x1="";
			while ((x1=b1.readLine()) !=null)
			System.out.println(x1);
	}

}
