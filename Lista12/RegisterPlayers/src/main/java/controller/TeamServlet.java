package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Time;
import persistence.GenericDAOMySQL;
import persistence.TimeDAO;

@WebServlet("/team")
public class TeamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public TeamServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("team.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String cmdType = request.getParameter("button");

		String teamId = request.getParameter("teamId");
		String teamName = request.getParameter("teamName");
		String teamCityName = request.getParameter("teamCityName");

		String consoleOutput = "";
		String consoleError = "";

		Time team = new Time();
		List<Time> teams = new ArrayList<>();

		if (!cmdType.contains("List")) {
			team.setTeamId(Integer.parseInt(teamId));
		}

		if (cmdType.contains("Register") || cmdType.contains("Update")) {
			team.setTeamName(teamName);
			team.setTeamCityName(teamCityName);
		}

		try {
			if (cmdType.contains("Search")) {
				team = searchTeam(team);
			}
			if (cmdType.contains("Register")) {
				registerTeam(team);
				consoleOutput = "Team registered successfully";
				team = null;
			}
			if (cmdType.contains("Update")) {
				updateTeam(team);
				consoleOutput = "Team updated successfully";
				team = null;
			}
			if (cmdType.contains("Remove")) {
				removeTeam(team);
				consoleOutput = "Team removed successfully";
				team = null;
			}
			if (cmdType.contains("List")) {
				teams = listTeam();
			}
		} catch (SQLException | ClassNotFoundException e) {
			consoleError = e.getMessage();
		} finally {
			request.setAttribute("consoleOutput", consoleOutput);
			request.setAttribute("consoleError", consoleError);
			request.setAttribute("team", team);
			request.setAttribute("teams", teams);

			RequestDispatcher rd = request.getRequestDispatcher("team.jsp");
			rd.forward(request, response);
		}

	}

	private Time searchTeam(Time team) throws SQLException, ClassNotFoundException {
		GenericDAOMySQL genericDAOMySQL = new GenericDAOMySQL();
		TimeDAO teamDAO = new TimeDAO(genericDAOMySQL);

		team = teamDAO.search(team);
		return team;
	}

	private void registerTeam(Time team) throws SQLException, ClassNotFoundException {
		GenericDAOMySQL genericDAOMySQL = new GenericDAOMySQL();
		TimeDAO teamDAO = new TimeDAO(genericDAOMySQL);

		teamDAO.register(team);
	}

	private void updateTeam(Time team) throws SQLException, ClassNotFoundException {
		GenericDAOMySQL genericDAOMySQL = new GenericDAOMySQL();
		TimeDAO teamDAO = new TimeDAO(genericDAOMySQL);

		teamDAO.update(team);
	}

	private void removeTeam(Time team) throws SQLException, ClassNotFoundException {
		GenericDAOMySQL genericDAOMySQL = new GenericDAOMySQL();
		TimeDAO teamDAO = new TimeDAO(genericDAOMySQL);

		teamDAO.remove(team);
	}

	private List<Time> listTeam() throws SQLException, ClassNotFoundException {
		GenericDAOMySQL genericDAOMySQL = new GenericDAOMySQL();
		TimeDAO teamDAO = new TimeDAO(genericDAOMySQL);

		List<Time> teams = teamDAO.list();
		return teams;
	}
}
