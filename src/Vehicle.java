public class Vehicle {

     public String Developer = " Developed By Kadyan Industries";
    public int numbers;
    public String model;
    public int size;
    public int seating;
    public double speed;
    public boolean isOpen;
    public boolean isDriver;


public Vehicle(int numbers, String model, int size, double speed, boolean isDriver, boolean isOpen, int seating){

this.numbers = numbers;
this.model = model;
this.size = size;
this.speed = speed;
this.isDriver = isDriver;
this.isOpen = isOpen;
this.seating = seating;
}

public int getNumber() {
    return numbers;
}

public String getModel() {
    return model;
}

public int getSize() {
    return size;
}

public int getSeating() {
    return seating;
}

public double getSpeed() {
    return speed;
}

public boolean isOpen() {
    return isOpen;
}

public boolean isDriver() {
        return isDriver;
}

public void getDeveloper()
{
    System.out.println(Developer);
}

}

