package factory;

public class MinivanFactory implements CarFactory {

	@Override
	public Car createCar(String marka, Integer numOfPlaces) {
		return new Minivan(marka, numOfPlaces);
	}
}
