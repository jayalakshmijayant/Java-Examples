
public class PassByValueRefrnce {
	int x,y;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			PassByValueRefrnce p=new PassByValueRefrnce();
			p.x=10;
			p.y=20;
			System.out.println(p.x+ "........"+p.y);
			swap(p.x,p.y);
			System.out.println(p.x+ "........"+p.y);
			swapVal(p);
			System.out.println(p.x+ "........"+p.y);
	}
	static void swap(int a,int b){//pass by value .. for primitive data types
	int temp=a;
	a=b;
	b=temp;
	}
	static void swapVal(PassByValueRefrnce t){//pass by ref 
		int temp;
		temp=t.x;
		t.x=t.y;
		t.y=temp;
		
	}

}
