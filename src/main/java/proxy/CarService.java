package proxy;

import builder_pool.Car;

public class CarService {
	GenericDao carDao = new CarDaoCache();

	public Car getCar(Integer id) {
		return carDao.getCar(id);
	}
}
