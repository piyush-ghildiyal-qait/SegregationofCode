package mappractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapGenericStyle {
	
	
	public static void main(String[] args) {
		
		
   Map<Integer,String> map=new HashMap<Integer,String>();
   
   map.put(1,"piyush");
   map.put(2,"ayush");
   map.put(3, "vijay");
   
   
   for(Map.Entry m:map.entrySet()){  
	   System.out.println(m.getKey()+" "+m.getValue());  
	  }  

	}

}
