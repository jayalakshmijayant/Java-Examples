
public class ArrayRepeatedNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]={1,3,4,5,6,3,2,4,6,7,9,4,12,3,4,6,8,9,7,6,43,2,4,7,7,5,2,1,3,4,6,311,1};
		/*boolean flag=false;
		int count=1;
		int j;
		String value="";
		
		for(j=0;j<arr1.length;j++){							
				count=1;
				value=value+","+arr1[j];
				if value.(1,value,arr1[j])>0{
					
				}else{
					for(int k=j+1;k<arr1.length;k++){
						if(arr1[j]==arr1[k]){
						count=count+1;			
						
					}
					}
			}
		}*/
		int j=0;
		int count=1;
		for(j=0;j<arr1.length;j++){	
			
			for(int k=j+1;k<arr1.length;k++){
				count=0;
				if((arr1[j]==arr1[k])&&(j !=k )){
					count=count+1;
					System.out.println(arr1[j] +" repeated "+ count + " times.");
					//break;
			}
				//System.out.println(arr1[j] );
			
		}
		}
		
			
			//System.out.println(arr1[j]);
			//int x=arr1[j];
			
			//if(arr1[j]==x){
			//	count=count+1;
				//
			//}else{
				
			//}
		}

	}


