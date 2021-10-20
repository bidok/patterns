package decorator;

public class Main {
	public static void main(String[] args) {
		CarService carService = new CarService();
		carService.get();
		carService.save();
		carService.getBySpecificField();
	}
}
