package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import model.Team;
import service.TeamService;

@Controller
public class MainController {
	
	@Autowired
	private TeamService teamService;
	
	
	@RequestMapping(value="/add")
    public ModelAndView addTeamPage() {
        ModelAndView modelAndView = new ModelAndView("add-team-form");
        modelAndView.addObject("team", new Team());
        return modelAndView;
    }
	
	@RequestMapping(value="/edit{id}",method=RequestMethod.GET)
    public ModelAndView editTeamPage(@PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView("edd-team-form");
        Team team = teamService.getTeam(id);
        modelAndView.addObject("team",team);
        return modelAndView;
    }
	@RequestMapping(value="/process")
    public ModelAndView addingTeam(@ModelAttribute Team team) {
		System.out.println("submitting the team");
 
        ModelAndView modelAndView = new ModelAndView("home");
        System.out.println("teamService     +"+teamService);
        teamService.addTeam(team);
 
        String message = "Team was successfully added.";
        modelAndView.addObject("message", message);
 
        return modelAndView;
    }
	
	 /*@RequestMapping(value="/team/edit/{id}", method=RequestMethod.POST)
	    public ModelAndView edditingTeam(@ModelAttribute Team team, @PathVariable Integer id) {
	 
	        ModelAndView modelAndView = new ModelAndView("home");
	 
	        teamService.updateTeam(team);
	 
	        String message = "Team was successfully edited.";
	        modelAndView.addObject("message", message);
	 
	        return modelAndView;
	    }*/
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
    public ModelAndView deleteTeam(@PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView("home");
        teamService.deleteTeam(id);
        String message = "Team was successfully deleted.";
        modelAndView.addObject("message", message);
        return modelAndView;
    }
	@RequestMapping(value="/list")
	public ModelAndView listTeam(){
		ModelAndView modelAndView = new ModelAndView("list-of-team");
		 List tea = teamService.getTeams();
		 System.out.println(tea.size());
       modelAndView.addObject("teams", teamService.getTeams());
		return modelAndView;
		
	}


}
