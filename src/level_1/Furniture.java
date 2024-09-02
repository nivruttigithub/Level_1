/*Write a Java program to create a class called "Furniture" with instance variables
 *  "type," "material," and "price." Include a method to calculate the discount on the 
 *  furniture based on its material and a method to print the furniture's type, material,
 *   and discounted price.*/

package level_1;

public class Furniture {
	private String type;
    private String material;
    private double price;
    
    public Furniture(String type, String material, double price) {
        this.type = type;
        this.material = material;
        this.price = price;
    }
    
    public double calculateDiscount() {
        double discount = 0.0;

        switch (material.toLowerCase()) {
            case "wood":
                discount = 0.10; // 10% 
                break;
            case "metal":
                discount = 0.05; // 5% 
                break;
            case "plastic":
                discount = 0.15; // 15% 
                break;
            default:
                discount = 0.00; // No discount 
                break;
        }

        return price * discount;
    }
    
    public void printFurnitureDetails() {
        double discount = calculateDiscount();
        double discountedPrice = price - discount;

        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Original Price: $" + price);
        System.out.println("Discounted Price: $" + discountedPrice);
    }
    
    public static void main(String[] args) {
        
        Furniture myFurniture = new Furniture("Chair", "Wood", 150.0);

        myFurniture.printFurnitureDetails();
    }
    
}
