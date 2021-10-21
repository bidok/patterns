package flyweight;

import builder_pool.Car;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author : Vasyl Bidiak
 * @created : 21.10.2021
 * @className : CarCash
 **/

public class CarCash {
	static Map<Integer, Car> cash = new HashMap<>();

	public static Car getTreeType(Integer id, String marka, Integer maxSpeed, Integer numOfPlaces, String color, Integer year) {
		Car result = cash.get(id);
		if (Objects.isNull(result)) {
			result = new Car(id, marka, maxSpeed, numOfPlaces, color, year);
			treeTypes.put(name, result);
		}
		return result;
	}
}
