
public class StaticandNonstatic {
	int j=3;
	static int k=5;
	static int sum=0;
	
	public static void main(String[] args){
		//creating an obj of the class
		StaticandNonstatic	c1=new StaticandNonstatic();
		c1.addNum();
		numbers(3);
	}
	public static void numbers(int x)
	{
		//below line throws error since non static variable j is used in a static function
		// sum=j+k;
		sum=sum+x;
		System.out.println("sum is "+ sum);
	}
	public void addNum(){
		sum=sum+k;
		System.out.println("sum is "+ sum);
	}
}
