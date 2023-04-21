package string;

public class join_methods {
	public static void main(String[] args) {
		String s1="gaurav";
		String s2="jagtap";
		// concat(),join(),subSequence(),substring() methods
		//1) concat()
		System.out.println(s1.concat(s2)); //join by concat method
		System.out.println(s1+10); // left to rigt 1st take strin 2nd int
		System.out.println(10+20+s1); //1st take int 2nd string
		System.out.println(s1+20/10);
//		System.out.println(s1+20-10); give error
		
//		2) join(delimeter,sequence element)--ststic method(delimeter n null,element null are fine
		System.out.println(String.join(" ", s1,s2));
		System.out.println(String.join(",", s1,s2));
		System.out.println(String.join("!",s1,s2,s1));
		System.out.println(String.join("zz",s1,s2,s1));
		
//		3) subSequence(int biginIndex,int endIndex)--negative value not allowd
		String s3="The Best Or Nothing";
		System.out.println(s3.subSequence(3,8));
		System.out.println(s3.subSequence(3,19)); //consider space in index
		
//		4)-I) type sustring(int biginingIndex)---write biginin index he automatic fill ending index
		System.out.println(s3.substring(8));
		System.out.println(s3.substring(11));
//		II) type sustring(int biginingIndex,int endIndex)--write bot bigining & ending
		System.out.println(s3.substring(8, 19));
		System.out.println(s3.substring(0, 3));
	}

}
