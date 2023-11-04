package StudyEndeavor;

 public abstract class VehicleA {
	
    int vehicle;
    String vehiclename;
    static int tyer;
    abstract  void start();
    
    abstract void tyre();
   
    void modelname(String vehiclename) {
    	System.out.println(vehiclename);
    	//this.modelname("Aston martin");
    }
//    void modelname() {
//    	
//  	System.out.println("car model name is="+this.formodel("Aston martin"));
//    }
    
}