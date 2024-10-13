class Vehicle{
    Vehicle()
    {
        System.out.println("This is Vehicle");
    }
}
class Bike extends Vehicle
{
    Bike()
    {
        System.out.println("Vehicle is Bike");
    }
}
public class Practical23 extends Vehicle {
    Practical23()
    {
        System.out.println("Vehicle is cycle");
    }
    public static void main(String[] args) {
        Practical23 p = new Practical23();
        Bike b = new Bike();
    }
}
