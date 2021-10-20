package factory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Minivan extends Car{
	private Integer numOfPlaces;

	public Minivan(String marka, Integer numOfPlaces) {
		super(marka);
		this.numOfPlaces = numOfPlaces;
	}
}
