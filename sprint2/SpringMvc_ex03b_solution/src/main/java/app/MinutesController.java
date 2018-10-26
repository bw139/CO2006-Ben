package app;

import java.util.Optional;

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
			@RequestParam(value="goalId", required=false, defaultValue="0") Long goalId
		) {

		Optional<Goal> optionalGoal = FitnessApp.goalList.stream().filter(
				g -> g.getId().equals(goalId)).findFirst();
		
		if (optionalGoal.isPresent()) {
			optionalGoal.get().getExercises().add(exercise);
			exercise.setGoal(optionalGoal.get());
		}
		
		return "addMinutes";
	}
	
	// EXERCISE 2
	@RequestMapping(value = "addExercise", method = RequestMethod.POST)
	public String updateGoal(@ModelAttribute("exercise") Exercise exercise) {
		
		Optional<Goal> optionalGoal = FitnessApp.goalList.stream().filter(
				g -> g.getId().equals(exercise.getGoal().getId())).findFirst();
		
		if (optionalGoal.isPresent()) {
			optionalGoal.get().getExercises().add(exercise);
		}
		return "redirect:/";
	}
}
