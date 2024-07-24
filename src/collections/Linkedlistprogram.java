package collections;

import java.util.LinkedList;
import java.util.List;

public class Linkedlistprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> li=new LinkedList<String>();
		
		li.add("anu");
		li.add("21");
		li.add("anu");
		li.add("the class is good");
		
		
		System.out.println("display all the elements are given"+li);
		for(String data :li) {
			System.out.println(data);
		}

	}

}
