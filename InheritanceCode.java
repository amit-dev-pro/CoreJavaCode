import java.awt.desktop.ScreenSleepEvent;
import java.util.*;
class demo1{
    int a,b;
    public demo1(){
        System.out.println("parent calss constructor");
    }
    public demo1(int x,int y){
        System.out.println("parameterized parent class constructor");
        a=x;
        b=y;
    }
}
class demo2 extends demo1{
    int m,n;
    public demo2(){
        //super(12,25);
        this(12,25);
        System.out.println("child class constructor");
    }
    public demo2(int x,int y){
        super();
        System.out.println("parameterized child class constructor");
        m=x;
        n=y;
    }
}

class aeroplane{
    public void takeOff(){
        System.out.println("the aeroplane is taking off now");
    }
    public void fly(){
        System.out.println("The aeroplane is taking off 400 fit height");
    }
}
class cargoPlane extends aeroplane{
    public void fly(){
        System.out.println("cargoplane is flying on 800 fit height");
    }
    public void takeOff(){
        System.out.println("cargoPlane is taking off rightnow");
    }
}
class passengerPlane extends aeroplane{
    public void fly(){
        System.out.println("passengerPlane is not stating rightNow");
    }
    public void carryPassenger(){
        System.out.println("the passengePlane carry the passenger");
    }
}
public class Main {
    public static void main(String[] args) {
        cargoPlane cp=new cargoPlane();

        passengerPlane pp=new passengerPlane();

        aeroplane ref;
        ref=cp;
        ref.fly();
        ref.takeOff();

        ref=pp;
        ref.fly();
        ref.takeOff();


        System.out.println("JAY RADHE KRISHNA ");
    }
}