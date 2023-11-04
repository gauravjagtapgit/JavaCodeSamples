package StudyEndeavor;

import java.util.Arrays;

public class arrayMethod {
	public static void main(String[] args) {
	
		int [] a= {55,44,33,22,11,77};
		
		for(int i=0;i<=a.length-1;i++) {
			System.out.println(a[i]);
			
		}
		for(int list:a) {
			System.out.print(list+",");
		}
		System.out.println(a[0]);
		int[]b=new int[5]; 
		a[0]=4;
		a[1]=7;
		a[2]=8;
		a[3]=12;
		a[4]=66;
		a[5]=61;
		
		Arrays.sort(b);
		for(int j=0;j<b.length;j++) {
		System.out.println(b[j]);
		}
		
		int ar[][]= {{10,20,30},{40,50,60},{70,80,90}};
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar.length;j++) {
			
			System.out.println(ar[i][j]);
		}
		}
	}

}
