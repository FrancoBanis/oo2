package state.toDoItem;

import java.time.Duration;
import java.time.LocalDateTime;

public class InProgress extends State {

	@Override
	protected void start() {

	}

	@Override
	protected void togglePause() {
		this.todoitem.setState(new Paused());

	}

	@Override
	protected void finish() {
		this.todoitem.setEnd(LocalDateTime.now());
		this.todoitem.setState(new Finished());

	}

	@Override
	protected Duration workedTime() {
		return Duration.between(this.todoitem.getStart(), LocalDateTime.now());
	}

	@Override
	protected void addComent(String comment) {
		this.todoitem.getComments().add(comment);
		
	}

}
