package string;

import java.util.Arrays;

public class Anagram {

	 public static boolean isAnagram(String s1, String s2) {
	        String str1 = s1.replaceAll("\\s", "");
	        String str2 = s2.replaceAll("\\s", "");

	        if (str1.length() != str2.length()) {
	            return false;
	        } else {
	            char[] c1 = str1.toLowerCase().toCharArray();
	            char[] c2 = str2.toLowerCase().toCharArray();

	            Arrays.sort(c1);
	            Arrays.sort(c2);

	            return Arrays.equals(c1, c2);
	        }
	    }

	    public static void main(String[] args) {
	    	String string1="Listen";
	    	String string2="Silent";
	    	
	        if(isAnagram(string1, string2)) {
	        	System.out.println("The Two String are Anagram");
	        }
	        else {
	        	System.out.println("The two String are Not Anagram");
	        }
	    }
	}


