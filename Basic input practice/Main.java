import java.lang.*;
import java.util.*;
public class Main{
	public static void main (String[]args){
	int i;
	double d; 
	String s ;
	char c ;
	Scanner sc = new Scanner(System.in);
	
	
	System.out.print("please input a string :");
	s = sc.nextLine();
	System.out.println("given string ="+s+"\n\n\n");
	
	
	System.out.print("please input char :");
	c = sc.next().charAt(0);
	System.out.println("given char ="+c+"\n\n\n");
	
	
	
	System.out.print("please input int number :");
	i = sc.nextInt();
	System.out.println("given int number ="+i+"\n\n\n");
	
	System.out.print("please input double number :");
	d = sc.nextDouble();
	System.out.println("given double number ="+d+"\n\n\n");
	
	
	}
}