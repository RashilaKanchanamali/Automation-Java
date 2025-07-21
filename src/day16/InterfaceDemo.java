package day16;

interface shape {
	int lenght =10;
	int weight = 20;
	
	void circle();
	
	default void squre() {
		System.out.println("This is squre");
	}
	
	static void rectangle() {
		System.out.println("This is rectangle");
	}
}

public class InterfaceDemo implements shape{
	
	public void circle() {
		System.out.println("This is circle");
	}

	public static void main(String[] args) {
		InterfaceDemo iObj = new InterfaceDemo();
		iObj.circle(); //abstract
		iObj.squre(); //default
		shape.rectangle(); //static method can directly access through interface
		
		shape obj= new InterfaceDemo();
		obj.circle();
		obj.squre();
		shape.rectangle();
		
		System.out.println(shape.lenght*shape.weight); // interface variables are static. it can access directly without object
	}

}
