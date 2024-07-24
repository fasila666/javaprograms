package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Mapsprograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> mp=new HashMap<Integer,String>();
		
		mp.put(1, "hello");
		mp.put(2, "java");
		mp.put(3, "welcome");
		System.out.println();
		
		System.out.println("random access :"+mp.get(2));

// method is used to collection to map
		Set li =mp.entrySet();
		Iterator itr=li.iterator();
// this we want to use while loop , for loop and not wroking
		while(itr.hasNext()) {
// type casting colllection to map
			Map.Entry entry =(Map.Entry)itr.next();
			System.out.println(entry.getKey() + ":" +entry.getValue());
		}
		

	}

}
