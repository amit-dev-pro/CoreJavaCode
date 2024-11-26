import java.util.*;
 
class synchro implements Runnable
{
	synchronized public void run()
	{
		try
		
		
		{
			String name=Thread.currentThread().getName();
		System.out.println(name+"has enter the car in parking slot ");
		Thread.sleep(3000);
		
		String  name1=Thread.currentThread().getName();
		System.out.println(name1+" drive the car on road ");
		Thread.sleep(3000);
		
		String name2=Thread.currentThread().getName();
		System.out.println(name2+"follow the car rules\n**************");
		Thread.sleep(3000);
		
		String name3=Thread.currentThread().getName();
		System.out.println(name3+"car is so expensive");
		}
		catch(Exception e)
		{
			System.out.println("some problem");	
		}
		
	}
}
 
public class thread
{
  public static void main(String[]args) throws Exception
  {
	 
	  
	  
	  synchro s=new synchro();
	  
	  Thread t1=new Thread(s);
	  Thread t2=new Thread(s);
	  Thread t3=new Thread(s);
	  
	  t1.setName("son-1");
	  t2.setName("son-2");
	  t3.setName("son-3");
	  
	  t1.start();
	  t2.start();
	  t3.start();
	  t1.join();
	  
	  
	   
	   
	  
    //System.out.println("RADHE RADHE");
  }
}