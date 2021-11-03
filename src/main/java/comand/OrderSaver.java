package comand;

public class OrderSaver implements OrderCommand{

	@Override
	public Order execute(Order order) {
		order.setStatus("saved");
		OrderDao.save(order);
		return null;
	}
}
