package facade;

import builder_pool.Car;

public class CarDaoFacade {
	private CarDao carDao = new CarDao();
	private CarDaoV2 carDaoV2 = new CarDaoV2();

	public Car read (Integer id) {
		try {
			return carDaoV2.read(id);
		} catch (IllegalArgumentException e) {
				Car car = carDao.read(id);
				carDaoV2.save(car);
				return car;
		}
	}

	public void save(Car car) {
		carDaoV2.save(car);
	}
}
