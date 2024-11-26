import java.security.KeyStore;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class student
{
    private String name;
    private int age;
    private String city;

    public student(String name,int age,String city)
    {
        this.name=name;
        this.age=age;
        this.city=city;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public String getCity()
    {
        return city;
    }
    public String toString()
    {
        return name+" "+age+" "+city;
    }

}
public class hashmap {
    public static void main(String[] args) {
        student s1=new student("Amit Lal",18,"patna");
        student s2=new student("Rohit Yadav",12,"Jehanabad");
        student s3=new student("Rahul Raj",10,"Gaya");

        student s4=new student("punam",89,"Biharshariph");
        student s5=new student("purnima",23,"Nalanda");
        student s6=new student("Anita",34,"Chhapanna");

        Map map=new HashMap();
        map.put(1,s1);
        map.put(2,s2);
        map.put(3,s3);
//        System.out.println(map);
        Map map1=new HashMap();
        map1.put(4,s4);
        map1.put(5,s5);
        map1.put(6,s6);
        System.out.println(map1);


        Set entry=map1.entrySet();
        Iterator itr=entry.iterator();
        while(itr.hasNext()){
            Map.Entry data=(Map.Entry)itr.next();
            System.out.println(data.getKey()+" "+data.getValue() );
        }


//        Set entry=map.entrySet();
//        Iterator itr=entry.iterator();
//        while(itr.hasNext())
//        {
//            Map.Entry data=(Map.Entry)itr.next();
//            System.out.println(data.getKey()+" "+data.getValue());
//        }
//        Set entry=map.entrySet();
//        Iterator itr=entry.iterator();
//        while(itr.hasNext())
//        {
//            Map.Entry data=(Map.Entry)itr.next();
//            System.out.println(data.getKey()+" "+data.getValue());
//        }



        System.out.println("Hii..Ray G Thanks For Coding Journey ");

    }
}
