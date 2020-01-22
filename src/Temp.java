import java.util.Scanner;

public class Temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item i1= new Book(100f, "eee", "fff");
		Item i2 = new Book(200f, "ggg", "hhh");
		
		System.out.println("I1: "+i1.id+" "+i1.price);
		System.out.println("I2: "+i2.id+" "+i2.price);
		
		
		Item items[];
		items = new Item[2];
		items[0] = new Book(300f, "aaa", "bbb");
		items[1] = new Book(400f, "ccc", "ddd");
		
		for(int i=0; i<items.length; i++) {
			System.out.println("Ith Item["+i+"]: id: "+items[i].id+" price: "+items[i].price);
		}
		
		
		char a[] = new char[]{'a', 'b', 'c'};
		
		Scanner scan = new Scanner(System.in);
		String aa = scan.nextLine();
		String bb = scan.nextLine();
		System.out.println(aa+bb);
		
		
		
		String message = "hello";
		for(int i=0; i<message.length(); i++) {
			System.out.println(message.charAt(i+1));
		}
	}

}
