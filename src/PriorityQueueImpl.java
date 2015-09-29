import java.util.Iterator;
import java.util.PriorityQueue;


public class PriorityQueueImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<String> priorityQueue=new PriorityQueue<String>();
		priorityQueue.add("test1");
		priorityQueue.add("test2");
		priorityQueue.add("test3");
		priorityQueue.add("test4");
		System.out.println(priorityQueue.peek()); //Retrieves the head element without removing the element
		System.out.println("The poll of this queue   "+priorityQueue.poll());//retrieves and removes the head of the queue
		System.out.println(priorityQueue.add("test4"));//adds the element but if unable to add element throws exception
		System.out.println(priorityQueue.element()); //returns same result as peek functtion except that if queue is already empty it throws exception
        Iterator<String> iter=priorityQueue.iterator();
		while(iter.hasNext()){
			System.out.println(priorityQueue);
        	priorityQueue.remove();
        }
	}

}
