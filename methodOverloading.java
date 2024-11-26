
// custom exception class
class myException extends Exception {
    public myException(String sms) {
        super(sms);
    }
}

 class customException {
    public void checkValue(int val) throws myException {
        if(val<0) {
            throw new myException("you enter negative number ");
        }
        System.out.println("valid number "+val);
    }
}


public class methodOverloading {
    public static void main(String[] args)  {
        customException ex=new customException();
        try{
            ex.checkValue(12);
        }catch (myException e) {
            System.out.println("caught custom exception "+e.getMessage());
        }


        System.out.println("RADHAVALLABH");


    }
}
