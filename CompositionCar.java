class Engine {
  
	private int capacity;
  
	public Engine(){
		capacity = 0;
	}
  
	public Engine(int cap) {
		capacity = cap;
	}
  
	public void engineDetails() {
		System.out.println("Engine details: " + capacity);
	}
  
}

class Tires {
  
	private int noOfTires;
  
	public Tires() {
		noOfTires = 0;
	}
  
	public Tires(int nt) {
		noOfTires = nt;
	}
  
	public void tireDetails() {
		System.out.println("Number of tyres: " +  noOfTires);
	}
  
}

class Doors {
  
	private int noOfDoors;
  
	public Doors() {
		noOfDoors = 0;
	}
  
	public Doors(int nod) {
		noOfDoors = nod;
	}
  
	public void doorDetails() {
		System.out.println("Number of Doors: " + noOfDoors);
	}
  
}

class Car {
  
	private Engine eObj;
	private Tires tObj;
	private Doors dObj;
	private String color;
  
	public Car(String col, int cap, int nt, int nod) {
		this.eObj = new Engine(cap);;
		this.tObj = new Tires(nt);;
		this.dObj = new Doors(nod);
    
		color = col;    
	}
  
	public void carDetail() {
		eObj.engineDetails();
		tObj.tireDetails();
		dObj.doorDetails();
		System.out.println("Car color: " + color);
	}
}
  
class CompositionCar {
  
	public static void main(String[] args) {
		Car cObj = new Car("Black", 1600, 4, 4);
		cObj.carDetail();
	}
}