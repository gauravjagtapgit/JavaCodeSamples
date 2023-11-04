package practice_36;

public class RemoveOccurrCharFromInputString {

	public static void main(String[] args) {
		
		String a="I am going to school";
		char remove='o';
		String b=null;
		 
		for(int i=0; i<=a.length()-1;i++) {
			if(a.charAt(i)==remove) {
				b=a.replace("o", "");
						
			}
		}
		System.out.println("Orignal String is "+a);
		System.out.println("After removing of o is "+b);

	}

}
