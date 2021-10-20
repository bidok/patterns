package bridge;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Car businessCoupeCar = new BusinessCar(new Coupe());
		Car standardSedanCar = new StandardCar(new Sedan());
		Car businessSedanCar = new BusinessCar(new Sedan());
		Car standardCoupeCar = new StandardCar(new Sedan());

		startCars(Arrays.asList(businessCoupeCar, standardCoupeCar, businessSedanCar, standardSedanCar));
	}

	public static void startCars(List<Car> cars) {
		cars.forEach(Car::run);
	}
}
