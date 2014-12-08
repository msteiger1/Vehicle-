package MainPackage;

public class TestVehicle {
	
	public static void main(String[] args){
		Person a= new Person();
		a.setFirstName("Melanie");
		a.setLastName("Steiger");
		a.setPersonID();
		Car Civic = new Car();
		Civic.Owner=a;
		Civic.NumberOfDoors=4;
		System.out.print(Civic.Owner.getFirstName());
		
		Truck F150 = new Truck();
		F150.Owner=a;
		F150.NumberOfAxels = 2;
		System.out.print(F150.Owner.getFirstName());
		
		
		Person b=new Person();
		b.setFirstName("Eric");
		b.setLastName("Enderson");
		b.setPersonID();
		
		F150.transferOwnership(b);
		System.out.print(F150.Owner.getFirstName());
		
		MotorCylce Harley = new MotorCylce();
		Harley.hasSideCar = false;
		
		
		
		
		
		
		
	


}
}