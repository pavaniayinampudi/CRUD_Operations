package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Dao.TeamDAO;
import model.Team;

@Service
@Transactional
public class TeamServiceImp implements TeamService {

	@Autowired
	TeamDAO teamDao ; 
	
	
	public void addTeam(Team team) {
		System.out.println("service");
		teamDao.addTeam(team);
	}


	public void updateTeam(Team team) {
		teamDao.updateTeam(team);
	}

	public Team getTeam(int id) {
		// TODO Auto-generated method stub
		return teamDao.getTeam(id);
	}

	
	public void deleteTeam(int id) {
		teamDao.deleteTeam(id);

	}

	public List getTeams() {
		// TODO Auto-generated method stub
		return teamDao.getTeams();
	}

}
