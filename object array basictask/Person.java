import java.lang.*;
public class Person{
	private String name;
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
	public String getn(){return name;}
	public int geta(){return age;}
	public float geth(){return height;}
	public static void Info(Person[]per){
		for(int i=0;i<per.length;i++){
			if(per[i] != null){
				System.out.println("\nperson["+i+"]'s name: "+per[i].getn());
				System.out.println("person["+i+"]'s age: "+per[i].geta());
				System.out.println("person["+i+"]'s height: "+per[i].geth()+"ft\n");
			}
			else{
				System.out.println("\nindex["+i+"] has No information available.\n");
			}
		}
	}
	public static void main (String[]args){
		Person p1 = new Person();
		p1.setn("Ben");
		p1.seta(20);
		p1.seth(5.5f);
		Person p2 = new Person();
		p2.setn("Eren");
		p2.seta(25);
		p2.seth(6f);
		Person per[] = new Person[6];
		per[1]=p1;
		per[3]=p2;
		per[5]=new Person();
		per[5].setn("Mkasa");
		per[5].seta(30);
		per[5].seth(5.8f);
		Person.Info(per);
	}
}