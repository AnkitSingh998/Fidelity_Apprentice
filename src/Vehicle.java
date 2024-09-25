public class Vehicle {

    String registration;
    String brand;

    public Vehicle(String registration, String brand) {
        this.registration = registration;
        this.brand = brand;
    }
    public double calculateParkingFee()
    {
        return 0;
    }

}

class Car extends Vehicle {
    int numDoors;
    public Car(String registration, String brand, int numDoors) {
        super(registration, brand);
        this.numDoors = numDoors;
    }
    @Override
    public double calculateParkingFee()
    {
        return 50.0;
    }
}
class Motorcycle extends Vehicle {
    String engineType;
    public Motorcycle(String registration, String brand, String engineType) {
        super(registration, brand);
        this.engineType = engineType;
    }
    @Override
    public double calculateParkingFee(){
        return 20.0;
    }
}

