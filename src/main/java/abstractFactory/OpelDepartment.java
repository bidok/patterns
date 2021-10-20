package abstractFactory;

public class OpelDepartment implements Department{

	@Override
	public Minivan createMinivan() {
		return new OpelMinivan();
	}

	@Override
	public Sedan createSedan() {
		return new OpelSedan();
	}
}
