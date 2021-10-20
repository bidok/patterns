package decorator;

public class CarService {
	CarDao carDao = new CarDao();

	public void get() {
		carDao.get();
	}

	public void save() {
		carDao.save();
	}

	public void getBySpecificField() {
		CarDaoGettingDecorator carDaoGettingDecorator = new CarDaoGettingDecorator(carDao);
		carDaoGettingDecorator.getBySpecificField();
	}
}
