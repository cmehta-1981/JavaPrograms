package CollectionConcepts;

import java.util.Hashtable;
import java.util.Map;

public class HashTableConcepts {

	public static void main(String[] args) {
		
		Hashtable<String , String> ht = new Hashtable<String,String>();
		 ht.put("1", "Java");
		 ht.put("Selenium", "is great");
		 ht.put("key", "value");
		 
		 System.out.println("Iterate string key & value");
		 
		 for(Map.Entry m:ht.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
			  }
		 
		 System.out.println("Iterate integer key & value");
		 
		 Hashtable <Integer,String> hte = new Hashtable<Integer,String>();
		 hte.put(1, "Java");
		 hte.put(3, "is");
		 hte.put(2, "fun");
		 
		 for(Map.Entry m1:hte.entrySet()) {
			 System.out.println(m1.getKey()+" " + m1.getValue());
		 }
		 
		 
	}	
	
}
