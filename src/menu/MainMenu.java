package menu;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainMenu {
   
   private Scanner scanner = new Scanner(System.in);
   private List<String> options = Arrays.asList(
		   "1) Enter Character Menu",
		   "2) Enter Pet Menu",
		   "3) Enter Weapons Menu",
		   "4) Enter Abilities Menu",
		   "5) Enter Vehicles Menu",
		   "Enter -1 To Exit Menu"); 
   	
    public void start() {
       //user selects option from printed menu
       String selection = "";
       
       //loop over menu so user can continue to choose
       do {
           printMenu();
           selection = scanner.nextLine();
           
           try {
               if (selection.equals("1")) {
            	   CharacterMenu.printMenu    
               } else if (selection.equals("2")) {
            	   //PetMenu.printMenu    
            	   } else if (selection.equals("3")) {
            	   //WeaponsMenu.printMenu   
               } else if (selection.equals("4")) {
            	   //AbilitiesMenu.printMenu   
               } else if (selection.equals("5")) {
            	   //VehiclesMenu.printMenu   
               }
           } catch (SQLException e) {
               e.printStackTrace();
           }
           
           
           System.out.println("Press enter to continue: ");
           scanner.nextLine();
       } while (!selection.equals("-1"));
   }
   private void printMenu() {
       System.out.println("What would you like to do? Select an option:\n--------------------------------------");
       for (int i = 0; i < options.size(); i++) {
           //prints out each number for user choice
           System.out.println(i + 1 + ") " + options.get(i));
       }
   }
   
}
