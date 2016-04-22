import java.util.Scanner;

public class MyBookstore {
	
	public static void main(String[] args) {
		String thetitle;
		int pages;
		double cost;
		int num;
		
		Bookstore bookList = new Bookstore();
		int choice = 0;
		double income = 0;
		System.out.println("Welcome, please select one of the following menu options:\n");
		Scanner scanner = new Scanner(System.in);
		do {
			num = 0;
			System.out.println("1) Add a book to the stock");
			System.out.println("2) Sell a book in stock");
			System.out.println("3) List the titles of all the books in stock");
			System.out.println("4) List all the information about the books in stock");
			System.out.println("5) Print out the gross income of the bookstore");
			System.out.println("6) Quit");
		
			

			choice = scanner.nextInt();
			scanner.nextLine(); //Gets rid of the whitespace, I was not sure of how else to do this
			
			//Goes here if the user wants to add a book
			if (choice == 1) {
				System.out.println("What is the title of the book? ");
				thetitle = scanner.nextLine();
				//checks to see if the book has already been added.
				if ((bookList.inStock(thetitle, num)) == true) {
					System.out.println("How many book would you like to stock? ");
					num = scanner.nextInt();
					bookList.addBookQuantity(thetitle, num);
				}
				//else asks for the rest of the information
				else {
					System.out.println("How many pages does the book have? ");
					pages = scanner.nextInt();
					System.out.println("What is the price of the book? ");
					cost = scanner.nextDouble();
					System.out.println("How many books would you like to add? ");
					num = scanner.nextInt();
					bookList.addNewBook(new Book(thetitle, pages, cost, num));
				}
			
			}
			//Goes here if the user wants to buy a book
			else if (choice == 2) {
				System.out.println("What is the title of the book you would like to purchase? ");
				thetitle = scanner.nextLine();
				//checks to see if the book is in stock
				if (bookList.inStock(thetitle, num) == true) {
					System.out.println("How many copies would you like to purchase? ");
					num = scanner.nextInt();
					//if the book is in stock, it checks to see if there are enough copies to be purchased
					if (bookList.sellBook(thetitle, num)== true) {
						System.out.println("Your purchase was completed successfully.\n\n");
					}
					else {
						System.out.println("We do not have enough copies of " + thetitle
								+ ". Sorry for the inconvenience.\n\n");
					}
				}
				else {
					System.out.println("The book is not in stock. Sorry for the inconvenience.\n\n");
				}
			}
			//Lists all of the titles in stock
			else if (choice == 3) {
				bookList.listTitles();
			}
			//Lists all of the information of all the books in stock
			else if (choice == 4) {
				bookList.listBooks();
			}
			//Prints out the income of the bookstore
			else if (choice == 5) {
				income = bookList.getIncome();
				System.out.println("Store income: " + income);
			}
			else if (choice == 6) {
				break;
			}
			//If choices 1-6 are not choosen, the programs goes here, and will continue to go here
			//if the user does not input a valid choice
			else {
				System.out.println("That is not a menu option. Try again.\n\n");
			}
		} while (choice != 6);
		System.out.println("Thank you for shopping at my bookstore!");
		
		scanner.close();
	}
}