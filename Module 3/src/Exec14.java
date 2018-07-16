
public class Exec14 {
	int i;
	int j;

	public static void main(String[] args) {

	Exec14 t1 = new Exec14();
	Exec14 t2 = new Exec14();

	t1.j=t2.i=5;
	t1.i=t2.j=6;

	System.out.print((t1.j)++ + " " + (t2.i)--);
//prints 5 5 because t.j and t2.i all points to reference and not the variable itself.
	}
}
