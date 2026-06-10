package state.toDoItem;

import java.time.Duration;

public class Finished extends State {

	@Override
	protected void start() {

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
	}

	@Override
	protected Duration workedTime() {
		return Duration.between(this.todoitem.getStart(), this.todoitem.getEnd());
	}

}
