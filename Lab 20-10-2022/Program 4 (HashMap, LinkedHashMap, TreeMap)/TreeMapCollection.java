package lab7;
import java.util.*;  
public class TreeMapCollection {

	public static void main(String[] args) {
		TreeMap<Integer,String> tmap=new TreeMap<Integer,String>();
		// Insertion
		tmap.put(1, "Meena");
		tmap.put(2, "Vikas");
		tmap.put(3, "Ashutosh");
		tmap.put(4, "Gyanendra");
		tmap.put(5, "Rajnish");
		System.out.println("Insertion: ");
		for(Map.Entry m: tmap.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
		}
		System.out.println();
		
		// Updation
		tmap.replace(3, "Pratham");
		tmap.replace(4, "Bhagyashree");
		System.out.println("Updation: ");
		for(Map.Entry m: tmap.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
		}
		System.out.println();
		
		// Deletion
		tmap.remove(2);
		tmap.remove(5);
		System.out.println("Deletion: ");
		for(Map.Entry m: tmap.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
		}
		System.out.println();
	}

}
