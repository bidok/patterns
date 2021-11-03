package chaneofresponsibility;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public abstract class OrderPerformer {
	protected OrderPerformer next;

	public abstract void process(Order order);
}
