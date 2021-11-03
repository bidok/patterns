package flyweight;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		CarTypeCache.showCarTypes();
		Car car1 = new Car("mazda", "coupe", 3, 150);
		Car car2 = new Car("opel", "sedan", 5, 150);
		Car car3 = new Car("nissan", "coupe", 3, 150);
		Car car4 = new Car("vaz", "sedan", 5, 150);
		System.out.println("==============================");
		CarTypeCache.showCarTypes();
		Department department = new Department(1, "chernivtsi", Arrays.asList(car1, car2, car3, car4));
	}
}
