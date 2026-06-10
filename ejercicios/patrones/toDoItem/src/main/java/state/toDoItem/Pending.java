package state.toDoItem;

import java.time.Duration;
import java.time.LocalDateTime;

public class Pending extends State{

	@Override
	protected void start() {
		this.todoitem.setStart(LocalDateTime.now());
		this.todoitem.setState(new InProgress());
		
	}

	@Override
	protected void togglePause() {
		throw new RuntimeException(
				"El objeto ToDoItem no se encuentra en pause o in-progress"
				);
		
	}

	@Override
	protected void finish() {
		
		
	}

	@Override
	protected void addComent(String comment) {
		this.todoitem.getComments().add(comment);
		
	}

	@Override
	protected Duration workedTime() {
		throw new RuntimeException(
				"La tarea todavia no fue inicializada."
				);
	}
	
}
