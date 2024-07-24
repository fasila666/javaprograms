import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Treemapspro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> mp=new TreeMap<Integer,String>();
		
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
