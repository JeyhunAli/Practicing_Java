package Oractising;

public class Human {

	String name;
	int age;
	int heightInInches;
	String eyeColor;

	public Human(String name, int age, int heightInInches, String eyeColor) {

		this.name = name;
		this.age = age;
		this.heightInInches = heightInInches;
		this.eyeColor = eyeColor;
	}

	public void Speak() {
		System.out.println("Hello my name is: " + name);
		System.out.println("my age is: " + age);
		System.out.println("my height is: " + heightInInches);
		System.out.println("my eye color is : " + eyeColor);

	}

	public void eat() {
		System.out.println("Hello im able to eat whatever you have :):) ");
	}

	public void walk() {
		System.out.println("hello lets Walk");
	}

	public void work() {
		System.out.println("hello lets work");
	}
}
