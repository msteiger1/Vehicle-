package MainPackage;




public abstract class Vehicle implements VehicleInterface{
	
	String Name;
	String Color;
	double Weight;
	Person Owner;
	
	protected void transferOwnership(Person newOwner){
		this.Owner = newOwner;
	}
	

}
