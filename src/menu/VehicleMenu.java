package menu;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


import dao.VehiclesDao;
import entity.Vehicles;

public class VehicleMenu {
	
	//private VehiclesDao vehiclesDao = new VehiclesDao();
	private Scanner scanner = new Scanner(System.in);
	private List<String> options = Arrays.asList(
			"1) Display Vehicles",
			"2) Display a Vehicle",
			"3) Create Vehicle",
			"4) Delete Vehicle",
			"5) Update Vehicle");
	
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
					createNewVehicle();
				} else if (selection.equals("4")) {
					deleteVehicleById();
				} else if (selection.equals("5")) {
					updateVehicleById();
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
		for (Vehicles vehicle : brands) {
			System.out.println(vehicle.getVehicleId() + ": " + vehicle.getVehicles());
		}
	}
	
	private void displayVehicle() throws SQLException {
		System.out.print("Enter Vehicle id:");
		int id = Integer.parseInt(scanner.nextLine());
		Vehicles Vehicle = VehiclesDao.getVehiclesByClassId(id);
		System.out.println(Vehicles.getVehicleId() + ": " + Vehicles.getVehicles());
		
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
		VehiclesDao.updateVehicleById(name, type, speed, color, vehicleId);
	}
	
}
