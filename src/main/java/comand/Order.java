package comand;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Order {
	private String status = "waiting";
	private int price;
	private Car car;

	public Order(Car car) {
		this.car = car;
	}
}
