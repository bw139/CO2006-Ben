package app;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import app.domain.Exercise;
import app.domain.Goal;


@Controller
public class MinutesController {

	@RequestMapping(value = "/exercise/add",  method = RequestMethod.GET)
	public String addMinutes( 
			@ModelAttribute ("exercise") Exercise exercise, 
			@RequestParam(value="goalId", required=false, defaultValue="0") Long goalId
		) {

		Optional<Goal> optionalGoal = FitnessApp.goalList.stream().filter(
				g -> g.getId().equals(goalId)).findFirst();
		
		if (optionalGoal.isPresent()) {
			exercise.setGoal(optionalGoal.get());
		}
		
		return "addMinutes";
	}
	
	@RequestMapping(value = "/addExercise", method = RequestMethod.POST)
	public String addExercise(@ModelAttribute("exercise") Exercise exercise, Model model) {
		
		Optional<Goal> optionalGoal = FitnessApp.goalList.stream().filter(
				g -> g.getId().equals(exercise.getGoal().getId())).findFirst();
		
		if (optionalGoal.isPresent()) {
			Goal existingGoal = optionalGoal.get();
			Optional<Exercise> optionalExercise = existingGoal.getExercises().stream().filter(
					e -> 
					e.getId().equals(exercise.getId())
				).findFirst();
			
			if (optionalExercise.isPresent()) {
				Exercise existingExercise = optionalExercise.get();
				// update: only minutes and activity
				existingExercise.setMinutes(exercise.getMinutes());
				existingExercise.setActivity(exercise.getActivity());
			} else {
				// add
				if (exercise.getId()!=null)
					optionalGoal.get().getExercises().add(exercise);
				
			}
			model.addAttribute("goal", existingGoal);
			model.addAttribute("goalList", FitnessApp.goalList);
				
		}

		return "addGoal";
	}
	
	@RequestMapping(value = "/exercise/edit", method = RequestMethod.GET)
	public String editExercise(@RequestParam Long goalId, @RequestParam Long exerciseId, Model model) {
		
		Optional<Goal> optionalGoal = FitnessApp.goalList.stream().filter(
				g -> g.getId().equals(goalId)
			).findFirst();
		
		if (optionalGoal.isPresent()) {
			Goal existingGoal = optionalGoal.get();
			Optional<Exercise> optionalExercise = existingGoal.getExercises().stream().filter(
					e -> e.getId().equals(exerciseId)
				).findFirst();
			
			if (optionalExercise.isPresent()) {
				Exercise existingExercise = optionalExercise.get();
				model.addAttribute("exercise", existingExercise);
			}
		}
		return "addMinutes";
	}

	@RequestMapping(value = "/exercise/delete", method = RequestMethod.GET)
	public String deleteExercise(@RequestParam Long goalId, @RequestParam Long exerciseId, Model model) {
		
		Optional<Goal> optionalGoal = FitnessApp.goalList.stream().filter(
				g -> g.getId().equals(goalId)
				).findFirst();
		
		if (optionalGoal.isPresent()) {
			Goal existingGoal = optionalGoal.get();
			Optional<Exercise> optionalExercise = existingGoal.getExercises().stream().filter(
					e -> e.getId().equals(exerciseId)
					).findFirst();
			
			if (optionalExercise.isPresent()) {
				Exercise existingExercise = optionalExercise.get();
				existingGoal.getExercises().remove(existingExercise);
			}
			model.addAttribute("goal", existingGoal);
			model.addAttribute("goalList", FitnessApp.goalList);
		}
		
		return "addGoal";
	}
	
}
