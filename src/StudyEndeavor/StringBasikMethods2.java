package StudyEndeavor;

public class StringBasikMethods2 {
	public static void main(String[] args) {
		String s="Gaurav";
		String s2="jagtap";
		String s3="javaProgram is a language";
		String s4="This is demo is";
		String s5="G A U R A V";

		
		String a=s.concat(s+20+10);
		String a1=s.concat(20+10+s);
		String a2=s.concat(s+20/10);
		System.out.println("concat Mehod Result is==>"+a+","+a1+","+","+a2);
		
		String b=s.join("=","Name",s);
		String b1=s.join("=","surname",s2);
		String b2=s.join(",",s,s2);
		
		System.out.println("concat Mehod Result is==>"+b+","+b1+","+","+b2);
		
		System.out.println(s3.subSequence(4, 10));
		System.out.println(s3.substring(4));
		System.out.println(s3.substring(12,20));
		
		System.out.println(s4.replace("is","was"));
		System.out.println(s4.replaceFirst("is","was"));
		System.out.println(s4.replaceAll("is","was"));
		
		System.out.println(s4.replaceFirst(" ",""));
		String space1=s4.replaceAll("\\s","");
		System.out.println(space1);
		
		String space=s5.replaceAll("\\s","");
       System.out.println(space);
       
       System.out.println(s4.contains("is"));
       System.out.println(s4.indexOf("is"));
       System.out.println(s4.startsWith("T"));
       System.out.println(s4.endsWith("s"));
   
		
		
	}
	
}
