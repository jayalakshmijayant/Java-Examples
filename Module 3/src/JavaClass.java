
public class JavaClass {

	int i=1;
	static int a=1;

	public static void main(String[] args) {

	JavaClass t= new JavaClass();
	calArea(); //1
	nonstaticMethod(); //2

	JavaClass.calArea(); //3
	t.calArea(); //4

	i=i+1; //5
	a=a+1; //6

	static int b=1; //7

	}

	public void nonstaticMethod(){

	}

	public static int calArea(){

	return 1*1;

	}

}
