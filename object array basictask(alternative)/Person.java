import java.lang.*;
public class Person{
private String name ;
private int age;
private float height;

public void setn(String name){
	this.name=name;
}
public void seta(int age){
	this.age=age;
}
public void seth(float height){
	this.height=height;
}
public String getn(){
	return name;
}
public int geta(){
	return age;
}
public float geth(){
	return height;
}
public void info(){
	System.out.println("\nName : "+getn());
	System.out.println("age : "+geta());
	System.out.println("height : "+geth()+"ft");
}
public static void main (String[]args){
	Person per1 = new Person();
	per1.setn("Ben");
	per1.seta(18);
	per1.seth(6f);
	Person per2 = new Person();
	per2.setn("Eren");
	per2.seta(25);
	per2.seth(6.3f);
	Person p[]=new Person[6];
	p[1]=per1;
	p[3]=per2;
	p[5]=new Person();
	p[5].setn("mikasa");
	p[5].seta(22);
	p[5].seth(6.5f);
	for(int i=0;i<p.length;i++){
		System.out.println("\nperson "+i+"'s info :");
		if(p[i] != null){
			p[i].info();
		}
		else{System.out.println("\nNo information available\n");}
	}
}
}