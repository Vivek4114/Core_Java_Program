package com.nit.BookManagement;

import java.util.Scanner;


public class BookManagementApp {
	public static final String BLACK = "\u001B[30m"; // Black text
	public static final String RED = "\u001B[31m"; // Red text
	public static final String GREEN = "\u001B[32m"; // Green text
	public static final String YELLOW = "\u001B[33m"; // Yellow text
	public static final String BLUE = "\u001B[34m"; // Blue text
	public static final String PURPLE = "\u001B[35m"; // Purple / Magenta
	public static final String CYAN = "\u001B[36m"; // Cyan text
	public static final String WHITE = "\u001B[37m"; // White text

	public static void main(String[] args) {
		Book book;
		LiberaryManagement liberary = new LiberaryManagement();
		Admin admin = new Admin(liberary);
		User user = new User(liberary);

		Scanner sc = new Scanner(System.in);
		mainLoop: while (true) {
			System.out.println(PURPLE + "Enter 1 For User : ");
			System.out.println(PURPLE + "Enter 2 For Admin : ");
			System.out.println(RED + "Enter 3 For Exit ");

			int option = sc.nextInt();sc.nextLine();

			switch (option) {

			case 1: {
				System.out.println(PURPLE+"Enter User Name : ");
				String userName = sc.nextLine();
				System.out.println(PURPLE+ "Enter User Password : ");
				String passWord = sc.nextLine();

				if (user.userName.equals(userName) && user.UserPassward.equals(passWord)) {
					while (true) {
						System.out.println(GREEN+"Enter 1 For Search book By Title ");
						System.out.println(GREEN+"Enter 2 : For Search Book By Author ");
						System.out.println(GREEN+"Enter 3 : For Search by By ISBN ");
						System.out.println(GREEN+"Enter 4 : For  Search Book By genere");
						System.out.println(GREEN+"Enter 5 : For Display Particular Book  ");
						System.out.println(GREEN+"Enter 6 : For Display All Book  ");
						System.out.println(GREEN+"Enter 7 : For Borrow The Book ");
						System.out.println(GREEN+"Enter 8 : For Returning the Main Menu  ");

						System.out.println(CYAN+"Enter Your Choice : ");
						int choice = sc.nextInt(); sc.nextLine();
						switch (choice) {

						case 1: {
							System.out.println(PURPLE+"Enter the Book title");
							String title = sc.nextLine();

							System.out.println( user.searchBookByTitle(title)); 
						}
							break;

						case 2: {
							System.out.println(PURPLE+"Enter the Book Author");
							String author = sc.nextLine();

							System.out.println( user.searchByAuthor(author)); 
						}
							break;
						case 3: {
							System.out.println(PURPLE+"Enter the Book Isbn");
							String isbn = sc.nextLine();

							System.out.println( user.searchBookByIsbn(isbn)); 
						}
							break;
						case 4: {
							System.out.println(PURPLE+"Enter the Book Genere : ");
							String genere = sc.nextLine();

							System.out.println(user.searchByGenere(genere));
						}
							break;

						case 5: {
							System.out.println(PURPLE+"Enter the Book Title");
							String title = sc.nextLine();
							user.displayBookByTitle(title);
						}
							break;

						case 6: {
							System.out.println(PURPLE+"All Book Displayed ");

							user.displayAllBook();
						}
						case 7: {
							System.out.println(PURPLE+"Enter the Book Title ");
							String title = sc.nextLine();
							System.out.println(PURPLE+"Enter the Book Quantity : ");
							int qty = sc.nextInt();

							 user.borrowBook(title, qty);
						}
							break;
						case 8: {

							System.out.println(CYAN+"Returning the Main Menu : ");
							continue mainLoop;
						}

						default:
							System.out.println(RED+"Invalid Choice Please Enter Some Valid choice ");

						}

					}
				} else {
					System.out.println(RED+"Invalid Password ");
				}

			}
				break;

			case 2: {

				System.out.println(CYAN+"Enter The Admin UserName : ");
				String adminName = sc.nextLine();
				System.out.println(CYAN+"Enter the Admin Pasword : ");
				String password = sc.nextLine();

				if (Admin.userName.equals(adminName) && Admin.pwd.equals(password)) {
					while (true) {
						System.out.println(WHITE+"Enter 14 : Add The Book ");
						System.out.println(WHITE+"Enter 1 :  For Search book By Title ");
						System.out.println(WHITE+"Enter 2 : For Search Book By Author ");
						System.out.println(WHITE+"Enter 3 : For Search by By ISBN ");
						System.out.println(WHITE+"Enter 4 : For  Search Book By genere");
						System.out.println(WHITE+"Enter 5 : Update Book By the Title ");
						System.out.println(WHITE+"Enter 6 : Update Book By the Author ");
						System.out.println(WHITE+"Enter 7 : Update Book by Genere ");
						System.out.println(WHITE+"Enter 8 :  Update Book by Quantity");
						System.out.println(WHITE+"Enter 9 : For Remove Book By Title ");
						System.out.println(WHITE+"Enter 10 :  for Remove by by isbn  ");
						System.out.println(WHITE+"Enter 11 : For Display Particular Book  ");
						System.out.println(WHITE+"Enter 12 : For Display All Book  ");
						System.out.println(WHITE+"Enter 13 : For Returnin The main Menu : ");

						System.out.println(CYAN+"Enter Your Choice : ");
						int choice1 = sc.nextInt(); sc.nextLine();
						switch (choice1) {
						
						case 14 : {
							System.out.println("Enter the Book Title");
							String title = sc.nextLine();
							System.out.println("Enter the Book Author");
							String author = sc.nextLine();
							System.out.println("Enter the Book ISBN");
							String isbn = sc.nextLine();
							System.out.println("Enter the Book Genere");
							String genere = sc.nextLine();
							System.out.println("Enter the Book Quantity");
							int qty = sc.nextInt();
							
							
							admin.addBook(new Book(title,author,isbn,genere,qty));
						}

						case 1: {
							System.out.println(YELLOW+"Enter the Book title");
							String title = sc.nextLine();

							System.out.println( admin.searchBookByTitle(title));;
						}
							break;

						case 2: {
							System.out.println(YELLOW+"Enter the Book Author");
							String author = sc.nextLine();

							System.out.println( admin.searchByAuthor(author));
						}
							break;
						case 3: {
							System.out.println(YELLOW+"Enter the Book Isbn");
							String isbn = sc.nextLine();

							System.out.println( admin.searchBookByIsbn(isbn));
						}
							break;
						case 4: {
							System.out.println(YELLOW+"Enter the Book Genere : ");
							String genere = sc.nextLine();

							System.out.println( admin.searchByGenere(genere));
						}
							break;

						// --------------------

						case 5: {
							System.out.println(YELLOW+"Enter the Book Old title");
							String oldtitle = sc.nextLine();

							System.out.println(YELLOW+"Enter the Book New title");
							String newtitle = sc.nextLine();

							admin.updateBookByTitle(oldtitle, newtitle);

						}
							break;

						case 6: {
							System.out.println(YELLOW+"Enter the Book ISBN");
							String isbn = sc.nextLine();

							System.out.println(YELLOW+"Enter the Book Author : ");
							String Author = sc.nextLine();

							admin.updateBookByAuthor(isbn, Author);
						}
							break;
						case 7: {
							System.out.println(YELLOW+"Enter the Book ISBN");
							String isbn = sc.nextLine();

							System.out.println(YELLOW+"Enter the Book Genere : ");
							String genere = sc.nextLine();

							admin.updateBookByGenere(isbn, genere);
						}
							break;
						case 8: {
							System.out.println(YELLOW+"Enter the Book Genere : ");
							String genere = sc.nextLine();
							System.out.println(YELLOW+"Enter the Book Quantity : ");
							String quantity = sc.nextLine();

							admin.updateBookByQty(password, option);
						}
							break;

						// _-----------------------

						case 9: {
							System.out.println(YELLOW+"Enter the Book title");
							String title = sc.nextLine();

						System.out.println(	admin.deleteBookByTitle(title));
						}
							break;

						case 10: {
							System.out.println(YELLOW+"Enter the Book isbn");
							String isbn = sc.nextLine();

							System.out.println(admin.deleteBookByisbn(isbn));

						}
							break;
						case 11: {
							System.out.println(YELLOW+"Enter the Title ");
							String title = sc.nextLine();

							admin.displayBookByTitle(title);
						}
							break;
						case 12: {
							admin.displayAllBook();
						}
							break;
						case 13 : {
							System.out.println(CYAN+"Returniing the main menu");
							continue mainLoop;
						}
							
						default : {
							System.out.println(RED+"Enter Valid Choice ..!");
						}

						}
					}

				} else {
					System.out.println(RED+"Invalid Password ..!");
				}

			}
				break;

			case 3: {
				System.out.println(GREEN+"thank your for Coming the my Liberary Universe..!");
				return;

			}
				

			default: {

				System.out.println(RED+"Please Enter Some Valid Message : ");
			}

			}

		}

	}

}
