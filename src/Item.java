
public abstract class Item {
	int id;
	static int counter=1;
	float price;
	
	public Item(float price){
		this.id = counter++;
		this.price = price;
	}
}