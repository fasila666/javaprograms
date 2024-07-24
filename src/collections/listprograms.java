package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class listprograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList li= new ArrayList();
		
		li.add("fasila");
		li.add(25);
		li.add("welcome");
		
		System.out.println("display list elemnts are"+li);
		
		li.add("rasiya");
		
		System.out.println("aceesing all the  elemnts are"+li);
		for(int i=0;i<li.size();i++) {
			
		}
		int i = 0;
		System.out.println(li.get(i));
		
		System.out.println("random access"+li.get(3));
		
		List li1=new ArrayList();
		li1.addAll(li);
		System.out.println("display list elemnts are"+li1);
		
		
		
		li1.clear();
		
		Iterator itr=li.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
