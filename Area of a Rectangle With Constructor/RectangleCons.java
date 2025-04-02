import java.lang.*;

class Rectangle 
{
    private double length;
    private double width;
	
    public Rectangle(double length, double width) 
	{
        this.length = length;
        this.width = width;
    }
    public double calculateArea() 
	{
        return length * width;
    }
}

// Main Class
public class RectangleCons
{
    public static void main(String[] args) 
	{
        Rectangle rect = new Rectangle(3,2);
		
        System.out.println("Area of Rectangle: " + rect.calculateArea());	
    }
}
