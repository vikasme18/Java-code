package lab7;

import java.util.HashMap;
import java.util.Map;

public class HashMapCollection {

	public static void main(String[] args) {
		HashMap<Integer, String> numhm = new HashMap<Integer, String>();
		
		// Inserting
		numhm.put(1, "Vikas");
		numhm.put(2, "Ashutosh");
		numhm.put(3, "Gyanendra");
		numhm.put(4, "Ravishankar");
		numhm.put(5, "Bhagyashree");
		System.out.println("Insertion: ");
		for(Map.Entry m:numhm.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		}
		System.out.println();
			
		// Deleting
		numhm.remove(2);
		numhm.remove(5);
		System.out.println("Deletion: ");
		for(Map.Entry m:numhm.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		}
		System.out.println();
		
		// Replacing
		numhm.replace(3, "Sanjay");
		numhm.replace(1, "Om Singh");
		System.out.println("Updation: ");
		for(Map.Entry m:numhm.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		}
	}
}
