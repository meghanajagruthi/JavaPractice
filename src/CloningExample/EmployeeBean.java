
public class EmployeeBean implements Cloneable {

	private int employeeId;
	private String employeeName;
	private DepartmentBean associatedDepartment;
	public EmployeeBean(int id, String name, DepartmentBean dept)
    {
        this.employeeId = id;
        this.employeeName = name;
        this.associatedDepartment = dept;
    }
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public DepartmentBean getAssociatedDepartment() {
		return associatedDepartment;
	}
	public void setAssociatedDepartment(DepartmentBean associatedDepartment) {
		this.associatedDepartment = associatedDepartment;
	}
	
	public Object clone() throws CloneNotSupportedException{
		EmployeeBean newEmployee=(EmployeeBean)super.clone();
		newEmployee.setAssociatedDepartment((DepartmentBean)newEmployee.getAssociatedDepartment().clone());
		return newEmployee;
	}
}
