package StudyEndeavor;

public class StringBulderDemo {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Gaurav");
		
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println(sb.append("hi"));
		System.out.println(sb.reverse());
		System.out.println(sb.delete(3, 7));
		System.out.println(sb.deleteCharAt(1));
	}

}
