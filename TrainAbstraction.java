/*Railway management system
For this coding exercise, you are required to implement the train management component. You are given three entities: Train, PassengerTrain, and CargoTrain.

Train: This should be an abstract class, therefore, its object can not be created. It should contain the following attributes:
name variable
capacity variable
getDetails() function
PassengerTrain: This should be a Java class that inherits all properties of the Train class.
CargoTrain: This should also be a Java class that inherits all characteristics of the Train class.
The getDetials() method should also be defined in the inherited classes. For a passenger train named "Orient Express", which contains the capacity of "300" people, this function should return the following string:

Orient Express is a passenger train having a capacity of 300 passengers.
Similarly, for a cargo train called "Night Mail", which contains the capacity of "1000" tons, the getDetails() method would return the following string:

Night Mail is a cargo train having a capacity of 1000 tons.
The skeleton code is already given to get you started.*/

abstract class Train {
    protected String name;
    protected int capacity;

    public Train(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
    }
    
    public String getDetails(){
        return this.name+" is a train of capasity "+this.capacity;
    }
}

//Make necessary changes in the classes given below
class CargoTrain extends Train{

    public CargoTrain(String name, int capacity){
        super(name, capacity);
    }
    
    public String getDetails(){
		String retu = super.name+" is a cargo train having a capacity of "+super.capacity+" tons.";
        return retu;
    }
}

class PassengerTrain extends Train{
	
    public PassengerTrain(String name, int capacity){
		super(name, capacity);
    }

    public String getDetails(){
		String retu = super.name+" is a passenger train having a capacity of "+super.capacity+" passengers.";
        return retu;
    }
}

public class TrainAbstraction {
    public static void main(String[] args)
    {
        Train s1 = new PassengerTrain("Orient Express", 300);
        Train s2 = new CargoTrain("Night Mail", 1000);
		
        System.out.println(s1.getDetails());
        System.out.println(s2.getDetails());
    }
}