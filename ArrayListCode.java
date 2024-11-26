import com.sun.source.tree.ArrayAccessTree;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

@FunctionalInterface
 interface A{
     void show(int i);

 }

public class prac {
    public static void main(String[]args){
        ArrayList al=new ArrayList();
        al.add("amit");
        al.add("samindra");
        al.add("kamindra");
        al.add("Rohit");
        al.add("Rahul");
        al.add("Krish");
        al.forEach((n)->{
            System.out.println(n);
        });
         A obj=(i)->{
             System.out.println("in show"+i);
         };
        obj.show(5);
        System.out.println("RADHA KRISHNA");
    }
}


