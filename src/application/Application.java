package application;

import java.sql.SQLException;
import java.util.List;

import dao.PetsDao;
import entity.Pets;
import menu.VehicleMenu;

public class Application {

	public static void main(String[] args) {
		
		VehicleMenu menu = new VehicleMenu();
		menu.start();

	}

}
