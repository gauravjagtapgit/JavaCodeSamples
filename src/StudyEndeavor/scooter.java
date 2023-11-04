package StudyEndeavor;

public class scooter extends VehicleA {
	
	void start() {
		System.out.println("car start with key");
	}
 
	@Override
	void tyre() {
	 super.tyer=2;
    	System.out.println("car tyer is="+tyer);
	}
	 void carclass() {
    	 System.out.println("I am car claas ");
     }
	 public static void main(String[] args) {
		 scooter cr2=new scooter(); 
    		cr2.start();
    		cr2.tyre();
    		cr2.carclass();
    		cr2.modelname("pagani");
    		System.out.println("---------------");
    		car cr=new car(); 
    		cr.start();
    		cr.tyre();
    		cr.carclass();
    		cr.modelname("Honda civic");
     }

}
