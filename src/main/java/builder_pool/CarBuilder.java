package builder_pool;


public class CarBuilder {
	private Integer id;
	private String marka = null;
	private Integer maxSpeed = null;
	private Integer numOfPlaces = null;
	private String color = null;
	private Integer year = null;

	public CarBuilder(Integer id) {
		this.id = id;
	}

	public CarBuilder setMarka(String marka) {
		this.marka = marka;
		return this;
	}

	public CarBuilder setMaxSpeed(Integer maxSpeed) {
		this.maxSpeed = maxSpeed;
		return this;
	}

	public CarBuilder setNumOfPlaces(Integer numOfPlaces) {
		this.numOfPlaces = numOfPlaces;
		return this;
	}

	public CarBuilder setColor(String color) {
		this.color = color;
		return this;
	}

	public CarBuilder setYear(Integer year) {
		this.year = year;
		return this;
	}

	public Car build() {
		try {
			return CarPool.getCar(this.id);
		} catch (Exception e) {
			Car car = new Car(id, marka, maxSpeed, numOfPlaces, color, year);
			return CarPool.addCar(car);
		}
	}
}
