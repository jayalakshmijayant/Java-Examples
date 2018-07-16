
public class Exer4 {

	public static void main(String[] args) {
		Class1 c=null;
		try{
			c.callclass(); // throws error because object is initialized to null.
			System.out.println("success");
		}catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
class Class1{
	public void callclass(){
		System.out.println("calling method.. inside class1");
	}

}