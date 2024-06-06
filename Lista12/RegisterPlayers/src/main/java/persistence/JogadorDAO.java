package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Jogador;
import model.Time;

public class JogadorDAO implements ICRUD<Jogador> {

	private GenericDAOMySQL genericDAOMySQL;

	public JogadorDAO(GenericDAOMySQL genericDAOMySQL) {
		super();
		this.genericDAOMySQL = genericDAOMySQL;
	}

	@Override
	public void register(Jogador jogador) throws SQLException, ClassNotFoundException {
		Connection conn = genericDAOMySQL.getConnection();
		String cmdSQL = "INSERT INTO jogador VALUES (?, ?, ?, ?, ?, ?)";

		PreparedStatement preparedStatement = conn.prepareStatement(cmdSQL);
		preparedStatement.setInt(1, jogador.getNumero());
		preparedStatement.setString(2, jogador.getNome());
		preparedStatement.setDate(3, java.sql.Date.valueOf(jogador.getDataNasc()));
		preparedStatement.setDouble(4, jogador.getAltura());
		preparedStatement.setDouble(5, jogador.getPeso());
		preparedStatement.setInt(6, jogador.getTime().getNumero());

		preparedStatement.execute();
		preparedStatement.close();
		conn.close();
	}

	@Override
	public void update(Jogador jogador) throws SQLException, ClassNotFoundException {
		Connection conn = genericDAOMySQL.getConnection();
		String cmdSQL = "UPDATE jogador SET nome = ?, dataNasc = ?, altura = ?, peso =  ?, numTime = ? WHERE numero = ?)";

		PreparedStatement preparedStatement = conn.prepareStatement(cmdSQL);
		preparedStatement.setString(1, jogador.getNome());
		preparedStatement.setDate(2, java.sql.Date.valueOf(jogador.getDataNasc()));
		preparedStatement.setDouble(3, jogador.getAltura());
		preparedStatement.setDouble(4, jogador.getPeso());
		preparedStatement.setInt(5, jogador.getTime().getNumero());
		preparedStatement.setInt(6, jogador.getNumero());

		preparedStatement.execute();
		preparedStatement.close();
		conn.close();
	}

	@Override
	public void remove(Jogador jogador) throws SQLException, ClassNotFoundException {
		Connection conn = genericDAOMySQL.getConnection();
		String cmdSQL = "DELETE FROM jogador WHERE numero = ?";

		PreparedStatement preparedStatement = conn.prepareStatement(cmdSQL);
		preparedStatement.setInt(1, jogador.getNumero());

		preparedStatement.execute();
		preparedStatement.close();
		conn.close();
	}

	@Override
	public Jogador search(Jogador jogador) throws SQLException, ClassNotFoundException {
		Connection conn = genericDAOMySQL.getConnection();
		StringBuffer cmdSQL = new StringBuffer();
		cmdSQL.append("SELECT jogador.numero AS numero, jogador.nome AS nome, ");
		cmdSQL.append("jogador.dataNasc AS dataNasc, jogador.altura AS altura, ");
		cmdSQL.append("jogador.peso AS peso, ");
		cmdSQL.append("time.numero AS numeroTime, time.nome AS nomeTime, time.nomeCidade AS cidade ");
		cmdSQL.append("FROM time, jogador ");
		cmdSQL.append("WHERE time.numero = jogador.numTime ");
		cmdSQL.append("AND jogador.numero = ?");

		PreparedStatement preparedStatement = conn.prepareStatement(cmdSQL.toString());
		preparedStatement.setInt(1, jogador.getNumero());
		ResultSet resultSet = preparedStatement.executeQuery();

		if (resultSet.next()) {
			Time time = new Time();

			time.setNumero(resultSet.getInt("numeroTime"));
			time.setNome(resultSet.getString("nomeTime"));
			time.setNomeCidade(resultSet.getString("nomeCidade"));

			jogador.setNumero(resultSet.getInt("numero"));
			jogador.setNome(resultSet.getString("nome"));
			jogador.setDataNasc(resultSet.getDate("dataNasc").toLocalDate());
			jogador.setAltura(resultSet.getDouble("altura"));
			jogador.setPeso(resultSet.getDouble("peso"));
			jogador.setTime(time);
		}

		resultSet.close();
		preparedStatement.close();
		conn.close();

		return jogador;
	}

	@Override
	public List<Jogador> list() throws SQLException, ClassNotFoundException {
		List<Jogador> jogadores = new ArrayList<>();

		Connection conn = genericDAOMySQL.getConnection();
		StringBuffer cmdSQL = new StringBuffer();
		cmdSQL.append("SELECT jogador.numero AS numero, jogador.nome AS nome, ");
		cmdSQL.append("jogador.dataNasc AS dataNasc, jogador.altura AS altura, ");
		cmdSQL.append("jogador.peso AS peso, ");
		cmdSQL.append("time.numero AS numeroTime, time.nome AS nomeTime, time.nomeCidade AS cidade ");
		cmdSQL.append("FROM time, jogador ");
		cmdSQL.append("WHERE time.numero = jogador.numTime");

		PreparedStatement preparedStatement = conn.prepareStatement(cmdSQL.toString());
		ResultSet resultSet = preparedStatement.executeQuery();

		while (resultSet.next()) {
			Time time = new Time();
			time.setNumero(resultSet.getInt("numeroTime"));
			time.setNome(resultSet.getString("nomeTime"));
			time.setNomeCidade(resultSet.getString("cidade"));

			Jogador jogador = new Jogador();
			jogador.setNumero(resultSet.getInt("numero"));
			jogador.setNome(resultSet.getString("nome"));
			jogador.setDataNasc(resultSet.getDate("dataNasc").toLocalDate());
			jogador.setAltura(resultSet.getDouble("altura"));
			jogador.setPeso(resultSet.getDouble("peso"));
			jogador.setTime(time);

			jogadores.add(jogador);
		}

		resultSet.close();
		preparedStatement.close();
		conn.close();

		return jogadores;
	}
}
