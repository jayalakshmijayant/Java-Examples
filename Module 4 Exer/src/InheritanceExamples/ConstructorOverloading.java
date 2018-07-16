package InheritanceExamples;

public class ConstructorOverloading {
int j=10;
	public ConstructorOverloading(){
		System.out.println("withpout param");
	}
	public ConstructorOverloading(int j){
		System.out.println("with int param :"+j);
		this.j=j;
	}
	public static void main(String[] args) {
	new ConstructorOverloading();
	new ConstructorOverloading(5);
		
	}

}
