package StudyEndeavor;

public class vehicleEstimate extends vehicle{
	int newversionprice=33;
	void carname() {
		System.out.println(super.company+"new,"+this.newversionprice);
	}
	void infoOfCar() {
		this.carname();
	}
    public static void main(String[] args) {
    	vehicleEstimate receptioniste=new vehicleEstimate();
    	receptioniste.buyer();
    	receptioniste.infoOfCar();
	
}
}
