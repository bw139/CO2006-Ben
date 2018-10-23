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

	
	// EXERCISE: 	define a request mapping for the following type of requests
	//				http://localhost:8080/addMinutes?goalId=0&id=0&minutes=20&activity=trekking
	
	 
	public String addMinutes(
			/* EXERCISE: modify the signature of the method */
		) {
		
		// The following code displays the URL that should have been invoked
//		System.out.println(
//				"http://localhost:8080/addMinutes?goalId=" + goalId + 
//				"&id=" + exercise.getId() + 
//				"&minutes=" + exercise.getMinutes() + 
//				"&activity=" + exercise.getActivity());
		
		// EXERCISE: find the goal with the given goalId (parameter request) in the list FitnessApp.goalList
		
		// EXERCISE: create a new exercise with the parameter requests and add it to the goal
		
		return "redirect:/";
	}
	
}
