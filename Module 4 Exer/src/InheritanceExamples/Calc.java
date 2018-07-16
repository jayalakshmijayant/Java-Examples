package InheritanceExamples;

public class Calc {

	public static void main(String[] args) {
		ComplexCalaculator c=new ComplexCalaculator();
		c.addNum(3, 4);
		c.multiply(3, 5);
		SimpleCalculator s=new SimpleCalculator();
		s.subNum(4, 3);
	}

}
