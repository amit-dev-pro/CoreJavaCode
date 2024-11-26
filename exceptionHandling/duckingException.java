package exceptionHandling;

/*
class A
{
    public void demo2() throws Exception
    {
        demo1();
    }
    public void demo1() throws Exception
    {
        int num1=8;
        int num2=0;
        int result=num1/num2;
        System.out.println("something "+result);
    }

}

 */




class myException extends Exception{
    public myException(String msg){
         super(msg);
    }
}
public class duckingException {
    public static void main(String[]args){
//        A a=new A();
//        a.demo2();

        int n=4;
        int m=-2;

        try
        {
            if(m<0)
            {
                Exception e=new myException("negative number");
                throw e;

            }
            else
            {
                int res=n/m;
                System.out.println(res);
            }

        }
        catch(Exception e)
        {
            System.out.println("please enter the valid number "+e);
        }
        System.out.println("RADHE RADHE");
    }
}
