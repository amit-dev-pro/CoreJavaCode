import java.util.*;

interface intr
{
	void input();
	void guesser();
}
class guesserGame implements intr
{
	int guesserMan;
	int player1;
	int player2;
	int player3;
	
	
	public void input()
	{
		System.out.println("Here enter that num. which will have guess by player ");
		Scanner sc=new Scanner(System.in);
		guesserMan=sc.nextInt();
		
		System.out.println("Here enter guess num. will have first player ");
		player1=sc.nextInt();
		System.out.println("Here enter guess num. will have second player ");
		player2=sc.nextInt();
		System.out.println("Here enter guess num. will have third player ");
		player3=sc.nextInt();
	}
	public void guesser()
	{
		input();
	    if(guesserMan==player1)
		{
			System.out.println("player1 won");
		}
		else if(guesserMan==player2)
		{
			System.out.println("player2 won");
		}
		else if(guesserMan==player3)
		{
			System.out.println("playre3 won");
		}
		else if(guesserMan==player1 && guesserMan==player2)
		{
			System.out.println("player1 and player2 won");
		}
		else if(guesserMan==player1 && guesserMan==player3)
		{
			System.out.println("player1 and player3 won");
		}
		else if(guesserMan==player2 && guesserMan==player3)
		{
			System.out.println("player2 and player3 won");
		}
	}
}
class abc implements Runnable
{
	synchronized public void run()
	{
		String name=Thread.currentThread().getName();
		int pri=Thread.currentThread().getPriority();
		System.out.println(name+" "+pri);
	}
}

public class project
{
  public static void main(String[]args) throws Exception
  {
	  abc a=new abc();
	  Thread t=new Thread(a);
	  Thread t1=new Thread(a);
	  
	  t.setName("Rahul");
	  t.setPriority(8);
	  
	  t1.setName("Rohit");
	  t1.setPriority(4);
	  
	  
	  t.start();
	  t1.start();
	  t.join();
	  
	 
	 // guesserGame gm=new guesserGame();
	  //gm.guesser();
     System.out.println("RADHE RADHE");
  }
}