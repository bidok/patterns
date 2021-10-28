package flyweight;

public class Main {
	public static void main(String[] args) {
		CarCache.showCash();
		Order order = new Order(1, "1234567", 1, "mazda", 120, 6, "red", 2004);
		CarCache.showCash();
	}
}
