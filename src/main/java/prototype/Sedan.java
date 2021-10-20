package prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Sedan extends Car {

	private Integer numOfDoors;

	public Sedan(String model, Integer numOfPlaces, Integer price, Integer year, Integer numOfDoors) {
		super(model, numOfPlaces, price, year);
		this.numOfDoors = numOfDoors;
	}

	private Sedan(Sedan sedan) {
		super(sedan);
		if (Objects.nonNull(sedan)) {
			this.numOfDoors = sedan.getNumOfDoors();
		}
	}

	@Override
	public Sedan clone() {
		return new Sedan(this);
	}

	public void show() {
		System.out.print(super.toString());
		System.out.println(this.toString());
	}

}
