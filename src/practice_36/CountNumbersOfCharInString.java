package practice_36;

public class CountNumbersOfCharInString {

	public static void main(String[] args) {
		String string="Hello Guys";
		int count=0;
		for(int i=0;i<string.length();i++) {
		   if (string.charAt(i) != ' ') {
			   count ++;
		   }
		}
		System.out.println("Number of char in String==>"+count);
	}

}
