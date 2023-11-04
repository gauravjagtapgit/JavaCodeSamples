package practice_36;

import java.util.Arrays;
public class converStringInSequence {
	public static void main(String[] args) {
		
		String a="Welcome";
		a= a.toLowerCase();
		char [] s=a.toCharArray();
		Arrays.sort(s);
		
		int temp;
		for (int i=0;i<=s.length;i++) {
			for (int j=i+1;j<s.length;j++) {
				if (s[i]>s[j]) {
					temp=s[i];
					s[i]=s[j];
					s[j]=(char) temp;
				}
			}
		}
		
		 System.out.println(s);
	}

}
