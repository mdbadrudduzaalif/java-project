import java.lang.*;
import java.util.*;
public class Vol_Area{
	private double length;
	private double width;
	private double height;
	public double volumec;
	public double areac;
public void vsInfo(double length,double width,double height){
	if(length>0&&width>0&&height>0){
	this.length=length;
	this.width=width;
	this.height=height;}
	else {System.out.println("Value can not be negative");}
}
public void asInfo(double length,double width){
	if (length>0&&width>0){
		this.length=length;
		this.width=width;
	}
	else{System.out.println("Value can not be negative");}
}
public double volumec(){
	return length*width*height;
}
public double areac(){
	return length*width;
}
public void aInfo(){
	if (length>0&&width>0){
		System.out.println("length :"+length);
		System.out.println("width :"+width);
		System.out.println("area :"+areac());}
	else{return;}
}
public void vInfo(){
	if(length>0&&width>0&&height>0){
	System.out.println("length :"+length);
	System.out.println("width :"+width);
	System.out.println("height :"+height);
	System.out.println("volume :"+volumec());}
	else{return;}
}
public static void aMain(){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter length :");
	double length = sc.nextDouble();
	System.out.print("Enter width :");
	double width = sc.nextDouble();
	Vol_Area v=new Vol_Area();
	
	v.asInfo(length,width);
	v.aInfo();
	
}
public static void vMain(){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter length :");
	double length = sc.nextDouble();
	System.out.print("Enter width :");
	double width = sc.nextDouble();
	System.out.print("Enter height :");
	double height = sc.nextDouble();
	Vol_Area v=new Vol_Area();	
	
	v.vsInfo(length,width,height);
	v.vInfo();
	
}
public static void main (String[]args){
	boolean x=true;
	Scanner sc = new Scanner(System.in);
	System.out.println("Hello! Welcome to the Volume & Area calculator.");
	while(x==true){
	System.out.println("What do want to calculate?(volume/area)[this input is case sensitive]");
	String obj = sc.next();
	
	if(obj.equals("volume")){vMain();}
	
	else if(obj.equals("area")){aMain();}
	
	else {System.out.println("input can be only volume or area.");}
	
	System.out.println("Do you want to calculate another object?(yes/no)");
	String con = sc.next();
	if (con.equals("no")){x=false;}
	
}
sc.close();
}
}