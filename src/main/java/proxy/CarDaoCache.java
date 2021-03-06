package proxy;

import builder_pool.Car;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CarDaoCache implements GenericDao {
	private final CarDao carDao = new CarDao();
	private static final Map<Integer, Car> cache = new HashMap<>();

	@Override
	public Car getCar(Integer id) {
		if (cache.containsKey(id)) {
			return cache.get(id);
		} else {
			Car car = carDao.getCar(id);
			cache.put(car.getId(), car);
			return car;
		}
	}

	public void showCache() {
		cache.entrySet().forEach(System.out::println);
	}
}
