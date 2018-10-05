package entity;

public class Vehicles {

	private int vehicleId;
	private String name;
	private String type;
	private int speed;
	private String color;
		
	
	public Vehicles(int vehicleId, String name, String type, int speed, String color) {
		this.setVehicleId(vehicleId);
		this.setName(name);
		this.setType(type);
		this.setSpeed(speed);
		this.setColor(color);
	
	}

	public int getVehicleId() {
		return vehicleId;
	}


	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
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
