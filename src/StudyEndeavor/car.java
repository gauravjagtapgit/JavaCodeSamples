package StudyEndeavor;

public class car extends VehicleA{
	
	void  start() {
		System.out.println("car start with key");
	}
 
	@Override
	void tyre() {
	 super.tyer=4;
    	System.out.println("car tyer is="+tyer);
	}

     void carclass() {
    	 System.out.println("I am car claas ");
     }
//     public static void main(String[] args) {
//    	 car cr=new car(); 
//    		cr.start();
//    		cr.tyre();
//    		cr.carclass();
//    		cr.modelname("Honda civic");
//     }
}
