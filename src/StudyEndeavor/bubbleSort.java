package StudyEndeavor;

public class bubbleSort {
	
	public static void main(String [] args){

		  int [] a={45,67,33,20,12};
		   int temp;

		    for (int i=0; i<a.length; i++){

		            for(int j=0; j<a.length-1; j++){
		                if( a[j] > a[j+1] ){
		                 temp=a[j];
		                 a[j]=a[j+1];
		                  a[j+1]=temp;
		                }
		             }
		           }
		      for ( int i=0; i < a.length; i++){  
		           System.out.print(a[i]+" ");
		         }
		    }
}
