package MainPackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class VehicleTest {

	
	@Test
	public void test() {
		Person a= new Person();
		a.setFirstName("Melanie");
		Car Civic = new Car();
		Civic.Owner=a;
		Civic.NumberOfDoors=4;
		
		Truck F150 = new Truck();
		F150.NumberOfAxels = 2;
		
		Person b=new Person();
		b.setFirstName("Eric");
		b.setLastName("Enderson");
		
		F150.transferOwnership(b);
		System.out.print(F150.Owner.getFirstName());
		
		MotorCylce Harley = new MotorCylce();
		Harley.hasSideCar = false;
		
		assertEquals("Person a has the name Melanie","Melanie", a.getFirstName());
		assertEquals("The Civic has 4 doors", 4, Civic.NumberOfDoors);
		
	}
		
}