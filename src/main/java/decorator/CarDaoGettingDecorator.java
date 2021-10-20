package decorator;

public class CarDaoGettingDecorator extends CarDaoDecorator{

	public CarDaoGettingDecorator(CarDao carDao) {
		super(carDao);
	}

	public void getBySpecificField() {
		System.out.println("car gotten by specific field");
	}
}
