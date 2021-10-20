package builder_pool;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CarPool {

	private static Map<Car, LocalDateTime> cars = new HashMap<>();

	public static Car addCar (Car car) {
		checkData();
		if (cars.containsKey(car)) {
			return car;
		}
		cars.put(car, LocalDateTime.now());
		return car;
	}

	public static Car getCar(Integer id) throws Exception {
		return cars.keySet().stream().filter(item -> item.getId().equals(id)).findFirst().orElseThrow(Exception::new);
	}

	public static Set<Car> getCars() {
		return cars.keySet();
	}

	private static void checkData() {
		if (LocalTime.now().equals(LocalTime.of(12,0))) {
			cars = cars.entrySet().stream()
					.filter(item -> ChronoUnit.DAYS.between(item.getValue(), LocalDateTime.now()) < 1)
					.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		}
	}
}
