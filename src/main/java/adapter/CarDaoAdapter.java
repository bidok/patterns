package adapter;

public class CarDaoAdapter extends CarDaoV2 implements GenericDao{

	@Override
	public void find() {
		newFindMethod();
	}
}
