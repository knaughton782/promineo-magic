package application;

import java.sql.SQLException;
import java.util.List;

import dao.PetsDao;
import entity.Pets;

public class Application {

	public static void main(String[] args) {
		
		//Menu menu = new Menu();
		//menu.start();

		
		PetsDao dao = new PetsDao();
		try {
			//dao.addPet("Bear", "Chihuahua puppy");
			//Pets pet = dao.getPetById(1);
			//List<Pets> pets = dao.getPetsList();
			//for (Pets pet : pets) {
				
				//System.out.println(pet.getPetId() + " " + pet.getPetName() + " - " + pet.getPetDesc());
			//}
			
			//dao.deletePetById(3);
			
			dao.updatePet(2, "FoxFur", "red haired fox that can be invisible");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
