package entity;

public class Abilities {
	
	private int abilityId;
	private String abilityName;
	private String abilityType;
	private String abilityDescription;
	private int abilityClassId;
	
	
	public Abilities(int abilityId, 
					String abilityName, 
					String abilityType, 
					String abilityDescription, 
					int abilityClassId) {
		
		this.setAbilityId(abilityId);
		this.setAbilityName(abilityName);
		this.setAbilityType(abilityType);
		this.setAbilityDescription(abilityDescription);
		this.setAbilityClassId(abilityClassId);
		
	}

	public int getAbilityId() {
		return abilityId;
	}

	public void setAbilityId(int abilityId) {
		this.abilityId = abilityId;
	}

	public String getAbilityName() {
		return abilityName;
	}

	public void setAbilityName(String abilityName) {
		this.abilityName = abilityName;
	}

	public String getAbilityType() {
		return abilityType;
	}

	public void setAbilityType(String abilityType) {
		this.abilityType = abilityType;
	}

	public String getAbilityDescription() {
		return abilityDescription;
	}

	public void setAbilityDescription(String abilityDescription) {
		this.abilityDescription = abilityDescription;
	}

	public int getAbilityClassId() {
		return abilityClassId;
	}

	public void setAbilityClassId(int abilityClassId) {
		this.abilityClassId = abilityClassId;
	}
}
