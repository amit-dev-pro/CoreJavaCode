package exceptionHandling;
import java.util.*;
public class tryCatch {
    public static void main(String args[]){
        int num1=8;
        int num2=2;
        String name=null;
        int result=0;
        int values[]={12,43,54,90};

        try(Scanner sc=new Scanner(System.in);)
        {
            int n=sc.nextInt();
            System.out.println(n);
          //  result=num1/name.length();
            result=num1/num2;
            System.out.println(values[4]);
        }
        catch(NullPointerException e)
        {
            System.out.println("in null pointer exception block " );
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("in array indes out of bounds block "+values[values.length-1]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("in catch block raised a errors");
        }
        finally
        {
            System.out.println("in finally block");
        }
        System.out.println("The result is "+result);

        System.out.println("RADHE RADHE");
    }
}
