package app;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import app.domain.Goal;

@Controller
public class GoalController {
	
	@RequestMapping(value = "addGoal", method = RequestMethod.GET)
	public String addGoal(@ModelAttribute Goal goal, Model model) {
		model.addAttribute("goalList", FitnessApp.goalList);
		return "addGoal";
	}
	
	@RequestMapping(value = "getGoals", method = RequestMethod.GET)
	public String getGoals(Model model) {
		List<Goal> goals = FitnessApp.goalList;
		
		model.addAttribute("goals", goals);
		
		return "getGoals";
	}
	
//	@RequestMapping(value = "addGoal", method = RequestMethod.POST)
//	public String postGoal(@ModelAttribute("goal") Goal goal) {
//		
//		FitnessApp.goalList.add(goal);
//		
//		return "redirect:/addMinutes?goalId=" + goal.getId();
//	}
	
	@RequestMapping(value = "addGoal", method = RequestMethod.POST)
	public String postGoal(@ModelAttribute("goal") Goal goal, Model model) {

		Optional<Goal> optionalGoal = FitnessApp.goalList.stream().filter(g -> g.getId() == goal.getId()).findFirst();
		if (optionalGoal.isPresent()) {
			//edit existing goal
			Goal existingGoal = optionalGoal.get();
			existingGoal.setId(goal.getId());
			existingGoal.setDescription(goal.getDescription());
			existingGoal.setMinutes(goal.getMinutes());
			model.addAttribute("goal", existingGoal);
		} else {
			// add new goal
			// set identifier
			goal.setId();
			FitnessApp.goalList.add(goal);
			model.addAttribute("goal", goal);
		}
		
		model.addAttribute("goalList", FitnessApp.goalList);
		
		return "addGoal";
	}

	@RequestMapping("selectGoal")
	public String selectGoal(@ModelAttribute("goal") Goal goal, Model model) {
		Optional<Goal> optionalGoal = FitnessApp.goalList.stream().filter(g -> g.getId() == goal.getId()).findFirst();
		if (optionalGoal.isPresent()) {
			Goal existingGoal = optionalGoal.get();
			model.addAttribute("goal", existingGoal);
			model.addAttribute("goalList", FitnessApp.goalList);
		}
		return "addGoal";
	}
	
}
