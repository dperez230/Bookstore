class Book {
		
	private String title;
	private int numOfPages;
	private double price;
	private int quantity;
	
	//Constructor: Takes in the title of the book, the number of pages in the book, the cost of the book and
	//the number of copies (quantity) of books and initializes each of the appropriate instances variables in
	//the object.
	public Book(String thetitle, int pages, double cost, int num) {
		this.title = thetitle;
		this.numOfPages = pages;
		this.price = cost;
		this.quantity = num;
	}
	
	//Returns the title of the Book object the method is called on.
	public String getTitle() {
		return this.title;
	}
	
	//Returns the price of the Book object the method is called on.
	public double getPrice() {
		return this.price;
	}
		
	//Returns the quantity of the Book object the method is called on.
	public int getQuantity() {
		return this.quantity;
	}
	
	//Returns all the information about a Book object as a String.
	public String toString() {
		return ("Title: " + title + "\nNumber of Pages: " + numOfPages + "\nPrice: " + price + "\nQuantity: " + quantity);
	}
	//Decrements the number of copies, by the given amount, for the Book object the method is called on.
	public void subtractQuantity(int amount) {
		this.quantity-= amount;
	}
	
	//Increments the number of copies, with the given amount, for the Book object the method is called on.
	public void addQuantity(int amount) {
		this.quantity+= amount;
	}
}