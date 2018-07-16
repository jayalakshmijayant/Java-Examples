
public class Exer2 {

	public static void main(String[] args) {
		A1 a = new A1();
		B1 b = new B1();

		a.parentMeth();
		a.childMeth(); // this is a mthd of the child class. Can not be called by the obj of super class.

		b.childMeth();
		a.parentMeth();
	}

}
class A1{
public void parentMeth(){
}
}
class B1 extends A1{
public void childMeth(){

}
class A2{
}

class B2{
}
class C extends A2,B2{ //_: A class can implement multiple interfaces but extends only one class, 
	//so you can implement your class with all your interfaces without merging all into one interface, if you want


}
}
interface A{


}

interface B {

}


class C1 implements A,B{ // A class can implement multiple interfaces at the same time.


}