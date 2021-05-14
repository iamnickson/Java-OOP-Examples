class Car {  

	private int model;  // Common features of all cars
	private String manufacturer;

	public Car(int model, String manufacturer) {  // Constructor
		this.model = model;
		this.manufacturer = manufacturer;
	}

	public void printDetails() {

		System.out.println("The model of " + getClass().getSimpleName() + " is: " + model);
		System.out.println("The manufacturer of " + getClass().getSimpleName() + " is: " + manufacturer);
	}
}

interface IsSedan {

	int bootSpace = 420;  // Sedans have boot space
	void bootSpace();    // Every sedan must implement this
}

class Elantra extends Car implements IsSedan {  // Elantra is a Car and is a Sedan also

	private String variant;    // Elantra's data member

	public Elantra(int model, String variant) {  // Constructor
		super(model, "Hyundai");  // Calling the parent constructor with alredy known manufacturer
		this.variant = variant;  
	}

	@Override
	public void bootSpace() { // Implementation of the interface method
		System.out.println("The bootspace of Elantra is: " + IsSedan.bootSpace +" litres");
	}

	@Override
	public void printDetails() {  // Overriding the parent class's inherited method
		super.printDetails();    // Calling the method from parent class
		System.out.println("The variant of Elantra is: " + variant); // printing the data member of this class
	}
} 


class MultipleInheritance {

	public static void main(String[] args) {

		Elantra sport = new Elantra(2019, "Sport"); 
		Elantra eco = new Elantra(2018, "Eco");      

		sport.printDetails();    
		sport.bootSpace();       

		System.out.println();

		eco.printDetails();
		eco.bootSpace();
	}
}