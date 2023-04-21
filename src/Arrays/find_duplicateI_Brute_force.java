package Arrays;

public class find_duplicateI_Brute_force {

	public static void main(String[] args) {
		
//		1) first method Brute force method -----> This method have some drawbacks // disadvantages(collect the info--:) )
		
		int[]a= {3,5,4,3,2,2,1};
		
		System.out.println("Duplicat elements is :---->");
		
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				
				if((a[i]==a[j]) && (i !=j)){
					
					System.out.println(a[j]+" --> is duplicat element");
				}
			}
		}
	}
}
