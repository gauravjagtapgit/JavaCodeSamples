package StudyEndeavor;

public class CarFactory {
	
	public MyCar craetcar(String make,String model) {
		return new MyCar(make,model);
	}
	public static void main(String[] args) {
		CarFactory cpny=new CarFactory();
		MyCar Info=cpny.craetcar("Lambo Official", "Lamborghini Huracan");
		MyCar Info2=cpny.craetcar("Aston Martin","DB12");
		System.out.println(Info.getmake()+" "+Info.getmodel());
		System.out.println(Info2.getmake()+" "+Info2.getmodel());
		
	}
}
