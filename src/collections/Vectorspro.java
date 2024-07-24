package collections;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Vectorspro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer > li=new Vector<Integer>();
		
		li.add(21);
		li.add(45);
		li.add(30);
		li.add(40);
		
		System.out.println("display all the elements are given"+li);
		
		Iterator itr=li.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		

	}

}
