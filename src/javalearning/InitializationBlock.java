package javalearning;

//Always initialization block will be called first when we create the object before constructor called 
//either parametaized or non-paremtaerised
//These blocks are used to initialize instance variables. They are executed each 
//time an instance of the class is created, just before the constructor is called.
public class InitializationBlock {
	
	public static void main(String[] args) {
		System.out.println("Inside the main");
		Student s1= new Student();
		Student s = new Student(1,"Drishti","3rd");
		System.out.print(s.toString());
	}
}

class Student {
	private int id;
	private String name;
	private String className;
	

	{
		this.id =1;
		this.name="Aditya";
		this.className="3rd";
		System.out.println("Inside the block");
	
	}

	public Student(int id, String name, String className) {
		System.out.println("Inside the paramertized consutrutor");
		this.id = id;
		this.name = name;
		this.className = className;
	}

	

	public Student() {
		System.out.println("Inside default constructor");
	}



	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", className=" + className + "]";
	}
	
	
}
