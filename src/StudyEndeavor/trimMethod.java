package StudyEndeavor;

public class trimMethod {
	public static void main(String[] args) {
		String s=" gaurv ";
		String s2="jagatp";
		String s3="name";
		String s4="Name";
		String s5="g";
		String s6="G";
		
		
		String withpoutspace =s.trim();
		System.out.println(withpoutspace);
	    System.out.println(withpoutspace.concat(s2));
	    if(s3.isEmpty()) {
	    	System.out.println("String is empty");
	    }
	    else {
	    	System.out.println("String have containt");
	    }
	  System.out.println(s.compareTo(s2));  
	  System.out.println(s.indexOf(s));  
	  System.out.println(s.lastIndexOf(s));  
	  System.out.println(s.isBlank());  
	  System.out.println(s3.equals(s4));
	  System.out.println(s3.equalsIgnoreCase(s4));
	  System.out.println(s5.compareTo(s6));
	  System.out.println(s5.compareToIgnoreCase(s6));
	  
	}
	
	

}
