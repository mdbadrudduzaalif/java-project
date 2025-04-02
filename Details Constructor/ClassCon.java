import java.lang.*;
public class ClassCon
{
private double width;
private double length;
private double height;

public void setInfo(double l,double w,double h){
	length=l;
	width=w;
	height=h; 
}

public void displayInfo(){
	System.out.println("length= "+length);
	System.out.println("width= "+width);
	System.out.println("height= "+height);
}
public static void main(String[]args){
	ClassCon c1= new ClassCon();
	c1.setInfo(1.2,2.3,3.4);
	c1.displayInfo();
}
}