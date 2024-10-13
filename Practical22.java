class Vehicle
{
    Vehicle(){
        System.out.println("This is Vehicle .");
    }
}
class Car extends Vehicle
{
    Car(){
        System.out.println("Vehicle is Car");
    }
}
class Practical22 extends Car 
{
    Practical22(String name){
        System.out.println("This Car is "+name);
    }   
    public static void main(String[] args) {
        Practical22 p = new Practical22("ford");
    }
}

/* Output:
 *      This is Vehicle
 *      Vehicle is Car
 *      This Car is ford
 * 
*/