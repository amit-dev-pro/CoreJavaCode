package multithreading;

class interview{
    int num;
    interview(int x){
        num=x;
    }
    interview(){
         num=0;
    }

    public static void updateObj(interview iobj){
//        iobj=new interview();
        iobj.num=50;
     }
}




public class synchronise {
    public static void main(String[]args) {
        interview i=new interview(20);
        interview.updateObj(i);
        System.out.println(i.num);
    }
}

