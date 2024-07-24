package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Setprograms {

	// HASH SET
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set li=new HashSet();
		
		li.add("hello");
		li.add(12);
		li.add("welcome");
		li.add(12);
		li.add(null);
		li.add(13);
		li.add(null);
		
		System.out.println(li);
// duplicate value accept cheyyyulla	
		
// LINKED HASH SET
		Set li1=new LinkedHashSet();
		li1.add("hello");
		li1.add(12);
		li1.add("welcome");
		li1.add(12);
		li1.add(null);
		li1.add(13);
		li1.add(null);
		System.out.println(li1);
// Sorted SET	
		
// not accept the NULL value
		TreeSet<String> li2=new TreeSet<>();
		li2.add("hello");
		li2.add("12");
		li2.add("welcome");
		li2.add("12");
		
		li2.add("13");
		
		System.out.println(li2);

	}

}
