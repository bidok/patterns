package singleton;

public class Main {
	public static void main(String[] args) {
		Car car = Car.builder()
				.model("nissan")
				.numOfPlaces(6)
				.price(1000.0)
				.year(2004)
				.build();

		CarDao carDao1 = CarDao.getInstance();
		carDao1.save(car);
		carDao1.show();
		CarDao carDao2 = CarDao.getInstance();
		carDao2.show();
	}
}
