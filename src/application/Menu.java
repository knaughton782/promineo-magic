package application;

import java.sql.SQLException;

public class Menu {

	public void start() {
		//user select option from printed menu
		String selection = "";
		
		//loop over menu so user can continue to choose
		do {
			printMenu();
			selection = scanner.nextLine();
			
			try {
				if (selection.equals("1")) {
					displayBookList();
				} else if (selection.equals("2")) {
					displayBook();
				} else if (selection.equals("3")) {
					//addBook();
				} else if (selection.equals("4")) {
					//editBook();
				} else if (selection.equals("5")) {
					//deleteBook();
				} 
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			
			System.out.println("Press enter to continue: ");
			scanner.nextLine();
		} while (!selection.equals("-1"));
	}
}
