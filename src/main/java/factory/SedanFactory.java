package factory;

public class SedanFactory implements CarFactory {

	@Override
	public Car createCar(String marka, Integer numOfDoors) {
		return new Sedan(marka, numOfDoors);
	}
}
