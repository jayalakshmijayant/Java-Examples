package InheritanceExamples;

public class Car {

	Car(){
		System.out.println("displays all the car types and features");
	}
	Car(int year,String model){
		System.out.println("year: "+year);
		System.out.println("model: "+model);
		//System.out.println("year: "+year);
	}
	Car(int year,String model,int price ){
		System.out.println("year: "+year);
		System.out.println("model: "+model);
		System.out.println("Price: "+price);
	}
	public static void main(String[] args) {
		Car c=new Car();
		Car c2=new Car(2000,"Toyota camry ");
		Car c1=new Car(2009,"hyundai");
		Car c3=new Car(2011,"corolla",13000);
        c1=c2;
        System.out.println(c1.getClass());
	}

}
