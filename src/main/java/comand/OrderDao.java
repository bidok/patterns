package comand;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.ArrayList;
import java.util.List;

public class OrderDao {
	private static final List<Order> db = new ArrayList<>();

	public static void save(Order order) {
		db.add(order);
	}

	public static void showDB() {
		System.out.println(db);
	}
}
