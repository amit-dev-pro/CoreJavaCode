import java.util.*;
class Jalebi1{
      private static Jalebi1 jalebi=new Jalebi1();
      private static Jalebi1 jalebi1=new Jalebi1();

    private Jalebi1(){ // if my constructor is private then my class will be not access the outside the class
        //constructor
    }
    public  static Jalebi1 getJalebi(){
        return jalebi;
    }
    public static Jalebi1 getJalebi1(){
        return jalebi1;
    }

}
 interface computer{
     void run();


}
 class desktop implements computer{
    public void run(){
        System.out.println("this is running on desktop");
    }
}
 class app implements computer{
    public void run(){
        System.out.println("running on application");
    }
}
class other{
    public void others(computer c){
        System.out.println("running on others ");
        c.run();
        c.run();


    }
}
public class Jalebi {
    public static void main(String[]args){
//         computer c=new app();
//        other o=new other();
//        o.others(c);
        System.out.println("Enter the array size ");
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("Enter the array elements ");
        for(int i=0; i<r;i++){
            for(int j=0; j<c;j++){
                arr[i][j]=sc.nextInt();
                System.out.print(arr[i][j]);
            }

        }
        System.out.println("      RADHE        RADHE  ");
    }
}
