package module2;

public class LearnFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("in main func... calling my function now....");
			Learnfunc();
			
	System.out.println("using func with param");;
	Funcwithparameters(9,89);
			
	}
	
	public static void Learnfunc(){
		System.out.println("my function");
	}
	
	/* if we write void while declaring a function, then we need not write a return stat
	ement, but if we use int or string or any adatatype, then we need to write  return statement.*/
	
	
	public static void Funcwithparameters(int a,int b){
	int c=a+b; 
	// here c is a local variable. it can not be used in other function. its scope is only inside this func.
	System.out.println(c);}
}
