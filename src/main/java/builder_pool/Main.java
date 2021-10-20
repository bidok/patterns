package builder_pool;

public class Main {
	public static void main(String[] args) {
		Car car = new CarBuilder(1)
				.setMarka("opel")
				.setColor("red")
				.setMaxSpeed(150)
				.build();
		Car car1 = new CarBuilder(2)
				.setMarka("reno")
				.setMaxSpeed(100)
				.setNumOfPlaces(5)
				.setYear(2005).build();
		CarPool.getCars().forEach(System.out::println);
		System.out.println("====================");
		System.out.println(CarController.getById(1));
	}
}
