package multithreading;


import java.util.*;
// Thread is a process and that is a lightweight process.In a whole process at a time many task work but all
// task are independent perform the work to each other;

/*
class message1 extends Thread
{
    public void run()
    {
        System.out.println("Enter the first number ");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        System.out.println("Enter the second number ");
        int num2=sc.nextInt();
        System.out.println("The addition of two number is "+(num1+num2)+"\n*************************************");

    }
}
class message2 extends Thread
{
    public void run()
    {
        try
        {
            Thread.sleep(15000);
            for(int i=0; i<4; i++)
            {
                System.out.println("Hard work is important for master skill");

            }

        }
        catch(Exception e)
        {
            System.out.println("some errors");
        }

    }
}

 */

class message3 implements Runnable
{
    public void run()
    {
        System.out.println("Enter the first numbmer ");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        System.out.println("Enter the second number ");
        int num2=sc.nextInt();
        System.out.println("The addition of two number is "+(num1+num2)+"\n******************************************");
    }
}
class message4 implements Runnable
{
    public void run()
    {
        for(int i=0; i<4; i++)
        {
            System.out.println("master skill is important for us");
        }
    }
}

public class exampleOfMultiThreading {
    public static void main(String[]args){
        /*
          String name=Thread.currentThread().getName();
          System.out.println(name);
          int p=Thread.currentThread().getPriority();
          System.out.println(p);
          System.out.println("After changing ************************* ");

          Thread t=Thread.currentThread();
          t.setName("amit");
          t.setPriority(2);

          String names=Thread.currentThread().getName();
          int priorities=Thread.currentThread().getPriority();
          System.out.println(names+" "+priorities);

         */

/*
        message1 sms1=new message1();
        message2 sms2=new message2();

        sms1.start();
        sms2.start();

 */


        message3 sms3=new message3();
        message4 sms4=new message4();

        Thread t1=new Thread(sms3);
        Thread t2=new Thread(sms4);

        t1.start();
        t2.start();

        System.out.println("RADHE RADHE");
    }
}
