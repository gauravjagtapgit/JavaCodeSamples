package string;

public class string_methods { 
	public static void main(String[] args) {
//		remove space methods--1)trim()  2) replaceAll
//		1)trim()---remove befor & after space in sstring
		String space="  there they are  ";
		String removespace=space.trim();  //remove after & befor space
		System.out.println(removespace);
		 
		String removespace1=space.replaceAll("\\s", "");  //remove both word between space
		System.out.println(removespace1);
		
//		2)replaceAll()--remove two word between space
		String space2="ga u r a v";
		String removespace2=space2.replaceAll("\\s", "") ;
		System.out.println(removespace2);
		System.out.println();
	
	}

}
