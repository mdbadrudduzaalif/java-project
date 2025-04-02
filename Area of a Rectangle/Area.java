import java.lang.*;
public class Area{
	private double width;
	private double length;
	public double area;
	public void setInfo(double width,double length){
		this.width=width;
		this.length=length;
	}
	public double getLength(){
		return length;
	}
	public double getWidth(){
		return width;
	}
	public double area(){
		return length*width;
	}
	public void displayInfo(){
		System.out.println("width : "+getWidth());
		System.out.println("length : "+getLength());
		System.out.println("total area = "+area());
	}
	public static void main (String[]args){
		 Area a1=new Area();
		 a1.setInfo(6.3,8.9);
		 a1.displayInfo();
		 
	}
}