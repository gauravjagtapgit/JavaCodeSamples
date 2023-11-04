package practice_36;

import java.util.Arrays;

public class checkTowStringAnarams {
	
	  public static boolean areAnagrams(String str1, String str2) {
	        // Remove spaces and convert to lowercase to make the comparison case-insensitive
	        str1 = str1.replaceAll("\\s", "").toLowerCase();
	        str2 = str2.replaceAll("\\s", "").toLowerCase();

	        // Check if the lengths of the strings are equal
	        if (str1.length() != str2.length()) {
	            return false;
	        }

	        // Convert strings to character arrays and sort them
	        char[] charArray1 = str1.toCharArray();
	        char[] charArray2 = str2.toCharArray();
	        Arrays.sort(charArray1);
	        Arrays.sort(charArray2);

	        // Compare the sorted character arrays
	        return Arrays.equals(charArray1, charArray2);
	    }

	    public static void main(String[] args) {
	        String string1 = "Listen";
	        String string2 = "Silent";
	        if (areAnagrams(string1, string2)) {
	            System.out.println("The two strings are anagrams.");
	        } else {
	            System.out.println("The two strings are not anagrams.");
	        }
	    }
	

}
