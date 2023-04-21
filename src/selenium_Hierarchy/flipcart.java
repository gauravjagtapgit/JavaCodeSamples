package selenium_Hierarchy;

public class flipcart {

	public static void main(String[] args) {
		wb brow=new google();
		brow.start();
		brow.login("gauravj00");
		brow.home("grocery");
		brow.close();
		
		System.out.println();
		
		wb brows=new safari();
		brows.start();
		brows.login("gj@00");
		brows.home("clothing");
		brows.close();
	}

}
