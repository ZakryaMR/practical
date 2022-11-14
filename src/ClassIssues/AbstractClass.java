/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ihsanullah.practical;

/**
 *
 * @author Aryan Soft
 */
abstract class Shape{
    abstract void draw();
}
//In real scenario, implementation is provided by others i.e. unknown by end user
class Rectangle extends Shape{
    void draw(){System.out.println("Rectangle");}
}
class Circle1 extends Shape{
    void draw(){System.out.println("Circle");}
}
//In real scenario, method is called by programmer or user
class TestAbstraction{
    public static void main(String args[]){
        Shape R =new Rectangle();
        R.draw();
        Shape s=new Circle1();//In a real scenario, object is provided through method, e.g., getShape() method
        s.draw();
    }
}