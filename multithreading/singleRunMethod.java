package multithreading;

import java.util.*;

class message extends Thread
{
    public void run()
    {

        String name=Thread.currentThread().getName();
        if(name.equals("calc"))
        {
            calc();
        }
        else
        {
            sms();
        }
    }
    public void calc()
    {
        System.out.println("Enter the first number ");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        System.out.println("Enter the second number ");
        int num2=sc.nextInt();
        System.out.println("The addition of two number is "+(num1+num2));
    }
    public void sms()
    {
        System.out.println("Here enter the age prospective for voting ");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age<18)
        {
            System.out.println("you are under eighteen ");
        }
        else
        {
            System.out.println("you are eligible for voting ");
        }
    }

}
public class singleRunMethod {
    public static void main(String[ ]args){
        message m=new message();
        message m1=new message();
        m.setName("calc");
        m.start();

        System.out.println("RADHE RADHE");
    }
}
