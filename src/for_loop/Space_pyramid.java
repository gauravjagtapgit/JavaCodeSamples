package for_loop;

public class Space_pyramid {
	public static void main(String[] args) {
		for(int i=1;i<=8;i++) {
		for(int j=8;j>=1;j--) {
			if(j>=i) {
				System.out.print(" ");
			}else {
				System.out.print(" *");
			}
		}
		System.out.println();
	}
	
	}
}
