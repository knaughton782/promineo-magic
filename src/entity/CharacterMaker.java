package entity;

public class CharacterMaker {

	private int character_ID;
	private String characterFirstName;
	private String characterLastName;
	
	public CharacterMaker(int characterId, String characterFirstName, String characterLastName) {
		this.setCharacter_ID(characterId);
		this.setCharacterFirstName(characterFirstName);
		this.setCharacterLastName(characterLastName);
	}

	public int getCharacter_ID() {
		return character_ID;
	}

	public void setCharacter_ID(int character_ID) {
		this.character_ID = character_ID;
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
