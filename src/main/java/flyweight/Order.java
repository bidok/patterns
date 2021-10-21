package flyweight;

import builder_pool.Car;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Order {
	private Integer id;
	private String number;
	private Car car;

	public Order(Integer id, String number, Integer carId, String marka, Integer maxSpeed, Integer numOfPlaces, String color, Integer year) {
		this.id = id;
		this.number = number;
		this.car = CarCash.getCar(carId, marka, maxSpeed, numOfPlaces, color, year);
	}
}
