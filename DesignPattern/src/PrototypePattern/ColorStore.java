package PrototypePattern;

import java.util.HashMap;
import java.util.Map;

public class ColorStore {
	
	static Map<String, Color> colorMap = new HashMap<String, Color>(); 
	
	static {
		colorMap.put("BLUE", new BlueColor()); 
		colorMap.put("RED", new RedColor() ); 
	}
	
	 public static Color getColor(String colorName) 
	    { 
	        return (Color) colorMap.get(colorName).clone(); 
	    } 
}
