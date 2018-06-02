package lesson3;

// Term: access modifiers: default, public, private, and protected

// Only public or default, but mostly it's public, (class Student) will not work for a class from another package
public class Student {
	
	// This is no modifier, so you could use this in this class or this package (this is default)
	int a = 1;
	
	// This is visible to the WORLD
	public int b = 2;
	
	// This is visible to package and all subclasses
	protected int c = 3;
	
	// Could only be able to use in class
	// Only the method in this class could use private
	private int d = 4;
	
	
	// Never use the variable name
	public void setMoney(int a, int b){
		a = 4;
		b = 5;
	}
	
	// Mostly set method to public, but variable will be private
	public int printThis(){
		return a + b + c + d;
	}
	
	int printAnotherOne(){
		return a;
	}

}
