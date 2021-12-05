
public class Books {
	
	String title;
	String author;
	int Number_of_pages;
	String publisher;
	
	Books(String title, String author, int Number_of_pages,String publisher){
		this.title = title;
		this.author = author;
		this.Number_of_pages = Number_of_pages;
		this.publisher = publisher;
	}
	
	public void display() {
		System.out.println
		(this.title + " was written by " 
		+ this.author + " with " + this.Number_of_pages + " "
				+ "was written by " + this.publisher);
	}
	
	public static void main(String[] args) {
		Books fiction = new Books("Harry Potter", "JK Rowling", 5000, "GreatBooks");
		fiction.display();

	}

}
