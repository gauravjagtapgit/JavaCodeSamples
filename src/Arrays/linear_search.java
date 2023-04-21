package Arrays;

public class linear_search {
	
	public static void main (String[]args) {
		int[]linear= {73,73,12,49,20};
		int search=12;
		for(int i=0;i<linear.length;i++) {
			if(linear[i]==search) {
				System.out.println("search no is present at ==> "+i+" "+"index position");
			}
		}
	 System.out.println("---------");
	 String[]linear1= {"gaurav","jagtap","At","belser","pune"};
	  String search1="pune";
	  String search2="jagtap";
	  for(int i=0;i<linear.length;i++) {
//		  if(linear1[i].equals(search1)) {  ------>> we can write this way or following way
		  if(linear1[i]==search1) {
			  System.out.println("search no is present at ==> "+i+" index position");
			  System.out.println("----------->>>><<<<----------");
		  }else if(linear1[i].equals(search2)) {
			  System.out.println("search no is present at ==> \"+i+\" index position");
		  }
	  }
	}

}
