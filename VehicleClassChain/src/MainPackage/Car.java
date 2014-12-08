package MainPackage;



public class Car extends Vehicle implements VehicleInterface{
	
	public Car(){
		
	}
	int NumberOfDoors;
	
	public int NumberOfDoors() {
		return NumberOfDoors;
	}

	public void setFirstName(int NumberOfDoors) {
		this.NumberOfDoors = NumberOfDoors;
	}


	@Override
	public String Name() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double Weight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String Color() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person Owner() {
		// TODO Auto-generated method stub
		return null;
	}

	

	

	

	}


