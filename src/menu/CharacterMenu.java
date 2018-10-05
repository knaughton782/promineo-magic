package menu;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import dao.CharacterDao;
import entity.Character;


public class CharacterMenu {
	 private Scanner scanner = new Scanner(System.in);
	   private List<String> options = Arrays.asList(
			   "1) Show Character",
			   "2) Show All Characters",
			   "3) Build New Character",
			   "4) Edit Character",
			   "5) Delete Character",
			   "Enter -1 To Exit Menu"); 
	   	
	    public void start() throws SQLException {
	       //user selects option from printed menu
	       String selection = "";
	       
	       //loop over menu so user can continue to choose
	       do {
	           printMenu();
	           selection = scanner.nextLine();
	           
	           if (selection.equals("1")) {
				   
			   } else if (selection.equals("2")) {
				   
			   } else if (selection.equals("3")) {
				   
			   } else if (selection.equals("4")) {
				  
			   } else if (selection.equals("5")) {
			   }
	           
	           
	           System.out.println("Press enter to continue: ");
	           scanner.nextLine();
	       } while (!selection.equals("-1"));
	   }
	   public void printMenu() {
	       System.out.println("What would you like to do? Select an option:\n--------------------------------------");
	       for (int i = 0; i < options.size(); i++) {
	           //prints out each number for user choice
	           System.out.println(i + 1 + ") " + options.get(i));
	       }
	   }
	   private void showCharaceter() {
		   System.out.println("Enter Character ID to Display: ");
		   int characterId = Integer.parseInt(scanner.nextLine());
		   Character character = CharacterDao.getCharacterById(characterId);
	   }
	   
}
