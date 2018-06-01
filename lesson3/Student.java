package lesson3;

public class Student {
	// Could only be able to use in class
	// Only the method in this class could use private
	private int money = 1;
	
	// Also java will use the private variable instead of the variable in the method or constructor
	private int mom = 2;
	
	// public modifier could use in class, package, subclass and world
	public int dad = 3;
	
	// this is no modifier, so you could use this in class or package
	int brother = 6;
	// Never use the variable name
	public void setMoney(int money, int mom){
		money = 4;
		mom = 5;
	}
	
	
	
	public String howMuch(){
		return "" + money;
	}
	
	public String toString(){
		return "" + mom;
	}
}
