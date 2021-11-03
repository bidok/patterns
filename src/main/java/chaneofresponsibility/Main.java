package chaneofresponsibility;

public class Main {
	public static void main(String[] args) {
		Order order = new Order("waiting");
		OrderPerformer orderPerformer = new OrderCreator(new OrderProcessing(new OrderSaver()));
		orderPerformer.process(order);
	}
}
