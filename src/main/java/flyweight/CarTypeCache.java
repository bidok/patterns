package flyweight;

import java.util.HashMap;
import java.util.Map;

public class CarTypeCache {
	private static final Map<String, CarType> map = new HashMap<>();

	public static CarType getCarType(String bodyType, Integer numOfDoors) {
		if (map.containsKey(bodyType)) {
			System.out.println("car type [" + bodyType + "] was gotten");
			return map.get(bodyType);
		}
		CarType carType = new CarType(bodyType, numOfDoors);
		map.put(bodyType, carType);
		System.out.println("car type [" + bodyType + "] was created");
		return carType;
	}

	public static void showCarTypes() {
		map.entrySet().forEach(System.out::println);
	}
}
