package basics;
import java.util.*;

import Book;
import Circle;
import Item;
import Rectangle;
import Shape;
import Square;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child child1 = new Child(10, 20);
		System.out.println("Child: "+child1.x+" "+child1.y);
		// child1 will not be able to access the private member of class Parent 
//		i.e. child1.z will result in error.
		
		List<Item> items = new ArrayList<Item>();
		items.add(new Book(100f, "abc", "xyz"));
		items.add(new Book(200f, "eee", "rrr"));
//		System.out.println(items);
		Iterator<Item> it = items.iterator();
		while(it.hasNext()) {
			Item ii = it.next();
			System.out.println(ii.id);
		}
		
		for(Iterator<Item> it1 = items.iterator(); it1.hasNext();) {
			System.out.println("IT1: "+it1.next().price);
		}
		
		for(Item item: items) {
//			In for-each loop, we can’t modify collection, 
//				it will throw a ConcurrentModificationException on the other hand with 
//				iterator we can modify collection.
//				This occurs because for-each loop implicitly creates an iterator but it is not 
//				exposed to the user thus we can’t modify the items in the collections.
			System.out.println(item.id);
		}
		
		
		Shape s1 = new Circle(5);
		System.out.println("Circle: "+s1.area() + " " + s1.myShapeAttr);
		/// myShapeAttr value will be taken from parent class Shape and not from the Circle and any other child class.
		// When we assign like this, Shape s = new Circle() 
			// Reference of Shape class is created while object of Circle is created
			// At this time, S.(any attribute) returns value of attribute of Shape if same attribute is present in both of the classes
			// Also, s.(any method) will access child's method first
		Shape s2 = new Square(5);
		System.out.println("Square: "+s2.area() + " " + s1.myShapeAttr);
		Shape s3 = new Rectangle(5, 6);
		System.out.println("Rectangle: "+s3.area() + " " + s1.myShapeAttr);
	}

}

class Parent {
	protected int x;
	private int z;  
	
	Parent(int x, int z) {
		this.x = x;
		this.z = z;
	}
}

class Child extends Parent {
	int y;
	
	Child(int x, int y) {
		super(x, 111);  // To call parameterized constructor of the Parent class
		this.y = y;
	}
}
