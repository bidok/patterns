package proxy;

import builder_pool.Car;
import builder_pool.CarBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarDao implements GenericDao{
	private List<Car> db = new ArrayList<>(Arrays.asList(
			new CarBuilder(1).build(),
			new CarBuilder(2).build()
	));

	@Override
	public Car getCar(Integer id) {
		return db.stream()
				.filter(item -> item.getId().equals(id))
				.findFirst()
				.orElse(null);
	}

	void showCart() {
		db.forEach(System.out::println);
	}
}
