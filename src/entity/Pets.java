package entity;

public class Pets {
	
	private int petId;
	private String petName;
	private String petDesc;
	
	
	public Pets(int petId, 
				String petName, 
				String petDesc) {
		this.petId = petId;
		this.petName = petName;
		this.petDesc = petDesc;
		
		
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

	public String getPetDesc() {
		return petDesc;
	}

	public void setPetDesc(String petDesc) {
		this.petDesc = petDesc;
	}

}
