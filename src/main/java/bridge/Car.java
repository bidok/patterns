package bridge;

public abstract class Car {
	protected CarBody carBody;

	public Car(CarBody carBody) {
		this.carBody = carBody;
	}

	public abstract void run();
}
