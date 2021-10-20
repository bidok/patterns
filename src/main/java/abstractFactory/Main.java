package abstractFactory;

public class Main {
	public static void main(String[] args) throws Exception {
		showCars("reno");
	}

	public static void showCars(String model) throws Exception {
		Minivan minivan;
		Sedan sedan;
		switch (model) {
			case "opel": {
			minivan = new OpelDepartment().createMinivan();
			sedan = new OpelDepartment().createSedan();
			break;
			}
			case "reno": {
			minivan = new RenoDepartment().createMinivan();
			sedan = new RenoDepartment().createSedan();
			break;
			}
			default: throw new Exception("illegal marka");
		}
		minivan.start();
		sedan.ride();
	}
}
