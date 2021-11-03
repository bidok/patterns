package chaneofresponsibility;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class OrderSaver extends OrderPerformer{

	public OrderSaver(OrderPerformer next) {
		super(next);
	}

	@Override
	public void process(Order order) {
		order.setStatus("Saved");
		System.out.println(order);
		if (this.getNext() != null) {
			this.getNext().process(order);
		}
	}
}
