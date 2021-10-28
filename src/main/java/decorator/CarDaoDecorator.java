package decorator;

public class CarDaoDecorator implements GenericDao {

	private final CarDao carDao = new CarDao();

	@Override
	public void get() {
		carDao.get();
	}


}
