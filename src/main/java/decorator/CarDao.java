package decorator;

public class CarDao implements GenericDao{
	@Override
	public void get() {
		System.out.println("car gotten");
	}

	@Override
	public void save() {
		System.out.println("car saved");
	}
}
