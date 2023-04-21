package Arrays;

public class Single_dimentionl {

	public static void main(String[] args) {
			    int[] month_days=new int[12];
			    month_days[0]=31;
			    month_days[1]=28;
			    month_days[2]=31;
			    month_days[3]=30;
			    month_days[4]=31;
			    month_days[5]=30;
			    month_days[6]=28;
			    month_days[7]=29;
			    month_days[8]=30;
			    month_days[9]=28;
			    month_days[10]=31;
			    month_days[11]=31;
			    System.out.println("march has"+month_days[3]);
			System.out.println("-----------------------");
			 for(int i=0;i<month_days.length;i++){

			  System.out.println(month_days[i]);
			}
			 for(int i=0;i<month_days.length;i++){
				 System.out.println("------------------");
			    System.out.println(month_days[i]);
			 
			  if(month_days.equals(month_days[3])) {
				  System.out.println(month_days[i]);
				  break;
				 
			    }
			  }
			 
	           }
			}    

