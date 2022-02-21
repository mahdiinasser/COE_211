import java.util.Scanner;
public class EntryPoint {
	public static void main (String [] args) {
	
	
	Employee employee = new Employee();
	
	
	int a = (int)  (Math.random()*10+1);
	
	System.out.println("You have " + a + " insertions left.");
	
	for (int i=a; i>0; i--){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please input the employee's first name: ");
		String firstName = scan.nextLine();
		employee.getFirstName();
	
		System.out.println("Please input the employee's last name: ");
		employee.getLastName();
		String lastName = scan.nextLine();
	
		System.out.println("Please input the employee's age: ");
		employee.getAge();
		int age = scan.nextInt();
	
		System.out.println("Please input the employee's monthly salary: ");
		employee.getMonthlySal();
		double monthlysal = scan.nextDouble();
	
		System.out.println("Employee information: " + firstName + " " + lastName + ", " + age + ", " + monthlysal);
		System.out.println("You have " + (i-1) + " insertions left.");
	}
	}
}