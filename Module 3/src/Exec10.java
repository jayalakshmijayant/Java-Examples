
public class Exec10 {

	int age;
	String name;

	Exec10(int age,String name){
	this.age=age;
	this.name=name;
	}
	public static void main(String[] args) {

	Exec10 t1 = new Exec10(17,"A");
	Exec10 t2 = new Exec10(13,"B");
	Exec10 t3 = new Exec10(14,"C");
	t3=t2;
	t2=t1;
	t1=t3;
	System.out.print(t1.age);
	System.out.print(t2.age);
	System.out.println(t3.age);
	}

}
