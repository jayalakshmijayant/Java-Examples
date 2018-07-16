
public class Ex2 {
	int i=9;
	static int j=90;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println(i); // ref to a non static global variable van not be made with out an object.
		System.out.println(j);
		new Ex2().non_static();
		non_static1();  //throws an error because it can not be accessed with out an object
		non_static2();
	}
	public void non_static(){
		System.out.println(i);
		System.out.println(j);
		}
	public void non_static1(){
		System.out.println("pass");

		}
	public static void non_static2(){
		System.out.println("pass");

		}
}
