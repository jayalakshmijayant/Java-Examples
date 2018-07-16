
public class StringExample {

	public static void main(String[] args) {
		String str="Jaya is coding";
		String str1="Jayant,is,working";
		System.out.println(str.length());
		System.out.println("*******************************");
		System.out.println(str.indexOf("jayant"));
		System.out.println("*******************************");
		System.out.println(str.indexOf("Jaya"));
		System.out.println("*******************************");
		if(str1.equals(str)){
			System.out.println("both strings are SAME");
		}else{
			System.out.println("str1 and str not equal");
		}
		System.out.println("*******************************");//checks if a string contains a specific value
		if(str1.contains("Jayant")){
			System.out.println("string contains Jayant");
		}else{
			System.out.println("string does not contain Jayant");
		}
		System.out.println("*******************************");//checks if two strings have same content within in a specified index
		if((str.substring(0, 3)).equals(str1.substring(0, 3))){
			System.out.println("yes");
		}
		System.out.println("*******************************");//storing the string in an array and displaying it.
		String temp[]=str1.split(",");
		for(int i=0;i<temp.length;i++)
		System.out.println(temp[i]);
		
		System.out.println("*******************************");//converting data types
		String x="100";
		int j=Integer.parseInt(x);
		System.out.println(j);
		
		int x1=100;
		String k=String.valueOf(x1);
		System.out.println(x1);
	}

}
