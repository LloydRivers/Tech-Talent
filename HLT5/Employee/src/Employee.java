public class Employee {
	int eid;
	String ename;
	double salary;
	String email;
	String department;
	
//	Default constructor
	Employee(){
		 eid = 0;
		 ename = null;
		 salary = 0.0;
		 email = null;
		 department = null;
		
	}
	
	
	public int getEid() {
		return this.eid;
	}
	public String getEname() {
		return this.ename;
	}
	public double getSalary() {
		return this.salary;
	}
	public String getEmail() {
		return this.email;
	}
	public String getDepartment() {
		return this.department;
	}
	
	
//	These are the setter methods
	public void setEid(int eid) {
		this.eid = eid; 
	}
	public void setEname(String ename) {
		this.ename = ename; 
	}
	public void setSalary(double salary) {
		this.salary = salary; 
	}
	public void setEmail(String email) {
		this.email = email; 
	}
	public void setDepartment(String department) {
		this.department = department; 
	}
	
	public void display() {
		System.out.println("Employee id is " + this.eid + ".");
		System.out.println("Employee name is " + this.ename + ".");
		System.out.println("Employee salary is " + this.salary + ".");
		System.out.println("Employee email is " + this.email + ".");
		System.out.println("Employee department is " + this.department + ".");
	}
	
	public static void main(String[] args) {
		
		Employee Manager = new Employee();
		
		Manager.setEid(1);
		Manager.setEname("John");
		Manager.setSalary(19.0);
		Manager.setEmail("J.Doe@CS.com");
		Manager.setDepartment("CS");
		Manager.display();
		

}
}

