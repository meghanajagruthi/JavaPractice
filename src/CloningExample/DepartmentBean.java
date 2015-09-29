
public class DepartmentBean implements Cloneable{
	
	private int departmentId;
	private String departmentName;
	
	public DepartmentBean(int id, String name)
    {
        departmentId = id;
        departmentName = name;
    }
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

}
