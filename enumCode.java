import java.util.EnumMap;

enum enum_1{
     red,
    black,
    green

        }

public class practice2 {
    public static void main(String[]args){
        enum_1 res=enum_1.red;
        System.out.println(res);
        for(enum_1 res1:enum_1.values()) {
            System.out.println(res1);
        }

        System.out.println("RADHA KRISHNA");
    }

}
