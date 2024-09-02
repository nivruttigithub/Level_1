/*Write a Java program to create a class called "TV" with instance variables "brand," 
 * "size," and "price." Include a method to calculate the discount on the TV based on 
 * its size and a method to print the TV's brand, size, and discounted price.*/

package level_1;

public class TV {
	private String brand;
	private int size;
	private double price;

	public TV(String brand, int size, double price) {
		this.brand = brand;
		this.size = size;
		this.price = price;
	}

	public double calculateDiscount() {
		double discount;
		if (size >= 55) {
			discount = 0.20; // 20%
		} else if (size >= 40) {
			discount = 0.10; // 10%
		} else {
			discount = 0.50; // 5%
		}
		return price * discount;

	}

	public double getDiscountedPrice() {
		double discountedPrice = price - calculateDiscount();
		return discountedPrice;

	}

	public void printTVDetails() {
		System.out.println("TV Brand: " + brand);
		System.out.println("TV Size: " + size + " inches");
		System.out.println("Original Price: $" + price);
	}

	public static void main(String[] args) {
		// Create TV objects with different configurations
		TV tv1 = new TV("Samsung", 65, 1200.0);
		TV tv2 = new TV("LG", 50, 800.0);
		tv1.printTVDetails();
		System.out.println("Discounted Price : " + tv1.getDiscountedPrice());
		System.out.println();
		tv2.printTVDetails();
		System.out.println("Discounted Price : " + tv2.getDiscountedPrice());
	}
}
