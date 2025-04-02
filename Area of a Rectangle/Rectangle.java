import java.lang.*;

public class Rectangle
{
    private double length;
    private double width;
	
	public void setLength(double length) 
	{
        if (length > 0) {
            this.length = length;
        } else {
            System.out.println("Length must be positive!");
        }
    }

    public double getLength() 
	{
        return length;
    }
	
	public void setWidth(double width) 
	{
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Width must be positive!");
        }
    }

    public double getWidth() 
	{
        return width;
    }

    public double calculateArea() 
	{
        return length * width;
    }

    public static void main(String[] args) 
	{
        Rectangle rect = new Rectangle();
	
        rect.setLength(5);
        rect.setWidth(2);
		
        System.out.println("Area of Rectangle: " + rect.calculateArea());
    }
}
