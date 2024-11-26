import java.util.ArrayList;
import java.util.Scanner;
public class String__subsequences{

    static void subsetSum(int[]a,int n, int idx ,int sum){
        if(idx>=n){
            System.out.println(sum);
            return ;
        }
        subsetSum(a,n,idx+1,sum+a[idx]);
        subsetSum(a,n,idx+1,sum);
    }

    // find the substring from the integer
//    static void printSsq(String s,String currAns){
//        if(s.length()==0){
//            System.out.println(currAns);
//            return ;
//        }
//        char curr=s.charAt(0);
//        String remString=s.substring(1);
//        printSsq(remString,currAns+curr);
//        printSsq(remString,currAns);
//
//    }


    // used in this code ArrayList

//    static ArrayList<String> getSsq(String s){
//        ArrayList<String>ans=new ArrayList<>();
//        if(s.length()==0){
//            ans.add(" ");
//            return ans;
//        }
//        char curr=s.charAt(0);
//        ArrayList<String>smallAns=getSsq(s.substring(1));
//        for(String ss:smallAns){
//            ans.add(ss);
//            ans.add(curr+ss);
//        }
//        return ans;
//    }

   public static void main(String[] args) {
       int[]a={2,4,5};
       subsetSum(a,a.length,0,0);


//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the string ");
//        String s=sc.nextLine();
//        ArrayList<String>ans=getSsq(s);
//        for(String ss: ans){
//            System.out.println(ss);
//        }
    }
}
