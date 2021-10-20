package factory;

public class Main {
	public static void main(String[] args) {
		System.out.println(getCar(new MinivanFactory(), "opel", 6));
		System.out.println(getCar(new SedanFactory(), "opel", 6));
	}

	public static Car getCar(CarFactory factory, String model,Integer numOf) {
		return factory.createCar(model, numOf);
	}
}
