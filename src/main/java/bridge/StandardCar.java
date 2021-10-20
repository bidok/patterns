package bridge;

public class StandardCar extends Car{
	public StandardCar(CarBody carBody) {
		super(carBody);
	}

	@Override
	public void run() {
		System.out.println("standard " + carBody.getBody() + " is riding");
	}
}
