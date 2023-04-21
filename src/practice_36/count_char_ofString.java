package practice_36;

public class count_char_ofString {

	public static void main(String[] args) {
		
	// 1) count one charactor are get in our string ----->>>>that length
	
    String s="java programming java opps";
    int totalcount =s.length();
    int totalcount_afterRemoving=s.replace("a","").length();//total length after removing a
   int count= totalcount-totalcount_afterRemoving;
  System.out.println("number of a is ====>>> "+count);
  
  System.out.println("------->>>>><<<<<<--------");
  
  
  // 2) count total number of charactor in string
  
     String s1="java programming java opps";
   int count1=0;
   for(int i=0;i<s1.length();i++) {
	   if(s1.charAt(i)!= ' ') {
		   count1++;
	     }
      }
   System.out.println("total number of count is ====> "+count1);
	
	}

}
