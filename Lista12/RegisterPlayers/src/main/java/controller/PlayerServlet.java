package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.Jogador;
import model.Time;
import persistence.GenericDAOMySQL;
import persistence.JogadorDAO;
import persistence.TimeDAO;

@WebServlet("/player")
public class PlayerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PlayerServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String consoleError = "";

		List<Time> times = new ArrayList<>();

		try {
			times = listTeam();
		} catch (SQLException | ClassNotFoundException e) {
			consoleError = e.getMessage();
		} finally {
			request.setAttribute("consoleError", consoleError);
			request.setAttribute("teams", times);

			RequestDispatcher rd = request.getRequestDispatcher("player.jsp");
			rd.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String cmdType = request.getParameter("button");

		String playerId = request.getParameter("playerId");
		String playerName = request.getParameter("playerName");
		String playerBirthDate = request.getParameter("playerBirthDate");
		String playerHeight = request.getParameter("playerHeight");
		String playerWeight = request.getParameter("playerWeight");
		String playerTeamId = request.getParameter("playerTeamId");

		String consoleOutput = "";
		String consoleError = "";

		List<Time> teams = new ArrayList<>();
		Player player = new Player();
		List<Player> players = new ArrayList<>();

		if (!cmdType.contains("List")) {
			player.setPlayerId(Integer.parseInt(playerId));
		}

		try {
			teams = listTeam();

			if (cmdType.contains("Register") || cmdType.contains("Update")) {
				player.setPlayerName(playerName);
				player.setPlayerBirthDate(LocalDate.parse(playerBirthDate));
				player.setPlayerHeight(Double.parseDouble(playerHeight));
				player.setPlayerWeight(Double.parseDouble(playerWeight));

				Time team = new Time();
				team.setTeamId(Integer.parseInt(playerTeamId));
				team = searchTeam(team);
				player.setPlayerTeam(team);
			}
			if (cmdType.contains("Search")) {
				player = searchPlayer(player);
			}
			if (cmdType.contains("Register")) {
				registerPlayer(player);
				consoleOutput = "Player registered successfully";
				player = null;
			}
			if (cmdType.contains("Update")) {
				updatePlayer(player);
				consoleOutput = "Player updated successfully";
				player = null;
			}
			if (cmdType.contains("Remove")) {
				removePlayer(player);
				consoleOutput = "Player removed successfully";
				player = null;
			}
			if (cmdType.contains("List")) {
				players = listPlayer();
			}
		} catch (SQLException | ClassNotFoundException e) {
			consoleError = e.getMessage();
		} finally {
			request.setAttribute("consoleOutput", consoleOutput);
			request.setAttribute("consoleError", consoleError);
			request.setAttribute("teams", teams);
			request.setAttribute("player", player);
			request.setAttribute("players", players);

			RequestDispatcher rd = request.getRequestDispatcher("player.jsp");
			rd.forward(request, response);
		}
	}

	private Time searchTeam(Time team) throws SQLException, ClassNotFoundException {
		GenericDAOMySQL genericDAOMySQL = new GenericDAOMySQL();
		TimeDAO teamDAO = new TimeDAO(genericDAOMySQL);

		team = teamDAO.search(team);
		return team;
	}

	private List<Time> listTeam() throws SQLException, ClassNotFoundException {
		GenericDAOMySQL genericDAOMySQL = new GenericDAOMySQL();
		TimeDAO teamDAO = new TimeDAO(genericDAOMySQL);

		List<Time> teams = teamDAO.list();
		return teams;
	}

	private Player searchPlayer(Player player) throws SQLException, ClassNotFoundException {
		GenericDAOMySQL genericDAOMySQL = new GenericDAOMySQL();
		JogadorDAO playerDAO = new JogadorDAO(genericDAOMySQL);

		player = playerDAO.search(player);
		return player;
	}

	private void registerPlayer(Player player) throws SQLException, ClassNotFoundException {
		GenericDAOMySQL genericDAOMySQL = new GenericDAOMySQL();
		JogadorDAO playerDAO = new JogadorDAO(genericDAOMySQL);

		playerDAO.register(player);
	}

	private void updatePlayer(Player player) throws SQLException, ClassNotFoundException {
		GenericDAOMySQL genericDAOMySQL = new GenericDAOMySQL();
		JogadorDAO playerDAO = new JogadorDAO(genericDAOMySQL);

		playerDAO.update(player);
	}

	private void removePlayer(Player player) throws SQLException, ClassNotFoundException {
		GenericDAOMySQL genericDAOMySQL = new GenericDAOMySQL();
		JogadorDAO playerDAO = new JogadorDAO(genericDAOMySQL);

		playerDAO.remove(player);
	}

	private List<Player> listPlayer() throws SQLException, ClassNotFoundException {
		GenericDAOMySQL genericDAOMySQL = new GenericDAOMySQL();
		JogadorDAO playerDAO = new JogadorDAO(genericDAOMySQL);

		List<Player> players = playerDAO.list();
		return players;
	}
}
