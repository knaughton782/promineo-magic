package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entity.Character;
import entity.Pets;

public class CharacterDao {

	private Scanner sc = new Scanner(System.in);
	List<Character> characters = new ArrayList<Character>();

	private static Connection connection;
	private final String GET_CHARACTER_BY_ID = "SELECT * FROM CHaracterMaker WHERE Character_id = ?";
	private final String GET_CHARACTER = "SELECT * FROM CharacterMaker";
	private final String DELETE_CHARACTER = "DELETE FROM CharacterMaker WHERE id = ?";
	private final String CREATE_CHARACTER = "INSERT INTO CharacterMaker(firstName, lastName,) VALUES(?,?)";
	
	public CharacterDao() {
		connection = ConnectionManager.getConnection();
		
	}
	
	public List<Character> getCharacter() throws SQLException {
		ResultSet rs = connection.prepareStatement(GET_CHARACTER).executeQuery();
		
		while (rs.next()) {
			characters.add(mapResults(rs.getInt(1), rs.getString(2), rs.getString(3)));
		}
		
		return characters;
	}
	
	private Character mapResults(int characterId, String characterFirstName, String characterLastName) {
		return new Character(characterId, characterFirstName, characterLastName);
	}
	
	public static Character getCharacterById(int characterId) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(GET_CHARACTER_BY_ID);
		ps.setInt(1, characterId);
		ResultSet rs = ps.executeQuery();
		rs.next();
		return mapResults(rs.getInt(1), rs.getString(2), rs.getString(3));
	}
	
	public void createNewCharacter(String characterFirstName, String characterLastName) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(CREATE_CHARACTER);
		ps.setString(2, characterFirstName);
		ps.setString(3, characterLastName);
		ps.executeUpdate();
	}
	
	public void deleteCharacterById(int characterId) throws SQLException {
		sc.next();
		if(sc.equals(characterId)) {
		PreparedStatement ps = connection.prepareStatement(DELETE_CHARACTER);
		//ps.setString(3, characterLastName);
		ps.executeUpdate();
		}
		
	}
}