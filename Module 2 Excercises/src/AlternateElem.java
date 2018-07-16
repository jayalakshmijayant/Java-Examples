
public class AlternateElem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//printing the alternate elements in a string array
		String str[]=new String[9];
		str[0]="A1";
		str[1]="B1";
		str[2]="C1";
		str[3]="D1";
		str[4]="E1";
		str[5]="F1";
		str[6]="G1";
		str[7]="H1";
		str[8]="I1";
		
		for(int i=0;i<str.length;i++){
			if(i%2==0){
				System.out.println(str[i]);
			}
		}
	}

}
