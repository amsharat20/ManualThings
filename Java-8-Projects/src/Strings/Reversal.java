package Strings;

public class Reversal {
	
	    public static void main(String[] args)
	    {
	        String str = "howtodoinjava.com";
	        String reverseString = recursiveSwap(str);
	        System.out.println(reverseString);
	    }
	     
	    static String recursiveSwap(String str)
	    {
	         if ((null == str) || (str.length() <= 1))
	         {
	                return str;
	         }
//	         System.out.println("x ->" +str.substring(1));
//	         System.out.println("y ->" +str.charAt(0));
	         return recursiveSwap(str.substring(1)) + str.charAt(0);
	    }
	}

