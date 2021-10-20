package prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public abstract class Car implements Cloneable {
	private String model;
	private Integer numOfPlaces;
	private Integer price;
	private Integer year;

	public Car(Car car) {
		if (Objects.nonNull(car)) {
			this.model = car.getModel();
			this.numOfPlaces = car.getNumOfPlaces();
			this.price = car.getPrice();
			this.year = car.year;
		}
	}


	public abstract Car clone();
}
