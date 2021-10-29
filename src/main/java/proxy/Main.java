package proxy;

import builder_pool.Car;
import builder_pool.CarBuilder;

public class Main {
	public static void main(String[] args) {
		CarDao carDao = new CarDao();
		CarDaoCache carDaoCache = new CarDaoCache();
		CarService carService = new CarService();
		Car car = new CarBuilder(1).build();
		carDao.showCart();
		carDaoCache.showCache();
		carService.getCar(car.getId());
		System.out.println("=======================");
		carDaoCache.showCache();
	}


}
