package collections;

import java.util.PriorityQueue;

public class Queuepriority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue <String> li=new PriorityQueue<>();
		
		li.add("hello");
		li.add("welcome");
		for(String data: li) {
			
			System.out.println(data);
		}
		

	}

}
