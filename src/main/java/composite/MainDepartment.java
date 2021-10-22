package composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainDepartment implements Department{
	private List<Department> departments;

	public MainDepartment(Department... department) {
		departments = new ArrayList<>(Arrays.asList(department));
	}

	public void addDepartment(Department department) {
		departments.add(department);
	}

	public void removeDepartment(Department department) {
		departments.remove(department);
	}

	@Override
	public String createReport() {
		StringBuilder mainReport = new StringBuilder("main department report \n");
		departments.forEach(item -> mainReport.append(item.createReport()).append("\n"));
		return mainReport.toString();
	}
}
