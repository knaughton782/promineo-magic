package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Vehicles;


public class VehiclesDao {
	
	private Connection connection;
	private final String GET_VEHICLE_BY_CLASS_ID_QUERY = "SELECT * FROM vehicles WHERE class_id = ?";
	private final String DELETE_VEHICLE_BY_CLASS_ID_QUERY = "DELETE FROM vehicles WHERE class_id = ?";
	private final String CREATE_NEW_VEHICLE_QUERY = "INSERT INTO vehicles(name, type, speed, color, class_id) VALUES(?,?,?,?,?)";
	private final String DELETE_VEHICLE_BY_ID_QUERY = " DELETE FROM vehicles WHERE id = ?";
	private final String UPDATE_VEHICLE_ID_QUERY = "UPDATE FROM vehicles WHERE id = ?";
	
	public VehiclesDao() {
		connection = ConnectionManager.getConnection();
	}
	
	public List<Vehicles> getVehiclesByClassId(int classId) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(GET_VEHICLE_BY_CLASS_ID_QUERY);
		ps.setInt(1, classId);
		ResultSet rs = ps.executeQuery();
		List<Vehicles> vehicles = new ArrayList<Vehicles>();
		
		while (rs.next()) {
			vehicles.add(new Vehicles(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5)));
		}
		
		return null;
	}

	public void createNewVehicle(String name, String type, int speed, String color, int classId) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(CREATE_NEW_VEHICLE_QUERY);
		ps.setString(1, name);
		ps.setString(2, type);
		ps.setInt(3, speed);
		ps.setString(4, color);
		ps.setInt(5, classId);
		ps.executeUpdate();
				
	}
	
	public void deleteVehiclesByClassId(int classId) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(DELETE_VEHICLE_BY_CLASS_ID_QUERY);
		ps.setInt(1, classId);
		ps.executeUpdate();
	}
	
	public void deleteVehiclesById(int id) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(DELETE_VEHICLE_BY_ID_QUERY);
		ps.setInt(1, id);
	}
	
	public void updateVehicleById(String name, String type, int speed, String color, int classId) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(UPDATE_VEHICLE_ID_QUERY);
		ps.setString(1, name);
		ps.setString(2, type);
		ps.setInt(3, speed);
		ps.setString(4, color);
		ps.setInt(5, classId);
		ps.executeUpdate();
	}
}