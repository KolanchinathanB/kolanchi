package OOPs;

import sun.applet.Main;

class Vehicle {
    int a=10;
    Vehicle(){
        System.out.println("Vehicle constructor called");       // constructor
    }
    int gear;
    int speed;
    int noOfwheels;
    String vehicleName;
    String msg="Super Class";
    static{
        System.out.println("static block in super class");           // static block
    }

    {
        System.out.println("instance block in super class");
    }
    static void display(){
        System.out.println("static block in super class");           // static block
    }
    void sum(){
        System.out.println("super-hi");
    }
}
class Bike extends Vehicle
{
    int gear;
    int speed;
    int noOfwheels;
    String vehicleName;
    Bike(String name,int g,int s,int n)
    {
        //System.out.println(super.msg);    //calling super class variable
        this.gear=g;
        this.noOfwheels=n;
        this.speed=s;
        this.vehicleName=name;
        System.out.println(name+","+g+","+s+","+n);
    }
    Bike(String name,int s,int n){
        this(name,4,s,n);             // calling same class constructor
        this.vehicleName=name;
        this.speed=s;
        this.noOfwheels=n;
    }

     static void display(){
        System.out.println("hi");
    }



}
class Car extends Vehicle
{
    int gear;
    int speed;
    int noOfwheels;
    String vehicleName;
    Car(String name,int g,int s,int n)
    {
        this.gear=g;
        this.noOfwheels=n;
        this.speed=s;
        this.vehicleName=name;
    }

}
class Bus extends Vehicle
{
    int gear;
    int speed;
    int noOfwheels;
    String vehicleName;
    Bus(String name,int g,int s,int n)
    {
        this.gear=g;
        this.noOfwheels=n;
        this.speed=s;
        this.vehicleName=name;
    }
}


public class MainInheritance extends Vehicle
{
    public static void main(String[] args)
    {
        int a=15;
        Bike bike=new Bike("Honda",4,2,150);  // object
        Bike bike1=new Bike("Tvs",2,100);
        Car car=new Car("BMW",5,4,200);
        Bus bus=new Bus("Bus",5,4,100);
    }
    void sum(){
        System.out.println("sub-hi");
    }

}


//1. We cannot assign a superclass to the subclass.
//        2. We cannot extend the final class.
//        3. A class cannot extend itself.
//        4. One class can extend only a single class.
// once obj created static block executed first then instance block
// static block only one time executed but instance executed each and every time creating obj
//   cannot reduce visibility super class members or method but can increase visibility
// does not support multiple inheritance using classes but support using interface
//suppose super class,sub class have a same method
    // 1-> create (sub-class)obj reference using super class => execute sub class method  ,(execute variable in super class)
    //  2->create (sub-class)obj reference using sub class   =>execute sub class method , same as method
    // 3->create (super-class)obj reference using super class  =>execute super class method ,same as method
// can access super class properties using super keyword
// can access same class properties using this keyword



