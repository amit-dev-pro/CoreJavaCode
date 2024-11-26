import java.security.KeyStore;
import java.util.*;

class employee
{
    private String name;
    private int empId;
    public employee(String name,int empId)
    {
        this.name=name;
        this.empId=empId;

    }
    public String toString()
    {
        return empId+" ";
    }
    @Override
    public void finalize()
    {
        int a=90;
        int b=80;
        int c=a+b;

        System.out.println("clean up work by GC before de alloctiong memory"+c);
    }
}
public class simple_code {
    public static void main(String[]args) {
       employee e=new employee("amit",16844);
        WeakHashMap wm=new WeakHashMap();
        wm.put(e,"amit");
        System.out.println(wm);

       // e=null;//eligible for garbage collecttion
        System.gc();//invoking garbage collector
        System.out.println(wm);
        System.out.println("Last line");


//        Hashtable hm=new Hashtable();
//        hm.put(01,"Amit kumar");
//        hm.put(02,"Devendra kumar");
//        hm.put(03,"Santosh kumar");
//        hm.put(04,"Niranjan yadav");
//        System.out.println(hm);
//
//        TreeMap tm=new TreeMap();
//        tm.put(01,"Amit kumar");
//        tm.put(02,"Devendra kumar");
//        tm.put(03,"Santosh kumar");
//        tm.put(04,"Niranjan yadav");
//        System.out.println(tm);
//
//        Set entry=tm.entrySet();
//        Iterator i=entry.iterator();
//        while(i.hasNext())
//        {
//            Map.Entry data=(Map.Entry)i.next();
//            System.out.println(data.getKey()+" "+data.getValue());
//        }
//        Collection values=tm.values();
//        Iterator itr=values.iterator();
//        while(itr.hasNext())
//        {
//           String s=(String)itr.next();
//            System.out.println (s);
//        }


//
        // some important map


        HashMap map=new HashMap();
        Hashtable table=new Hashtable();
        LinkedHashMap linked=new LinkedHashMap();
        TreeMap tree=new TreeMap();
    }
}
