package application;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


import dao.VehiclesDao;
import entity.Vehicles;

public class Menu {
	
	private VehiclesDao vehiclesDao = new VehiclesDao();
	private Scanner scanner = new Scanner(System.in);
	private List<String> options = Arrays.asList(
			"Display Vehicles",
			"Display a Vehicle",
			"Create Vehicle",
			"Delete Vehicle",
			"Update Vehicle");
	
	public void start() {
		String selection = "";
		
		do {
			printMenu();
			selection = scanner.nextLine();
			
			try {
				if (selection.equals("1")) {
					displayVehicles();
				} else if (selection.equals("2")) {
					displayVehicle();
				} else if (selection.equals("3")) {
					createVehicle();
				} else if (selection.equals("4")) {
					deleteVehicle();
				} else if (selection.equals("5")) {
					updateVehicle();
					}
				} catch (SQLException e) {
				e.printStackTrace();	
				}
		
			System.out.println("Press enter to continue..");
			scanner.nextLine();			
		} while(!selection.equals("-1"));
	}
	
	private void printMenu() {
		System.out.println("Select an Option:\n-----------------------------");
		for (int i = 0; i < options.size(); i++) {
			System.out.println(i + 1 + ") " + options.get(i));
			
		}
	}
	
	private void displayVehicles() throws SQLException {
		List<Vehicles> brands = VehiclesDao.getVehicles();
		for (Vehicles vehicle : Vehicles) {
			System.out.println(vehicle.getVehilceId() + ": " + vehicle.getVehicles());
		}
	}
	
	private void displayVehicle() throws SQLException {
		System.out.print("Enter Vehicle id:");
		int id = Integer.parseInt(scanner.nextLine());
		Vehicles Vehicle = VehiclesDao.getVehiclesById(id);
		System.out.println(Vehicles.getVehiclesId() + ": " + Vehicles.getVehicles());
		
		}

	private void createNewVehicle() throws SQLException {
		System.out.print("Enter new Vehicle name");
		String vehicleName = scanner.nextLine();
		VehiclesDao.createNewVehicle(vehicleName);

	}
	
	private void deleteVehicleById() throws SQLException {
		System.out.print("Enter vehicle id to delete:");
		int id = Integer.parseInt(scanner.nextLine());
		VehiclesDao.deleteVehiclesById(id);
	}
	
	private void updateVehicleById() throws SQLException {
		System.out.print("Enter name of vehicle:");
		String name = scanner.nextLine();
		System.out.print("Enter type vehicle:");
		String type = scanner.nextLine();
		System.out.print("Enter speed of vehicle:");
		int speed = Integer.parseInt(scanner.nextLine());
		System.out.print("Enter color of vehicle:");
		String color = scanner.nextLine();
		System.out.print("Enter vehicleId:");
		int vehicleId = Integer.parseInt(scanner.nextLine());
		VehiclesDao.updateVehiclesId(name, type, speed, color, vehicleId);
	}
	
}
