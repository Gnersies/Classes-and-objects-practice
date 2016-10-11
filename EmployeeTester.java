
public class EmployeeTester {
	public static void main(String[] args) {
		Employee harry = new Employee("Hacker, Harry", 50000);
		harry.raiseSalary(10); // Harry gets a 10 percent raise
		System.out.println("Employee " + harry.getName() + " has a salary of " + harry.getSalary() + " dollars per year");
	}}


