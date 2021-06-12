package inheritance;

public class Main {
	
		//inheritance notlarý.
	

	public static void main(String[] args) {
		
		Customer customer=new Customer();
		Employee employee=new Employee();
		customer.age = 31;
		employee.firtsName = "Ahmet";
		
		
		CustomerManager customermanager = new CustomerManager();
		EmployeeManager employeemanager = new EmployeeManager();
		
		customermanager.List();
		employeemanager.Add();
		
		

	}

}
