package Strings;

import java.util.HashMap;
import java.util.Map;

public class OccurenceCount {
	
	public static void main(String[] args) {
		
		String str = "howtodoinjava.com";
		 
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		 
		char[] strArray = str.toCharArray();
		
		for (char c : strArray)
		{
		    if(map.containsKey(c))
		    {
		    	map.put(c, map.get(c)+1);
		    }
		    else
		    {
		    	map.put(c, 1);
		    }
		}
		 
		System.out.println(map);
		
		
	}
	

}
