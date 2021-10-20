package builder_pool;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Car {
	private Integer id;
	private String marka;
	private Integer maxSpeed;
	private Integer numOfPlaces;
	private String color;
	private Integer year;
}
