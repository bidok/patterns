package singleton;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Car {
	private String model;
	private Integer numOfPlaces;
	private Double price;
	private Integer year;
}
