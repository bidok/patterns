package facade;

import builder_pool.Car;
import builder_pool.CarBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarDao {
	private List<Car> db = new ArrayList<>(Arrays.asList(new CarBuilder(1).build(), new CarBuilder(2).build()));

	public void save(Car car) {
		db.add(car);
	}

	public Car read(Integer id) {
		return db.stream().filter(item -> item.getId().equals(id)).findFirst().orElseThrow(() -> new IllegalArgumentException("car don`t exist"));
	}
}
