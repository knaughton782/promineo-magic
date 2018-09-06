package entity;

public class Pets {
	
	private int petId;
	private String petName;
	private String petDescription;
	private int petClassId;
	
	public Pets(int petId, 
				String petName, 
				String petDescription,
				int petClassId) {
		
	}

	public int getPetId() {
		return petId;
	}

	public void setPetId(int petId) {
		this.petId = petId;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public String getPetDescription() {
		return petDescription;
	}

	public void setPetDescription(String petDescription) {
		this.petDescription = petDescription;
	}

	public int getPetClassId() {
		return petClassId;
	}

	public void setPetClassId(int petClassId) {
		this.petClassId = petClassId;
	}

}
