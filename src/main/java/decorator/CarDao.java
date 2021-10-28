package decorator;

public class CarDao implements GenericDao{
	@Override
	public void get() {
		System.out.println("car was gotten");
	}

}
