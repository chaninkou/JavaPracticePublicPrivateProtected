package lesson3;

public class Main {

	public static void main(String[] args) {
		Student person1 = new Student();
		
		System.out.println(person1.howMuch());
		
		System.out.println(person1.toString());
		
		// I could use dad because it is public and not private
		person1.dad = 1;

		// person1.mom will not work because of private
	}

}
