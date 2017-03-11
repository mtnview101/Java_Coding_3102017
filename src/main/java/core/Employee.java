package core;

/**
 * parameter passing
 *
 */
public class Employee {
	String name; // instance variable
	public Employee(String n){name=n;} //constructor
	public void printName(){System.out.println(name);} // instance method
	public static void main( String[] args ){
		Employee e=new Employee("Dmitry Nakhabtsev");// new object instantiation
		e.printName(); //object printing by instance method
}
}
