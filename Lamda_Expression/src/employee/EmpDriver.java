package employee;

public class EmpDriver{

	public static void main(String[] args) {
		
		Greetings e1 = () -> System.out.println("Hello...  glad to see yoy...!");
		Greetings e2 = new Employee("Mahan");
		Greetings e3 = new Employee("Vikas");
		e2.welcome();
		e1.welcome();
		e3.welcome();
	}
}
