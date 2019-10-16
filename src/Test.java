
public class Test {
	public static void main (String[] args)
	{
		String s = "RakibulSadik";
		
		// Returns the number of characters in the String. 
		System.out.println("String length: "+ s.length());
		
		// Returns the character at ith index. 
		System.out.println("Character at 3rd position: "+s.charAt(3));
		
		// Return the substring from the ith  index character 
        // to end of string 
		System.out.println(s.substring(7));
		
		// Returns the substring from i to j-1 index. 
		System.out.println(s.substring(0, 7));
		
		// Concatenates string2 to the end of string1. 
		String s1 = "Rakibul";
		
		String s2 = "Haque";
		
		System.out.println("Concated String: " + s1.concat(s2));
		
		String s4 = "learn JAVA";
		
		System.out.println("index: "+ s4.indexOf("JAVA"));
		
		// Returns the index within the string 
        // of the first occurrence of the specified string. 
		System.out.println("Index of a: "+s4.indexOf('a', 2));
		
		// Checking equality of Strings 
        Boolean out = "Geeks".equals("geeks"); 
        System.out.println("Checking Equality  " + out); 
        out = "Geeks".equals("Geeks"); 
        System.out.println("Checking Equality  " + out); 
        
        out = "Geeks".equalsIgnoreCase("gEeks "); 
        System.out.println("Checking Equality " + out); 
        
        String s5 = "SFJKLdfd";
        
     // Converting cases 
        System.out.println("change to lower case: "+s5.toLowerCase());
        
        String s6 = "rakibul";
     // Converting cases 
        System.out.println("change to upper case: "+s6.toUpperCase());
      

        // Trimming the word 
        String word4 = " Learn Share Learn "; 
        System.out.println("Trim the word " + word4.trim()); 
        
     // Replacing characters 
        String str1 = "feeksforfeeks"; 
        System.out.println("Original String " + str1); 
        String str2 = "feeksforfeeks".replace('f' ,'g') ; 
        System.out.println("Replaced f with g -> " + str2); 
        
        	
		
		
	}

}
