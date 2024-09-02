//Write a Java program to create a class called "Circle" with an instance variable 
//"radius." Include a method to calculate the area of the circle and a method 
//to calculate the circumference of the circle.

//By Using Class & Object

package level_1;
public class Circle {
	private int radius;
	
	public double calculateArea(int radius)
	{
		double area = 3.14*radius*radius;
		return area;
	}
	public double calculateCircumference(int radius)
	{
		double circumference = 2*3.14*radius;
		return circumference;
	}
public static void main(String args[])
{
	Circle c = new Circle();
	System.out.println("Area Of Circle is "+c.calculateArea(2));
    System.out.println("Circumference Of Circle is :"+c.calculateCircumference(2));	
}
}
