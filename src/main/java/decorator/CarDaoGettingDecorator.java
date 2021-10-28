package decorator;

public class CarDaoGettingDecorator extends CarDaoDecorator{

	public void getBySpecificField() {
		System.out.println("car was gotten by specific field");
	}
}
