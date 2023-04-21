package for_loop;

public class pyramid_downSide {

	public static void main(String[] args) {
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(" ");
				}
			for(int k=6; k>=i; k--) {
				System.out.print("*");
			}
			for(int l=5; l>=i; l--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}
