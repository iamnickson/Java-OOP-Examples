// Vehicle class
class Vehicle {
  
   String model;
   int id;
  
   Vehicle(String model, int id) { // Parameterized constructor
	    this.id = id;
		this.model = model;
   }
  
}

class Driver {
  
   String driverName;
   Vehicle vehicle;
  
   Driver(String name, Vehicle v) { // Parameterized constructor
	    vehicle = v;
	    this.driverName = name;
   }
  
}

class AssociateVehicleMain {
  
   public static void main(String args[]) {
		// Creating a Vehicle object with model: "Volvo S60", and id: "4453"
		Vehicle vehicle = new Vehicle("Volvo S60", 4453); 
		// Creating a Driver object having name: "John" and passing the 
		// vehicle in its constructor
	    Driver driver = new Driver("John", vehicle);
	    System.out.println(driver.driverName + 
                         " is a driver of car Id: " + driver.vehicle.id);
   }
  
}

/*You have to implement a Vehicle class containing members i.e. id and model, and a Driver class such that there is an association between them.

A Driver has a driverName and a Vehicle object.

svg viewer
Driver, Vehicle: Class Representation
You have to create a vehicle with id: 4453, and model: Volvo S60. You also then have to create a Driver instance with the driverName: John, such that he is assigned the above mentioned vehicle.*/