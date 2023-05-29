package javagrooming;

public class Employee1 {

	 private int empId;
	 private String empName;
	  private double empSal;
	
	public Employee1(int id, String name, double sal) {
		this.empId = id;
		this.empName = name;
		this.empSal = sal;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	@Override
	public String toString() {
		return "Employee1 [getEmpId()=" + getEmpId() + ", getEmpName()=" + getEmpName() + ", getEmpSal()=" + getEmpSal()
				+ "]";
	}
	
}

