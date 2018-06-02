package lesson3b;

// Always need import if it's from another package
import lesson3.Student;

public class Main2 {

	public static void main(String[] args) {
		Student person1 = new Student();
		
		System.out.println(person1.printThis());
		
		
		// System.out.println(person1.printAnotherOne()); Does not work because it's not public method
		
		// Only person1.b work because it's public
		person1.b = 2;
		// person1.a person1.c person1.d does not work


	}


}
