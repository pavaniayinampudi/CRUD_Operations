package Dao;

import java.util.List;

import model.Team;

public interface TeamDAO {
	
	public void addTeam(Team team);
	public void updateTeam(Team team);
	public Team getTeam(int id);
	public void deleteTeam(int id);
	public List getTeams();
	

}
