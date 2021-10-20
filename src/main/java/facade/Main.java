package facade;

public class Main {
	public static void main(String[] args) {
		CarDaoFacade facade = new CarDaoFacade();
		CarDaoV2 carDaoV2 = new CarDaoV2();
		carDaoV2.showDB();
		facade.read(1);
		System.out.println("=============================");
		carDaoV2.showDB();
	}
}
