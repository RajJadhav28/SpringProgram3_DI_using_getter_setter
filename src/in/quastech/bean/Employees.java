package in.quastech.bean;

public class Employees {
	private int empId;
	private String empname;
	private Address add;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	
	
	public void display() {
		System.out.println("EmpId:"+empId);
		System.out.println("EmpName:"+empname);
		System.out.println("EmpAddress:"+add);
	}

}
