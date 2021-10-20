package decorator;

public class CarDaoDecorator implements GenericDao {
	protected CarDao carDao;

	public CarDaoDecorator(CarDao carDao) {
		this.carDao = carDao;
	}

	@Override
	public void get() {
		carDao.get();
	}

	@Override
	public void save() {
		carDao.save();
	}
}
