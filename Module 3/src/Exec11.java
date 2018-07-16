
public class Exec11 {

	int age;
	String name;

	Exec11(){
	non_static_meth();
	static_meth();
	}
	public static void main(String[] args) {

	Exec11 t1 = new Exec11();


	}

	public void non_static_meth(){
	System.out.print("NM ");
	}

	public static void static_meth(){
	System.out.println("SM");

	}


}
