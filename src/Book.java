
public class Book extends Item{
	String authorName;
	String bookTitle;
	
	public Book(float price, String authorName, String bookTitle) {
		super(price);
		this.authorName = authorName;
		this.bookTitle = bookTitle;
	}

}
