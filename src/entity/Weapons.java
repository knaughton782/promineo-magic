package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Pets;

public class PetsDao {


	private final Connection connection = ConnectionManager.getConnection();
	private final String ADD_PET = "INSERT INTO pets(pet_name, pet_desc) VALUES(?, ?)";
	private final String GET_PET_BY_ID = "SELECT * FROM pets WHERE pet_id = ?";
	private final String GET_PETS_LIST= "SELECT * FROM pets";
	private final String DELETE_PET_BY_ID = "DELETE FROM pets WHERE pet_id = ?";
	private final String UPDATE_PET = "UPDATE pets SET pet_name = ?, pet_desc = ? WHERE pet_id = ?";
	
	
	public void addPet(String petName, String petDesc) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(ADD_PET);
		ps.setString(1, petName);
		ps.setString(2, petDesc);
		ps.executeUpdate();
	}
	
	public Pets getPetById(int petId) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(GET_PET_BY_ID);
		ps.setInt(1, petId);
		ResultSet rs = ps.executeQuery();
		rs.next();
		return mapResultsToPets(rs.getInt(1), rs.getString(2), rs.getString(3));
	}
	
	//maps the result set
	private  Pets mapResultsToPets(int petId, String petName, String petDesc) {
		return new Pets(petId, petName, petDesc);
	}
	
	public List<Pets> getPetsList() throws SQLException {
		List<Pets> pets = new ArrayList<Pets>();
		PreparedStatement ps = connection.prepareStatement(GET_PETS_LIST);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			pets.add(mapResultsToPets(rs.getInt(1), rs.getString(2), rs.getString(3)));
		}
		return pets;
	}
	
	public void deletePetById(int petId) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(DELETE_PET_BY_ID);
		ps.setInt(1, petId);
		ps.executeUpdate();
	}
	
	public void updatePet(int petId, String petName, String petDesc) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(UPDATE_PET);
		ps.setString(1, petName);
		ps.setString(2, petDesc);
		ps.setInt(3, petId);
		ps.executeUpdate();
		
	}
 	
	
}
