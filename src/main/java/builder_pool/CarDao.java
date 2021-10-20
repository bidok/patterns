package builder_pool;

public class CarDao {
	public static Car getById(Integer id) {
		try {
			return CarPool.getCar(id);
		} catch (Exception exception) {
			return new CarBuilder(id).build();
		}
	}
}
