package factory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Sedan extends Car{
	private Integer numOfDoors;

	public Sedan(String marka, Integer numOfDoors) {
		super(marka);
		this.numOfDoors = numOfDoors;
	}
}
