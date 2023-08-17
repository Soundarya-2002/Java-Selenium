package week1.day3;

public class EmployeeDetails {
	public void EmployeeName(String EmployeeName) {
		System.out.println("EmployeeName= "+EmployeeName);
	}
	public void EmployeeId(int EmployeeId) {
		System.out.println("EmployeeId= "+EmployeeId);
	}
	public void EmployeeSalary(long EmployeeSalary) {
		System.out.println("EmployeeSalary= "+EmployeeSalary);
	}
	public void EmployeeAddress(String EmployeeAddress) {
		System.out.println("EmployeeAddress= "+EmployeeAddress);
	}
	public static void main(String[]args) {
		EmployeeDetails details=new EmployeeDetails();
		details.EmployeeName("Sowmya");
		details.EmployeeId(986);
		details.EmployeeSalary(30000);
		details.EmployeeAddress("Coimbatore");
		EmployeeDetails details2=new EmployeeDetails();
		details2.EmployeeName("Moni");
		details2.EmployeeId(7886);
		details2.EmployeeSalary(40000);
		details2.EmployeeAddress("Theni");
	}

}
