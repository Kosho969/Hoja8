import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.PriorityQueue;

/**
 * @author Freddie
 *
 * @param <E>
 */
public class VectorHeap<E extends Comparable<E>> extends PriorityQueue<E>{
	
	PriorityQueue cola;
	
	public VectorHeap(){
		cola = new PriorityQueue();
	}
	
	/*
	 * @return the cola
	 */
	public PriorityQueue getCola() {
		return cola;
	}

	public void agregar(Paciente paciente){
		cola.add(paciente);
	}
		
	
	
	
	
	
}