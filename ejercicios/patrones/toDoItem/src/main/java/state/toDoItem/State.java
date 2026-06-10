package state.toDoItem;

import java.time.Duration;

public abstract class State {
	
	protected ToDoItem todoitem;
	
	
	protected abstract void start() ;
	protected abstract void togglePause();
	protected abstract void finish();
	protected abstract void addComent(String comment);
	protected abstract Duration workedTime();
}
