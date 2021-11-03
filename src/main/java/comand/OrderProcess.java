package comand;

import java.util.Random;

public class OrderProcess implements OrderCommand{

	@Override
	public Order execute(Order order) {
		order.setStatus("processed");
		Random random = new Random();
		order.setPrice(order.getCar().getPrice() * random.nextInt(100));
		return order;
	}
}
