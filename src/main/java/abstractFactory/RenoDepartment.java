package abstractFactory;

public class RenoDepartment implements Department{

	@Override
	public Minivan createMinivan() {
		return new RenoMinivan();
	}

	@Override
	public Sedan createSedan() {
		return new RenoSedan();
	}
}
