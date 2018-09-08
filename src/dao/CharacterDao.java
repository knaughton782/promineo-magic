package dao;

import java.sql.Connection;

public class CharacterDao {

	
	private Connection connection;
	private final String GET_CHARACTER_BY_ID = "";
	private final String GET_CHARACTER = "";
	private final String DELETE_CHARACTER = "";
	private final String CREATE_CHARACTER= "";
	
	public CharacterDao() {
		connection = ConnectionManager.getConnection();

	}
}
