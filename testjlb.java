import java.util.*;


abstract class a{
    abstract void car();
    abstract void engine();

}
abstract class b extends a{
    public void car( ){

        System.out.println("\nimplements with b class and acess to extends");
    }
    public void engine(){
        System.out.println("engine is low latency os it is working the slow");
    }
    public void engine1(){
        System.out.println("engine is low latency os it is working the slow");
    }
}
class c extends b{
    public void motor(){

        System.out.println("this is that");
    }
}
class testjlb {
    public static void main(String[] args) {
        c cc=new c();
        cc.car();
        cc.engine();
        cc.motor();
    }

}
