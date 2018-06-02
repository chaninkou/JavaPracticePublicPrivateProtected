package lesson3;

public class Main {

	public static void main(String[] args) {
		Student person1 = new Student();
		
		System.out.println(person1.printThis());
		
		// It works here because it's on the same package
		System.out.println(person1.printAnotherOne());
		
		// I could use dad because it is public and not private
		person1.a = 1;
		person1.b = 2;
		person1.c = 3;
		// person1.d does not work because it's private
		
	}

}
