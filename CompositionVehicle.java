// Car class
class Car {
  
  // Declaring data members and methods
  private int id;
  private String model;
  private String color;

  public void carFeatures() { // Function to print out car features
    System.out.println("Car Model: " + model);
    System.out.println("Car Color: " + color);
  }
  
  public void setModel(String model) {
    this.model = model;
  }

  public void setColor(String color) {
    this.color = color;
  }
  
}

// Toyota Class, which is a child class of Car class.
class Toyota extends Car {
  
  // Inherits all properties of Car class
  public void setStart() {
    // Declaring an engine object and calling the start() function of the engine.
    ToyotaEngine engine = new ToyotaEngine();
    engine.start();
  }
  
}

// Engine class
class ToyotaEngine {
  
  // This function simply prints out on screen that Engine has been started!
  public void start() {
    System.out.println("Engine has been started.");
  }
  
  // This function simply prints out on screen that Engine has been stopped!
  public void stop() {
    System.out.println("Engine has been stopped.");
  }
  
}

class CompositionVehicle {

  public static void main(String[] args) {
    // Declaring and initializing Toyota object
    Toyota t = new Toyota();
    t.setModel("Fortuner");
    t.setColor("Silver");

    t.carFeatures();
    t.setStart(); 
  }
  
}

/*You have to create a Toyota class which inherits from a Car class, and is composed of an Engine

Note: You already know that in such a composition relation, the Toyota class will be responsible for Engine’s lifetime.

Consider this diagram for reference:

svg viewer
Car, Toyota and ToyotaEngine: Class Representation
You should implement the Toyota class as the child class of the Car. It should have an instance of ToyotaEngine and a setStart() function which in turn calls the start() function of the ToyotaEngine class.

The start() and stop() functions of ToyotaEngine class simply print out on screen that the engine has been started/stopped.*/