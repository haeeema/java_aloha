package Day18.Ex02_Tire;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		
		myCar.tires[1] = new KumhoTire();
		myCar.tires[2] = new KumhoTire();
		
		myCar.run();
	}
}
