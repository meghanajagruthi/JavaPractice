public class TestClonability {

	public static void main(String[] args) throws CloneNotSupportedException {
		DepartmentBean hr = new DepartmentBean(1, "Human Resource");
		EmployeeBean original = new EmployeeBean(1, "Admin", hr);
		EmployeeBean cloned = (EmployeeBean) original.clone();

		// Let change the department name in cloned object and we will verify in
		// original object
		cloned.getAssociatedDepartment().setDepartmentName("Finance");
		System.out.println(cloned.getAssociatedDepartment().getDepartmentName());
		System.out.println(original.getAssociatedDepartment().getDepartmentName());
	

	}
}
