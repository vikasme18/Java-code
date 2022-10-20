package lab7;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapCollection {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> lhm=new LinkedHashMap<Integer,String>();
		
		// Insertion
		lhm.put(1, "Vikas");
		lhm.put(2, "Ashutosh");
		lhm.put(3, "Gyanendra");
		lhm.put(4, "Sham");
		lhm.put(5, "Rajnish");
		lhm.put(6, "Ravishankar");
		System.out.println("Insertion: ");
		for(Map.Entry m: lhm.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
		}
		System.out.println();
		
		// Updation
		lhm.replace(1, "Meena");
		lhm.replace(3, "Pratham");
		lhm.replace(5, "Bhagyashree");
		System.out.println("Updation: ");
		for(Map.Entry m: lhm.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
		}
		System.out.println();
		
		// Deletion
		lhm.remove(5);
		lhm.remove(2);
		lhm.remove(4);
		System.out.println("Deletion: ");
		for(Map.Entry m: lhm.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
		}
	}

}
