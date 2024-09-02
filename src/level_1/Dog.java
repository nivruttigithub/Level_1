//Write a Java program to create a class called "Dog" with instance variables "breed,"
//"age," and "weight." Include a method to calculate the dog's age in human years and
//a method to print the dog's breed, age, and weight.

//By Using Constructor

package level_1;

public class Dog {
	private String breed;
	private int age;
	private int weight;

	public Dog(String breed, int age, int weight) {
		this.breed = breed;
		this.age = age;
		this.weight = weight;
	}

	public double calcAgeInHumanYears() {
		double ageInHumanYr = age * 7;
		return ageInHumanYr;
	}

	public void printDogsDetails() {
		System.out.println("Breed : " + breed);
		System.out.println("Age : " + age);
		System.out.println("Weight : " + weight);
	}

	public static void main(String args[]) {
		Dog d = new Dog("Labrador", 5, 15);
		d.printDogsDetails();
		System.out.println("Dog's Age in Human Year :" + d.calcAgeInHumanYears());
	}
}
