package multithreading;
import java.util.*;
class myThread implements Runnable
{
    public void run()
    {
        try
        {
            for(int i=0; i<4; i++)
            {
                System.out.println("consistency is the master skill of life");
                Thread.sleep(3000);
            }
        }
        catch(Exception e)
        {
            System.out.println("some problem");
        }

    }
}


public class joinAndisAlive {
    public static void main(String[]args) throws Exception {

        myThread thread=new myThread();
        Thread t=new Thread(thread);
        //System.out.println(t.isAlive());

        t.start();
        t.interrupt();







        System.out.println("RADHE RADHHE");
    }
}
