package state.toDoItem;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StateTest {
	
	ToDoItem tarea1, tarea2;
	State pending,inprogress,paused,finished;
	@BeforeEach
	void setUp() throws Exception {
		tarea1 = new ToDoItem("Agregar rutina");
		tarea2 = new ToDoItem("Eliminar rutina");
		pending = new Pending();
		inprogress = new InProgress();
		paused = new Paused();
		finished = new Finished();
	}

    @Test
    public void testToDo() {
    	tarea1.start();
    	tarea1.togglePause();
    }
    @Test
    public void testToDoWorkedTimePendingException() {
        assertThrows(RuntimeException.class, () -> tarea1.getState().workedTime());
    }
    @Test
    public void testToDoWorkedTime() {
    	tarea1.start();
    	tarea1.getState().workedTime();
    }
    
    @Test
    public void testToDoWorkedTimeTrue() {
        tarea1.start();
        tarea1.finish();
        Duration tiempo = tarea1.getState().workedTime();
        assertTrue(tiempo.getSeconds() >= 0);
    }
}
