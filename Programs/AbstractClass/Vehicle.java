public class Vehicle
{
	private String model;
	private String make;
	private String color;
	private String registrationNum;
	private String mfdYear;
	private double price;
	private int maxSpeed;
	private String ownerName;

	public void drive()
	{
		System.out.println("Vehicle [" + model + " - " + make + " - owned by " + ownerName + " is running at the speed - " + maxSpeed);
	}
 
}
