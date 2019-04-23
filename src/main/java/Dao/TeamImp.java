package Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Team;

@Repository
public class TeamImp implements TeamDAO {

	@Autowired
    private SessionFactory sessionFactory;
	
	private Session getCurrentSession() {
		System.out.println("sessionFactory.getCurrentSession()   "+sessionFactory.getCurrentSession());
        return sessionFactory.getCurrentSession();
    }

	public void addTeam(Team team) {
		System.out.println("saving team"+  team);
		 getCurrentSession().save(team);
		
	}


	public void updateTeam(Team team) {
		Team toUpdate = getTeam(team.getId());
		toUpdate.setName(team.getName());
		toUpdate.setRating(team.getRating());
		getCurrentSession().update(toUpdate);
		
	}


	public Team getTeam(int id) {
		Team team = (Team) getCurrentSession().get(Team.class, id);
        return team;
	}

	
	public void deleteTeam(int id) {
		Team team = getTeam(id);
        if (team != null)
            getCurrentSession().delete(team);
    
	}

	
	public List getTeams() {
		 return getCurrentSession().createQuery("from Team").list();
	}
	
	

}
