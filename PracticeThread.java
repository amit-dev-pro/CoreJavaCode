import java.util.*;

class bahali
{
	void cal()
	{
		 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the age Here");
	 int age=sc.nextInt();
	  System.out.println("Enter the weight Here");
	 int weight=sc.nextInt();
	
	 if(age<0)
	 {
		 Exception e=new Exception("Negative number");
		  
		 if(age>=18 && weight>=48)
		 {
			 System.out.println("you are selected");
		 }
		 else
		 {
			 System.out.println("u r under weight or age, you will be check the re-medical ");
		 }
	 }
	 else
	 {
		 System.out.println("you are under the age you will get since ten days for re-medical");
	 }
 
	}
 
}
class ex implements Runnable 
{
	public void run()
	{
		String name=Thread.currentThread().getName();
		int p=Thread.currentThread().getPriority();
		System.out.println(name+" "+p);
	}
}

class myException extends Exception
{
	public myException(String sms)
	{
		super(sms);
	}
}
class nested
{
	void swap(int a,int b)
	{
		int temp=0;
		a=b;
		b=temp;
		System.out.println(a+" "+b);
	}
	int mai(int x,int y)
	{
		System.out.println(x+" "+y);
		swap(x,y);
		int product=x*y;
		return product;
	}
	
}
class student
{
	private String name="Amit Kumar";
	private int id=16844;
	public void students(String name,int id)
	{
		this.name=name;
		this.id=id;
		
	}
	public String getName()
	{
		return name;
	}
	public int getId()
	{
		return id;
	}
	public String toString()
	{
		return name;
	}
}
 

public class dd
{
  public static void main(String[]args) throws Exception
  {
	 // System.out.println(Integer.toBinaryString());
	 
	 student st=new student();
	 student st1=new student();
	 ArrayList al=new ArrayList();
	 al.add(st);
	 al.add(st1);
	 System.out.println(al);
	 
	 
	  
	  
	 //System.out.println(Integer.toBinaryString(-40>>2));
	 
     System.out.println("RADHE RADHE");
  }
}