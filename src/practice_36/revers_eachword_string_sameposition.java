package practice_36;

public class revers_eachword_string_sameposition {
	
	
	    public static void main(String[] args) {
	        String input = "Hello World Java";
	        String[] words = input.split(" ");

	        for (int i = 0; i < words.length; i++) {
	            words[i] = reverseWord(words[i]);
	        }

	        String reversedString = String.join(" ", words);
	        System.out.println(reversedString);
	    }

	    private static String reverseWord(String word) {
	        char[] characters = word.toCharArray(); // Convert the word into a character array
	        int left = 0; // Pointer for the leftmost character
	        int right = characters.length - 1; // Pointer for the rightmost character

	        while (left < right) {
	            // Swap the characters at the left and right pointers
	            char temp = characters[left];
	            characters[left] = characters[right];
	            characters[right] = temp;

	            // Move the pointers towards the center
	            left++;
	            right--;
	        }

	        return new String(characters); // Convert the reversed character array back to a string and return it
	    }
	}