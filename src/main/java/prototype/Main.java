package prototype;

import lombok.Builder;

@Builder
public class Main {
	public static void main(String[] args) {
		Sedan car1 = new Sedan("nissan", 6, 1000, 2004, 4);
		car1.show();
		Sedan car2 = car1.clone();
		car2.setYear(2006);
		car2.setPrice(1500);
		car2.show();
		car1.show();
	}
}
