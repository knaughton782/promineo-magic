package entity;

public class Vehicles {

	private int vehicle_Id;
	private String name;
	private String type;
	private int speed;
	private String color;
		
	
	public Vehicles(int vehicle_Id, String name, String type, int speed, String color) {
		this.setVehicle_Id(vehicle_Id);
		this.setName(name);
		this.setType(type);
		this.setSpeed(speed);
		this.setColor(color);
	
	}

	public int getVehicle_Id() {
		return vehicle_Id;
	}


	public void setVehicle_Id(int vehicle_Id) {
		this.vehicle_Id = vehicle_Id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}
	

}
