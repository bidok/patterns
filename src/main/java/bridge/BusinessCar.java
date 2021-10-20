package bridge;

public class BusinessCar extends Car{

	public BusinessCar(CarBody carBody) {
		super(carBody);
	}

	@Override
	public void run() {
		System.out.println("business " + carBody.getBody() + " is riding");
	}
}
