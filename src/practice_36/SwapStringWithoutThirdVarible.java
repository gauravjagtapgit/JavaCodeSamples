package practice_36;

public class SwapStringWithoutThirdVarible {

	public static void main(String[] args) {
		
		String s1="good";
		String s2="evening";
		
		s2=s1.concat(s2);
		s1=s2.replace(s1,"");
		s2=s2.replace(s1,"");
		

		System.out.println(s1);
		System.out.println(s2);

	}

}
