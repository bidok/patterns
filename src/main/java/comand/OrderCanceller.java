package comand;

public class OrderCanceller implements OrderCommand{
	@Override
	public Order execute(Order order) {
		order.setStatus("Canceled");
		return order;
	}
}
