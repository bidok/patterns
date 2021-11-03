package comand;

public class OrderController {
	private OrderCommand orderCommand;
	public Order doAction(String command, Order order) {
		switch (command) {
		case "save" : orderCommand = new OrderSaver();
			break;
		case "cancel" : orderCommand = new OrderCanceller();
			break;
		case "process" : orderCommand = new OrderProcess();
			break;
		}
		return orderCommand.execute(order);
	}
}
