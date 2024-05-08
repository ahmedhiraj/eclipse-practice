
public class Plane {
	public void takeOff()
	{
		System.out.println("Plane is taking off");
	}
 public void fly()
 {
	 System.out.println("Plane is flying in the sky");
 }
 public void land()
 {
	 System.out.println("Plane is landing");
 }
}
class CargoPlane extends Plane{
	
 public void fly()
 {
	 System.out.println("Cargo Plane is flying in the sky");
 }
 public void CarryCargo()
 {
	 System.out.println("Cargo Plane is carrying loads");
 }
}
class PassengerPlane extends Plane{
	public void fly()
	 {
		 System.out.println("Passenger Plane is flying in the sky");
	 }
	 public void CarryPassenger()
	 {
		 System.out.println("Passenger Plane is carrying loads");
	 }
}
class FighterPlane extends Plane{
	public void fly()
	 {
		 System.out.println("Fighter Plane is flying in the sky");
	 }
	 public void CarryFighter()
	 {
		 System.out.println("Fighter Plane is carrying loads");
	 }
}
