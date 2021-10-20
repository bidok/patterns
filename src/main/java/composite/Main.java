package composite;

public class Main {
	public static void main(String[] args) {
		Department nissanDepartment = new NissanDepartment();
		Department opelDepartment = new OpelDepartment();
		MainDepartment mainDepartment = new MainDepartment(nissanDepartment, opelDepartment);
		Report report = new Report(mainDepartment);
		report.showReport();
	}
}
