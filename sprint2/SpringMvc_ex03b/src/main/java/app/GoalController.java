package app;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import app.domain.Goal;

@Controller
public class GoalController {
	
	@RequestMapping(value = "addGoal", method = RequestMethod.GET)
	public String addGoal(@ModelAttribute Goal goal) {
		return "addGoal";
	}
	
	@RequestMapping(value = "getGoals", method = RequestMethod.GET)
	public String getGoals(Model model) {
		List<Goal> goals = FitnessApp.goalList;
		
		model.addAttribute("goals", goals);
		
		return "getGoals";
	}
	
	// EXERCISE 1: post goals
	
}
