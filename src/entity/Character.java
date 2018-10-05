package entity;

public class Character {

	private int characterId;
	private String characterFirstName;
	private String characterLastName;
	
	public Character(int characterId, String characterFirstName, String characterLastName) {
		this.setCharacterId(characterId);
		this.setCharacterFirstName(characterFirstName);
		this.setCharacterLastName(characterLastName);
	}

	public int getCharacterId() {
		return characterId;
	}

	public void setCharacterId(int characterId) {
		this.characterId = characterId;
	}

	public String getCharacterFirstName() {
		return characterFirstName;
	}

	public void setCharacterFirstName(String characterFirstName) {
		this.characterFirstName = characterFirstName;
	}

	public String getCharacterLastName() {
		return characterLastName;
	}

	public void setCharacterLastName(String characterLastName) {
		this.characterLastName = characterLastName;
	}
	
}
