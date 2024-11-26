package DSA;
import java.util.*;

/*
 interface computer{
    void compileCode();
    void something();
}
class laptop implements computer{

    public void compileCode(){
       System.out.println("Enter the name ");
       Scanner sc=new Scanner(System.in);
       String name=sc.nextLine();
        System.out.println("you got 5 erors "+name);
    }
    public void something(){

        System.out.println("you got something erors");
    }
}
class desktop implements computer{
     private int a;
    public void compileCode(){

        System.out.println("you got 5 erors faster ");
    }
    public void something(){
        System.out.println("something is here present");
    }
}
class developer{
    public void buildApp(computer lp){
        System.out.println("build app");
        lp.compileCode();
        lp.something();

    }
}

 */

 interface a{
     public abstract void man();
     default void woman(){
         System.out.println("woman is so soft ");
     }
     static void women(){
         System.out.println("women is looking os pretty");
     }
 }

   interface man{

    public static final int age=90 ;
    abstract public void woman();
}
class son implements man{
     public void woman(){
        System.out.println("something");
    }
}
interface inf{
    int x=90;
}
class c implements inf{
    void m(){
         int x=50;
        System.out.println("something"+x);

    }
}
class A
{
    void some(){
        System.out.println("System");
    }
    class aa
    {
        public void demo(){
            System.out.println("this is demo class ");
        }
    }
}
@FunctionalInterface
 interface drive{
     public void car();
}

public class interfc{
    public static void main(String[]args){
         drive dr=()->System.out.println("driving.........");
         dr.car();


//        computer c=new laptop();
//        developer dv=new developer();
//        dv.buildApp(c);

//       a B=new b();
//        B.abc();
//        B.example();
//        a.otherEx();// static method is calling here
//        man m=new son();
//        m.woman();

//        A a1=new A();
//        A.aa a2 =a1.new aa();
//        a1.some();
//        a2.demo();

        System.out.println("RADHE RADHE ");
    }
}
