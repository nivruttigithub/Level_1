/*Write a Java program to create a class called "Shirt" with instance variables "size,"
 *  "color," and "price." Include a method to calculate the discount on the shirt with 
 *  instance variables "size," "color," and "price." Include a method to calculate the
 *   discount on the shirt based on  its size and a method to print the shirt's size, 
 *   color, and discounted price*/


package level_1;

public class Shirt {
	private String size;
	private String color;
	private double price;

	public Shirt(String size, String color, double price) {
		this.size = size;
		this.color = color;
		this.price = price;
	}

	public double calculateDiscount() {
		double discount = 0.0;

		switch (size.toLowerCase()) {
		case "small":
			discount = 0.05; // 5% 
			break;
		case "medium":
			discount = 0.10; // 10% 
			break;
		case "large":
			discount = 0.15; // 15% 
			break;
		case "x-large":
			discount = 0.20; // 20% 
			break;
		default:
			discount = 0.00; // No discount 
			break;
		}

		return price * discount;
	}

	public void printShirtDetails() {
		double discount = calculateDiscount();
		double discountedPrice = price - discount;

		System.out.println("Size: " + size);
		System.out.println("Color: " + color);
		System.out.println("Original Price: $" + price);
		System.out.println("Discounted Price: $" + discountedPrice);
	}

	public static void main(String[] args) {
		
		Shirt myShirt = new Shirt("Medium", "Blue", 50.0);

		myShirt.printShirtDetails();
	}

}
