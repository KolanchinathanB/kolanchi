package OOPs;

import static java.lang.Math.pow;

abstract  class Abstraction
{
//    Abstraction(){
//        System.out.println("Abstract class");      // constructor
//    }
   static String msg="abstract class";         // static variable
   String message="cannot instantiated";           // non-static variable
   public static void message()
   {
       System.out.println(msg);                   // static method
   }
   public void newMessage()

   {
       System.out.println(message);            // non-static method
   }
   abstract void Area();                           // abstract method
   //abstract void Perimeter();
}
class Circle extends Abstraction
{
    final double PI=3.14;                     // final variable
   double radius;
    Circle(double r){
        this.radius=r;
    }           // constructor
       @Override
       void Area()
       {
           System.out.println("Circle Area is "+(PI*pow(radius,2)));       // override abstract method
       }
       void msg(){
        System.out.println("non-abstract method");
       }


}
class Square extends Abstraction
{
    double side;
    Square(double s){
        this.side=s;
    }
    @Override
    void Area()
    {
        System.out.println("Square Area is "+(pow(side,2)));
    }
}
class Rectangle extends Abstraction
{
      double length;
      double breath;
      Rectangle(double l,double b)
      {
          this.breath=b;
          this.length=l;
      }
    @Override
    void Area() {
        System.out.println("Rectangle Area is "+(length*breath));
    }
}
public class MainAbstraction
{
    public static void main(String[] args)
    {

        Circle c = new Circle(25);                // object creation
        Square s = new Square(21);
        Rectangle r = new Rectangle(12, 45);
        c.Area();
        s.Area();
        r.Area();
        c.message();
        r.newMessage();

         // Abstraction abs=new Circle(25);       // reference of super class(abstract)
        // abs.msg()            //--->  cannot called

    }
}

//abstraction cannot be instanciated , constructor allowed
// Atleast one abstract method having it's called abstract method
// class using keyword abstract
// if inheriting abstract class ,implement all the abstract method
// creating reference of superclass cannot accessed except superclass member,properties
// by default variable public final static ,can declare static method ,normal method

