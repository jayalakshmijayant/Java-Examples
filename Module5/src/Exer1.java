
public class Exer1 {

	public static void main(String[] args) {
		try{
			int o[] = new int[2];
			o[3]=23;
			}catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace(); // prints where the exception occured
			}

	}

}