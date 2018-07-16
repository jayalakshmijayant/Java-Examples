
public class IntegerArrinRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print an array in reverse order
		int arr[]=new int[5];
		arr[0]=464;
		arr[1]=32;
		arr[2]=134;
		arr[3]=3432;
		arr[4]=12342;
		for(int x=arr.length-1;x>=0;x--){
			System.out.println(arr[x]);
		}
		
		//Least and greatest number in a array
		
		int large=arr[0];;
		int small=arr[0];
		for(int j=1;j<arr.length;j++){
			if(arr[j]>large){
				large=arr[j];
				
				}
			if(arr[j]<small){
				small=arr[j];
			}
			}
		System.out.println("Largest number is : "+large);
		System.out.println("smallest num in array is : "+small);
	}
	

}
