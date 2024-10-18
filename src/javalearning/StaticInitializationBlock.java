package javalearning;

//These blocks are used to initialize static variables. They are executed once when 
//the class is loaded into memory, before any static methods are called or any static variables are accessed.
public class StaticInitializationBlock {

	public static void main(String[] args) {
		System.out.println("Inside the main");
		Employee s1 = new Employee();
		Employee s = new Employee(1, "Drishti", "3rd");
		System.out.print(s.toString());

	}

}

class Employee {
	private int id;
	private String name;
	private String className;

	static {
		System.out.println("Inside the block");

	}

	public Employee(int id, String name, String className) {
		System.out.println("Inside the paramertized consutrutor");
		this.id = id;
		this.name = name;
		this.className = className;
	}

	public Employee() {
		System.out.println("Inside default constructor");
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", className=" + className + "]";
	}

}
