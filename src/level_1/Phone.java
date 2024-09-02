/*Write a Java program to create a class called "Phone" with instance variables "make,
 * " "model," and "storage." Include a method to calculate the price of the phone 
 * based on the make, model, and storage capacity and a method to print the 
 * phone's make, model, and storage capacity.
*/


package level_1;

public class Phone {
private String make;
private String model;
private int storage;

public Phone(String make,String model,int  storage)
{
	this.make=make;
	this.model=model;
	this.storage=storage;
}
public double calculatePhonePrice()
{
	double basePrice;
	switch(make.toLowerCase())
	{
	case "apple":
		basePrice=800;
		break;
	case "samsung":
		basePrice=700;
		break;
	case "redmi":
		basePrice=600;
		break;
    default:
    	basePrice=500;
    	break;
	}
	if(storage>128)
	{
		basePrice=basePrice+200;
	}
	else if(storage>64)
	{
		basePrice=basePrice+100;
	}
	return basePrice;
}

public void printPhoneDetails()
{
	System.out.println("Phone Make : "+make);
	System.out.println("Phone Model : "+model);
	System.out.println("Phone Storage : "+storage+" GB");
}
public static void main(String args[])
{
	Phone p1 = new Phone("SamSung","iPhone",256);
	Phone p2 = new Phone("Apple","Pixel 6",64);
	p1.printPhoneDetails();
	System.out.println("Phone Price is : "+p1.calculatePhonePrice());
	System.out.println();
	p2.printPhoneDetails();
	System.out.println("Phone Price is : "+p2.calculatePhonePrice());
	
}
}
