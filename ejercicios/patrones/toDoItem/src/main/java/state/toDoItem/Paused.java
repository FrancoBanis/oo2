package state.toDoItem;

import java.time.Duration;
import java.time.LocalDateTime;

public class Paused extends State {

	@Override
	protected void start() {
	}

	@Override
	protected void togglePause() {
		this.todoitem.setState(new InProgress());

	}

	@Override
	protected void finish() {
		this.todoitem.setEnd(LocalDateTime.now());
		this.todoitem.setState(new Finished());

	}

	@Override
	protected void addComent(String comment) {
		this.todoitem.getComments().add(comment);
	}

	@Override
	protected Duration workedTime() {
		return Duration.between(this.todoitem.getStart(), LocalDateTime.now());
	}

}
