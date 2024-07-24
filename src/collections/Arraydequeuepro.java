package collections;

import java.util.ArrayDeque;

public class Arraydequeuepro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque <String> li=new ArrayDeque<String>();
		
		li.add("hello");
		li.add("welcome");
		li.add("to");
		
		for(String data :li) {
			System.out.println(data);
		}
		li.addFirst("java");
		
		li.addLast("programming");
		System.out.println(li);
		
		li.poll();
		System.out.println(li);
		
		li.pollLast();
		System.out.println(li);
		
	}

}
