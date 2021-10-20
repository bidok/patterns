package composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Report {
	List<Department> departments;

	public Report(Department... department) {
		departments = new ArrayList<>(Arrays.asList(department));
	}

	public void addDepartment(Department department) {
		departments.add(department);
	}

	public void removeDepartment(Department department) {
		departments.remove(department);
	}

	public void showReport() {
		departments.stream().map(Department::createReport).forEach(System.out::println);
	}
}
