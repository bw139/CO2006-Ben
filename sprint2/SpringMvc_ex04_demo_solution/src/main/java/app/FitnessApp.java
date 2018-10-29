package app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import app.domain.Exercise;
import app.domain.Goal;

@SpringBootApplication
public class FitnessApp extends WebMvcConfigurerAdapter implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(FitnessApp.class, args);
    }
    
    public static List<Goal> goalList = new ArrayList<>();
    
    public void run(String... args) {
    	Goal goal = new Goal();
    	goal.setId(Long.valueOf(0));
    	goal.setMinutes(60);
    	goal.setDescription("60 minutes");
    	
    	List<Exercise> exerciseList = new ArrayList<>();
    	
    	Exercise exercise = new Exercise();
    	exercise.setId(Long.valueOf(1));
    	exercise.setActivity("running");
    	exercise.setGoal(goal);
    	exercise.setMinutes(30);
    	exerciseList.add(exercise);
    	
    	exercise = new Exercise();
    	exercise.setId(Long.valueOf(2));
    	exercise.setActivity("walking");
    	exercise.setGoal(goal);
    	exercise.setMinutes(30);
    	exerciseList.add(exercise);
    	
    	goal.setExercises(exerciseList);
    	goalList.add(goal);
    	
    	
    	// GOAL 2
    	goal = new Goal();
    	goal.setId(Long.valueOf(3));
    	goal.setMinutes(30);
    	goal.setDescription("Quick goal (30 minutes)");
    	
    	exerciseList = new ArrayList<>();
    	
    	exercise = new Exercise();
    	exercise.setId(Long.valueOf(4));
    	exercise.setActivity("running");
    	exercise.setGoal(goal);
    	exercise.setMinutes(30);
    	exerciseList.add(exercise);
    	
    	goal.setExercises(exerciseList);
    	goalList.add(goal);
    	
    	
    }
}
