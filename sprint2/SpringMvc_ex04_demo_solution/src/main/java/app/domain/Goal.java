package app.domain;

import java.util.ArrayList;
import java.util.List;

public class Goal {
	static Long lastId = 0l;
	
	private Long id = -1l;

	private int minutes;

	private String description;
	
	private List<Exercise> exercises = new ArrayList<Exercise>();

	public List<Exercise> getExercises() {
		return exercises;
	}

	public void setId() {
		id = lastId;
		lastId++;
	}
	
	public Long getId() {
		return id;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setExercises(List<Exercise> exercises) {
		this.exercises = exercises;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
