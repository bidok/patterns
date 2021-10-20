package builder_pool;

public class CarController {
	public static Car getById(Integer id) {
		return CarDao.getById(id);
	}
}
