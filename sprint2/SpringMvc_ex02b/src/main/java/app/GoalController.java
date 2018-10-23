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
	

	// EXERCISE: define request mapping
	// 		The following HTTP request is an example:
	// 		http://localhost:8080/addGoal?id=0&minutes=20&exerciseDesc=swimming
	
	public String updateGoal(/* EXERCISE: create a new Goal with @ModelAttribute */) {
		
		// The following code displays the URL that should have
		// been invoked
		
//		System.out.println(
//				"http://localhost:8080/addGoal?Id=" + goal.getId() + 
//				"&minutes=" + goal.getMinutes() + 
//				"&exerciseDesc=" + exerciseDesc);


		
		// EXERCISE: 	uncomment the following code, which completes the goal 
		//				that has been created
		
		// initialize an exercise in that goal
//		Exercise exercise = new Exercise();
//		exercise.setId(Long.valueOf(0));
//		exercise.setActivity(exerciseDesc);
//		List<Exercise> list = new ArrayList<Exercise>();
//		list.add(exercise);
//		goal.setExercises(list);
		
//		FitnessApp.goalList.add(goal);
		
		return "redirect:/";
	}
	
	
	// EXERCISE: defined the request mapping for http://localhost:8080/getGoals
	// EXERCISE: modify the signature of the handler method if needed
	public String getGoals() {
		List<Goal> goals = FitnessApp.goalList;
	
		// EXERCISE: put data into the model so that the view can be displayed properly
		
		return "getGoals";
	}
	
}
