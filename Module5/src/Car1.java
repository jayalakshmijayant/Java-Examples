
//import InhertanceExamples;
public class Car1 implements CarFeatures{

	@Override
	public void Features(int mileage, String gear) {
		System.out.println("mileage :" +mileage);
		System.out.println("Gear type: "+gear);
	}

	@Override
	public void Price(int price) {
		System.out.println("Price : "+price);
		
	}

	@Override
	public void Model(int model) {
		System.out.println("model : "+model);
		
	}
	public void newArrival(boolean e){
		System.out.println("Is New model : " +e);
	}
	public static void main(String[] args){
		Car1 cc=new Car1();
		System.out.println("No of Wheels : "+noOfWheels);
		cc.Price(12000);
		cc.Features(60, "manual");
		cc.newArrival(true);
	}
}
