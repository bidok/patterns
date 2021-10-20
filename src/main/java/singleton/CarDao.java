package singleton;

import java.util.ArrayList;
import java.util.List;

public class CarDao {
	private List<Car> db = new ArrayList<>();

	private static CarDao instance = new CarDao();

	public static CarDao getInstance() {
		return instance;
	}

	public void save(Car car) {
		db.add(car);
	}

	public void show() {
		System.out.println(db);
	}
}
