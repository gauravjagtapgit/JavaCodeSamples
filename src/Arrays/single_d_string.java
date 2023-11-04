package Arrays;

public class single_d_string {

		 public static void main(String[]args){
		 String[]name={"gaurav","jagtap","rutik","rahul","kunal","prasad"};
		 System.out.println(name[5]);
		for(int i=0;i<name.length;i++) {
			System.out.println(i+" -"+name[i]);
		}
		System.out.println("---------------------------");
		for(int i=name.length-1;i>=0;i--) {
			System.out.println(i+" -"+name[i]);
		  }
	    }
     }



//public class double_dimentional{
//public static void main(String[]args){
//int[][]a=new int[2][3];
//a[0][0]=10;
//a[0][1]=20;
//a[0][2]=30;
//
//a[1][0]=40;
//a[1][1]=50;
//a[1][2]=60;
//System.out.println(a[0][2]);
//for(int i=0;i<a.length;i++){
//	for(int j=0;j<a.length;j++) {
//System.out.println(i+" -"+a[i][j]);
//	}
//}
//}
//}