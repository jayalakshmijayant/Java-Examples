
public class Exec9 {

	int i;

	Exec9(int i){
	this.i=i; // i=i means nothing, we need to use the keyword this in order to assign this i to the global var i.
	}
	public static void main(String[] args) {
		
		Exec9 t = new Exec9(7);
		System.out.println(t.i);
	}

}
