package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Linkedhasmaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	LinkedHashMap<Integer,String> mp=new LinkedHashMap<Integer,String>();
		mp.put(1, "hello");
		mp.put(2, "java");
		mp.put(3, "welcome");
		System.out.println();
		
		System.out.println("random access :"+mp.get(2));
		
		Set li =mp.entrySet();
		Iterator itr=li.iterator();
		
		while(itr.hasNext()) {
			Map.Entry entry =(Map.Entry)itr.next();
			System.out.println(entry.getKey() + ":" +entry.getValue());
		}

	}

}
