package javapracticeques;

public class Creature {

	public static void main(String[] args) {
		
		
		
		Person p1 = new Person();
		Person p2 = new Person() ;
		
		p1.Age = 24 ;
		p2.Age = 35 ;
		p1.name = "Saif";
		p2.name = "Ha";
		
		
		System.out.println(p1.Age + " " + p1.name);
		
		p1.eat();
		p2.walk();

	} 
	
	

}
class Person{
	
	
	String name ;
	
	int Age ;
	
	
	void walk() {
		
		System.out.println(name + " " + "is walking");
	}
	void eat() {
		
		System.out.println(name + " " + "is eating");
		
	}
	
	
}
