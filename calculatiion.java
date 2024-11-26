import java.util.Scanner;

public class calculatiion {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Guess the number ");
        int num=sc.nextInt();
        double random=Math.random()+1;

        while(true){
            if(random==num){
                System.out.println("congrats ! you guess the right number ");
                break;
            }else {
                System.out.println("Guess the number try again ");
                 num=sc.nextInt();
            }
        }


    }
}


