
public class Exer5 {

	public static void main(String[] args) {
		try {
			divide(4,2);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			divide(4,0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static int divide(int a,int b) throws Exception{
		int result = a/b;
		System.out.println(result);
		return result;
		
		}
}
