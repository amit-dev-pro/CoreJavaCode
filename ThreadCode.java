import java.util.*;
//class myThread extends Thread
class array {

    public static void printMt(int[][]mt){
        int n=mt.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<mt[i].length; j++){
                System.out.print(mt[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int reverse(int[][]mt,int r,int c) {
        int temp = 0;
        for (int i = 0; i < r; i++) {
            for (int j = i; j < c; j++) {
                temp = mt[i][j];
                mt[i][j] = mt[j][i];
                mt[j][i] = temp;
            }
        }
        return temp;
    }

}
 public class practice{

    public static void main(String args[]) {

//        System.out.println("Enter the number of row and column ");
//        Scanner sc=new Scanner(System.in);
//        int r=sc.nextInt();
//        int c=sc.nextInt();
//        int[][]mt=new int[r][c];
//        System.out.println("Enter the "+r+" rows and "+c+" columns ");
//        for(int i=0; i<r; i++){
//            for(int j=0; j<c; j++){
//                mt[i][j]=sc.nextInt();
//            }
//        }
//        array.printMt(mt);
//        array.reverse(mt,r,c);

    }
 }

