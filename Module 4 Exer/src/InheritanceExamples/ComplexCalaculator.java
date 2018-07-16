package InheritanceExamples;

public class ComplexCalaculator extends SimpleCalculator {
int a1,b1;
public void multiply(int x1, int y1){
	int result=x1*y1;
	System.out.println("multiply result is : "+ result);
}
public void divide(int x1, int y1){
	int result=x1/y1;
	System.out.println("divide result is : "+ result);
}

}
