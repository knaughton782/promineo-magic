package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class WeaponsDao {
	
	private Connection connection;
	private final String GET_WEAPON_BY_CLASS_ID_QUERY = "SELECT * FROM weapons WHERE class_id = ?";
	private final String DELETE_WEAPON_BY_CLASS_ID_QUERY = "DELETE FROM weapons WHERE class_id = ?";
	private final String CREATE_NEW_WEAPON_QUERY = "INSERT INTO weapons(name, type, strength, class_id) VALUES(?,?,?,?,?)";
	private final String DELETE_WEAPON_BY_ID_QUERY = " DELETE FROM weapons WHERE id = ?";
	private final String UPDATE_WEAPON_ID_QUERY = "UPDATE FROM weapons WHERE id = ?";
	
	public WeaponsDao() {
		connection = ConnectionManager.getConnection();
	}
	
	public WeaponsDao(int int1, String string, int int2, String string2) {

	}

	@SuppressWarnings("unchecked")
	public <Weapons> List<Weapons> getWeaponsByClassId(int classId) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(GET_WEAPON_BY_CLASS_ID_QUERY);
		ps.setInt(1, classId);
		ResultSet rs = ps.executeQuery();
		List<Weapons> weapons = new ArrayList<Weapons>();
		
		while (rs.next()) {
			weapons.add((Weapons) new WeaponsDao(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4)));
		}
		
		return null;
	}

	public void createNewWeapon(String name, String type, int strength, int classId) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(CREATE_NEW_WEAPON_QUERY);
		ps.setString(1, name);
		ps.setString(2, type);
		ps.setInt(3, strength);
		ps.setInt(5, classId);
		ps.executeUpdate();
				
	}
	
	public void deleteWeaponsByClassId(int classId) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(DELETE_WEAPON_BY_CLASS_ID_QUERY);
		ps.setInt(1, classId);
		ps.executeUpdate();
	}
	
	public void deleteWeaponsById(int id) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(DELETE_WEAPON_BY_ID_QUERY);
		ps.setInt(1, id);
	}
	
	public void updateWeaponById(String name, String type, int strength, int classId) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(UPDATE_WEAPON_ID_QUERY);
		ps.setString(1, name);
		ps.setString(2, type);
		ps.setInt(3, strength);
		ps.setInt(5, classId);
		ps.executeUpdate();
	}
}