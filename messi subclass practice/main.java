import java.lang.*;
class footballer{
	private String name;
	private String nation;
	footballer(){
		System.out.println("Default constructor.");
	}
	footballer(String name,String nation){
		this.name=name;
		this.nation=nation;
	}
	
	public void setName(String name){
		this.name=name;
	}
	public void setNation(String nation){
		this.nation=nation;
	}
	String getName(){
		return name;
	}
	String getNation(){
		return nation;
	}
	
	public void show(){
		System.out.println("footballer name : "+name);
		System.out.println("footballer nation : "+nation);
	}
}



class messi extends footballer{
	private int age;
	private double weight;
	messi(){
		System.out.println("degault constructor");
	}
	messi(int age , double weight,String name,String nation){
		super(name,nation);
		this.age=age;
		this.weight=weight;
	}
	public void setAge(int age){
		this.age=age;
	}
	public void setWeight(double weight){
		this.weight=weight;
	}
	public int getAge(){return age;}
	public double getWeight(){return weight;}
	
	
	public void show(){
		System.out.println("footballer name : "+getName());
		System.out.println("footballer nation : "+getNation());
		System.out.println("footballer messi age : "+age);
		System.out.println("footballer messi weight : "+weight);
		
	}
}
public class main{
	public static void main(String[]args){
		messi m1 = new messi();
		m1.setName("messi1");
		m1.setNation("arentina1");
		m1.setAge(34);
		m1.setWeight(65.9);
		
		messi m2 = new messi(35,65.8,"messi","argentina");
		
		m1.show();
		m2.show();
		
	}
}