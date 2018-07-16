package module2;

public class ConcatLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//concatenation##########################
		int a=300;
		int b=399;
		String j="hi";
		String j1="jaya";
		
		System.out.println(j +"  " +j1);
		System.out.println(j+j1+(a+b));
		System.out.println(a+b+(j + "  "+j1));
//while loop#############################################3
		
		while(a<b){
			System.out.println("Value of a is : "+ a);
			a++;
		}
		//for loop #####################################
		int sum=0;
		for (int i=0; i<=10; i++){
			System.out.println(i);
			sum=sum+i;
			
		}System.out.println("sum of numbers is:"+sum);
		
		//arrays - comes in hand for reading from data tables
		String str[]=new String[3];
		str[0]="hello 1";
		str[1]="hello 2";
		str[2]="hello 3";
		
		for(int arr=0;arr<str.length;arr++){
			System.out.println(str[arr]);
		}
		//print ARRAY IN REVERSE
		for(int arr1=str.length-1;arr1>=0;arr1--){
			System.out.println(str[arr1]);
		}
		
		//two dim arrays
		String twodim[][]=new String[2][2];
		twodim[0][0]="A";
		twodim[0][1]="B";
		twodim[1][0]="A1";
		
		
		twodim[1][1]="B1";
		/*twodim[0][0]="A";
		//twodim[0][0]="A";
		//twodim[0][0]="A";
		//twodim[0][0]="A";
		//twodim[0][0]="A";*/
		System.out.println("rows in array: "+twodim.length);
		System.out.println("no of cols in array: "+twodim[0].length);
		
		for(int x=0;x<twodim.length;x++){
			for(int y=0;y<twodim[0].length;y++){
				System.out.println(twodim[x][y]);
			}
		}
		
	//object arrays to store multiple data types in same array. Just declare and use the same was Object obj1[]=new Object[9];
	}

}
