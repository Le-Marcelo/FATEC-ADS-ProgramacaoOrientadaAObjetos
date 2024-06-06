package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Time;

public class TimeDAO implements ICRUD<Time> {

	private GenericDAOMySQL genericDAOMySQL;

	public TimeDAO(GenericDAOMySQL genericDAOMySQL) {
		super();
		this.genericDAOMySQL = genericDAOMySQL;
	}

	@Override
	public void register(Time time) throws SQLException, ClassNotFoundException {
		Connection conn = genericDAOMySQL.getConnection();
		String cmdSQL = "INSERT INTO time VALUES (?, ?, ?)";

		PreparedStatement preparedStatement = conn.prepareStatement(cmdSQL);
		preparedStatement.setInt(1, time.getNumero());
		preparedStatement.setString(2, time.getNome());
		preparedStatement.setString(3, time.getNomeCidade());

		preparedStatement.execute();
		preparedStatement.close();
		conn.close();
	}

	@Override
	public void update(Time time) throws SQLException, ClassNotFoundException {
		Connection conn = genericDAOMySQL.getConnection();
		String cmdSQL = "UPDATE time SET nome = ?, nomeCidade = ? WHERE numero = ?";

		PreparedStatement preparedStatement = conn.prepareStatement(cmdSQL);
		preparedStatement.setString(1, time.getNome());
		preparedStatement.setString(2, time.getNomeCidade());
		preparedStatement.setInt(3, time.getNumero());

		preparedStatement.execute();
		preparedStatement.close();
		conn.close();
	}

	@Override
	public void remove(Time time) throws SQLException, ClassNotFoundException {
		Connection conn = genericDAOMySQL.getConnection();
		String cmdSQL = "DELETE FROM time WHERE numero = ?";

		PreparedStatement preparedStatement = conn.prepareStatement(cmdSQL);
		preparedStatement.setInt(1, time.getNumero());

		preparedStatement.execute();
		preparedStatement.close();
		conn.close();
	}

	@Override
	public Time search(Time time) throws SQLException, ClassNotFoundException {
		Connection conn = genericDAOMySQL.getConnection();
		String cmdSQL = "SELECT numero, nome, nomeCidade FROM time WHERE numero = ?";

		PreparedStatement preparedStatement = conn.prepareStatement(cmdSQL);
		preparedStatement.setInt(1, time.getNumero());
		ResultSet resultSet = preparedStatement.executeQuery();

		if (resultSet.next()) {
			time.setNumero(resultSet.getInt("numero"));
			time.setNome(resultSet.getString("nome"));
			time.setNomeCidade(resultSet.getString("nomeCidade"));
		}

		resultSet.close();
		preparedStatement.close();
		conn.close();

		return time;
	}

	@Override
	public List<Time> list() throws SQLException, ClassNotFoundException {
		List<Time> times = new ArrayList<>();

		Connection conn = genericDAOMySQL.getConnection();
		String cmdSQL = "SELECT numero, nome, nomeCidade FROM time";

		PreparedStatement preparedStatement = conn.prepareStatement(cmdSQL);
		ResultSet resultSet = preparedStatement.executeQuery();

		while (resultSet.next()) {
			Time time = new Time();
			time.setNumero(resultSet.getInt("numero"));
			time.setNome(resultSet.getString("nome"));
			time.setNomeCidade(resultSet.getString("nomeCidade"));

			times.add(time);
		}

		resultSet.close();
		preparedStatement.close();
		conn.close();

		return times;
	}
}
