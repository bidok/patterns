package adapter;

public class CarService {

	private GenericDao dao = new CarDaoAdapter();

	public void find() {
		dao.find();
	}
}
