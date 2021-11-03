package chainofresponsibility;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class OrderProcessing extends OrderPerformer {
	public OrderProcessing(OrderPerformer next) {
		super(next);
	}

	@Override
	public void process(Order order) {
		order.setStatus("Processed");
		System.out.println(order);
		if (this.getNext() != null) {
			this.getNext().process(order);
		}
	}
}
