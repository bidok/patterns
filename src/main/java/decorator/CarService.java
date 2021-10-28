package decorator;

public class CarService {
	GenericDao carDao = new CarDaoGettingDecorator();

	public void get() {
		carDao.get();
	}

	public void getBySpecificField() {
		CarDaoGettingDecorator carDaoGettingDecorator = (CarDaoGettingDecorator)carDao;
		carDaoGettingDecorator.getBySpecificField();
	}
}
