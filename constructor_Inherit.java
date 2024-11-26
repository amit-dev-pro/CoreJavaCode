import java.util.*;
public class constructor_Inherit{
    private static int length;

    public static void printMatrix(int[][]matrix){
        for(int i=0 ;i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
    public static void matrixSwap(int[][]matrix,int r,int c){
        for(int i=0; i<r; i++){
            for(int j=i+1; j<c; j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        int r1=0;
        int l1=length-1;
        for(int i=0; i<r1; i++){
            for(int j=0; j<l1; j++){

                System.out.println(matrix[i][j]);
            }
        }
    }
    public static void rotation(int[][]matrix){

    }
    public static void main(String[] args) {
        System.out.println("Enter the rows and columns ");
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][]matrix=new int[r][c];
        System.out.println("Enter "+r+" rows "+c+" columns elements ");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                 matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("present in following original matrix ");
        printMatrix(matrix);

        System.out.println("present in following swap matrix");
        matrixSwap(matrix,r,c);
        printMatrix(matrix);


    }
}