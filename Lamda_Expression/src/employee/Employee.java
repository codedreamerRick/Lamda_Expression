package employee;

public class Employee implements Greetings{

	String name;

	public Employee(String name) {
		super();
		this.name = name;
	}
	
	public void welcome()
	{
		System.out.println("Hello... "+name);
	}
}
