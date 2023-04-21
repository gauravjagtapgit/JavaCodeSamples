package string;

public class updat_string_replace {

	public static void main(String[] args) {
//		1)replace , 2)replaceFirst, 3)replaceAll
		String s4="this is demo";
//	1)replace();
		System.out.println(s4.replace("is", "was"));//replace odd word in new(found is they replace with was)
		System.out.println(s4.repeat(2));
		System.out.println(s4.replace("is", "null"));
		 
//		2)replaceFirsr();---replace only first sting 
		System.out.println(s4.replaceFirst("is", "was")); //second is not replace
		
//		3)replaceAll();--replace all & reject aother string to use *opretor
		System.out.println(s4.replaceAll("is", "was"));
		System.out.println(s4.replaceAll("is(.*)", "was"));//remove is after string--regex
		System.out.println(s4.replaceAll("is(./)", "was")); //does not effect other opretors
	}

}
