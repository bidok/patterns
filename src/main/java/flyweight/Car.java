package flyweight;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Car {
	private String name;
	private CarType carType;
	private Integer maxSpeed;

	public Car(String name, String carBody, Integer numOfDoors, Integer maxSpeed) {
		this.name = name;
		carType = CarTypeCache.getCarType(carBody, numOfDoors);
		this.maxSpeed = maxSpeed;
	}
}
