
public class Exer5 {

	public static void main(String[] args) {
		A3 a1 = new B3();
		a1.meth1();
		a1.meth2();
		a1.meth3();
		a1.meth4(); // object a1 is interfaces obj, since it does not contain method4, it throws an err. it can not access the mthd in the class implementing it.

	}

}
interface A3{
public void meth1();
public void meth2();
public void meth3();
}
class B3 implements A3{

@Override
public void meth1() {
System.out.println("meth1");

}

@Override
public void meth2() {
System.out.println("meth2");

}

@Override
public void meth3() {
System.out.println("meth3");

}

public void meth4() {
System.out.println("meth4");

}
}