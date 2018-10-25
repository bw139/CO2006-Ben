package app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import app.domain.Exercise;
import app.domain.Goal;

@Controller
public class GoalController {
	
	// The following HTTP request is an example:
	// 	http://localhost:8080/addGoal?id=0&minutes=20&exerciseDesc=swimming
	@RequestMapping(value = "addGoal", method = RequestMethod.GET)
	public String updateGoal(@ModelAttribute Goal goal, @RequestParam(value="exerciseDesc", required=true) String exerciseDesc) {
		
		System.out.println(
				"http://localhost:8080/addGoal?Id=" + goal.getId() + 
				"&minutes=" + goal.getMinutes() + 
				"&exerciseDesc=" + exerciseDesc);
		
		Exercise exercise = new Exercise();
		exercise.setId(Long.valueOf(0));
		exercise.setActivity(exerciseDesc);
		List<Exercise> list = new ArrayList<Exercise>();
		list.add(exercise);
		goal.setExercises(list);
		
		FitnessApp.goalList.add(goal);
		
		return "redirect:/";
	}
	
	@RequestMapping(value = "getGoals", method = RequestMethod.GET)
	public String getGoals(Model model) {
		List<Goal> goals = FitnessApp.goalList;
		
		model.addAttribute("goals", goals);
		
		return "getGoals";
	}
	
}
