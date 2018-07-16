
public class Exec5 {
	
	int i;
	static int j;
	
	static void main(String[] args) {
		// TODO Auto-generated method stub
		int local=i; // will generate error since non staic variable is accessed n assigned to a local var.
		Exec5 t = new Exec5();
		t.non_static();
		t.meth_static2(); // this is a static method, so doesnt need a obj to call it.
		meth_static2();
		t.i=100;
		j=200;
		t.j=400; //static global variable doesnt need an obj ref to be used.
	}
	public void non_static(){
		System.out.println("pass1");
		}

		public static void meth_static2(){
		System.out.println("pass1");
		}

}
