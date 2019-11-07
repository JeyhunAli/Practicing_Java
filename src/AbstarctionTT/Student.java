package AbstarctionTT;



public class Student extends AbstractionPerson {

	public static void main(String[] args) {

		 Student s1 = new Student();
		 s1.speak();
		 s1.walk();
		 

	}

	@Override
	void walk() {
		System.out.println("i can walk");
		
		
	}
	

}
