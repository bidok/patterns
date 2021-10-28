package flyweight;

import builder_pool.Car;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author : Vasyl Bidiak
 * @created : 21.10.2021
 * @className : CarCache
 **/

public class CarCache {
	private static Map<Integer, Car> cash = new HashMap<>();

	public static Car getCar(Integer id, String marka, Integer maxSpeed, Integer numOfPlaces, String color, Integer year) {
		Car result = cash.get(id);
		if (Objects.isNull(result)) {
			result = new Car(id, marka, maxSpeed, numOfPlaces, color, year);
			cash.put(id, result);
		}
		return result;
	}

	public static void deleteCar(Integer id) {
		cash.remove(id);
	}

	public static void showCash() {
		System.out.println(cash);
	}
}
