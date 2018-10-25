package app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import app.domain.Exercise;
import app.domain.Goal;


@Controller
public class MinutesController {

	@RequestMapping(value = "/addMinutes",  method = RequestMethod.GET)
	public String addMinutes( 
			@ModelAttribute ("exercise") Exercise exercise, 
			@RequestParam(value="goalId", required=true) Long goalId
		) {
		
		System.out.println(
				"http://localhost:8080/addMinutes?goalId=" + goalId + 
				"&id=" + exercise.getId() + 
				"&minutes=" + exercise.getMinutes() + 
				"&activity=" + exercise.getActivity());
		
		Goal goal = null;

		for (Goal g : FitnessApp.goalList) {
			if (g.getId() == goalId) {
				goal = g;
				break;
			}
		}
		
		if (goal != null) {
			goal.getExercises().add(exercise);
			exercise.setGoal(goal);
		}
		
		return "redirect:/";
	}
	
}
