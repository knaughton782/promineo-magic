package entity;

public class Weapons {

	
	private int weapon_id;
	private String name;
	private String type;
	private int strength;
	
	public Weapons(int weapon_Id, String name, String type, int strength) {
		this.setWeapon_id(weapon_id);
		this.setName(name);
		this.setType(type);
		this.setStrength(strength);
	}
	
	public int getWeapon_id() {
		return weapon_id;
	}
	public void setWeapon_id(int weapon_id) {
		this.weapon_id = weapon_id;
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
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}

}

