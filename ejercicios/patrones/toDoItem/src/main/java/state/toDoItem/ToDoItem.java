package state.toDoItem;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ToDoItem {
	private List<String> comments;
	private LocalDateTime start;
	private LocalDateTime end;
	private State state;
	private String name;
	public ToDoItem(String name) {
		this.name = name;
		this.state = new Pending();
		this.state.todoitem = this;
		comments = new ArrayList<>();
	}
	public void start() {
		this.state.start();
		
	}
	public void togglePause() {
		this.state.togglePause();
	}
	public void finish() {
		this.state.finish();
	}
	public void setState(State state) {
		this.state = state;
		this.state.todoitem = this;
	}
	public List<String> getComments() {
		return this.comments;
	}
	public LocalDateTime getStart() {
		return start;
	}
	public void setStart(LocalDateTime start) {
		this.start = start;
	}
	public LocalDateTime getEnd() {
		return end;
	}
	public void setEnd(LocalDateTime end) {
		this.end = end;
	}
	public State getState() {
		return this.state;
	}
}
