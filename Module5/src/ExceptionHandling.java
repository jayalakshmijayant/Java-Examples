
public class ExceptionHandling {

	public static void main(String[] args) {
		try{
			System.out.println("a");
		int k=5/0;
		System.out.println(k);
		System.out.println("b");
		}catch(Exception e){
			System.out.println("some error");
			System.out.println(e.getMessage());
			System.out.println();
			e.printStackTrace();
		}finally{
		System.out.println("finally c");
		}
	}

}
