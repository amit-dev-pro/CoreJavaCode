 
class vechile
{ 

void message()
{
	System.out.println("this is vechile ");
}
	 
}
class car extends vechile
{
	 void message()
	 {
		 System.out.println("this is child class");
	 }
	 void display()
	 {
		  message();
	      super.message();
	 }
	
}

class a
{
	a()
	{
		System.out.println("a is class constructor");
	}
	a(int x)
	{
		System.out.println(x);
	}
	
}
class s extends a
{
	s()
	{
		super(20);
		System.out.println("s class constructor");
	}
}



public class str{
  public static void main(String[]args){
	 s ss=new s();
	 
  
    System.out.println("RADHE RADHE");
  }
}