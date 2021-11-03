package comand;

public class Main {
	public static void main(String[] args) {
		Order order = new Order(new Car("mazda", 200));
		OrderController orderController = new OrderController();
		orderController.doAction("process", order);
		System.out.println(order);
		orderController.doAction("save", order);
		OrderDao.showDB();
		orderController.doAction("cancel", order);
		System.out.println(order);
	}
}
