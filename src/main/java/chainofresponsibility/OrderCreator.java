package chainofresponsibility;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class OrderCreator extends OrderPerformer{
	public OrderCreator(OrderPerformer next) {
		super(next);
	}

	@Override
	public void process(Order order) {
		order.setStatus("Created");
		System.out.println(order);
		if (this.getNext() != null) {
			this.getNext().process(order);
		}
	}
}
