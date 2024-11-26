import java.util.ArrayList;

public class only__practice{

    static ArrayList<Integer> allIndices(int[]a,int target,int idx){
        ArrayList<Integer>ans=new ArrayList<Integer>();
        if(idx==a.length) return ans;
        if(a[idx]==target){
            ans.add(idx);
        }
        ArrayList<Integer>smallAns=allIndices(a,target,idx+1);
        ans.addAll(smallAns);
        return ans;
    }

//     static int indices(int[]a,int target,int idx){
//         if(idx==a.length) return -1;
//         if(a[idx]==target) return idx;
//         return indices(a,target,idx+1);
//     }

//    static  void allIndices(int[]a,int target,int idx){
//        if(idx==a.length) return;
//        if(a[idx]==target){
//            System.out.print(idx+" ");
//        }
//          indices(a,target,idx+1);
//    }

//    static boolean search(int[]a,int target,int idx){
//        if(idx==a.length) return false;
//        if(a[idx]==target) return true;
//        return search(a,target,idx+1);
//    }

//     static boolean search(int[]a,int target,int idx){
//         if(idx==a.length) return false;
//         if(a[idx]==target) return true;
//         return search(a,target,idx+1);
//    }

//      static int sumOfArray(int[]a,int idx){
//          if(idx==a.length) return 0;
//          int smallAns=sumOfArray(a,idx+1);
//          return smallAns + a[idx];
//      }

//    static int minVal(int[]a,int idx){
//        if(idx==a.length) return idx;
//        int smallAns=minVal(a,idx+1);
//        return Math.min(smallAns,a[idx]);
//    }

//    static int maxVal(int[]a,int idx){
//        if(idx==a.length-1) return a[idx];
//        int smallAns=maxVal(a,idx+1);
//        return Math.max(smallAns,a[idx]);
//    }

//    static void printArray(int[]a,int idx){
//        if(idx==a.length) return ;
//        System.out.print(a[idx]+" ");
//        printArray(a,idx+1);
//    }

//    static int gcd(int x,int y){
//        if(y==0) return x;
//        return gcd(y,x%y);
//    }

//    static int gcd(int x,int y){
//        if(x%y!=0) {
//            int rem=x%y;
//            x=y;
//            y=rem;
//        }
//        return y;
//    }
//    static int sum(int n){
//        if(n==0) return 0;
//        if(n%2==0) return  sum(n-1)-n;
//        return sum(n-1)+n;
//    }

 //   static int sumAlt(int n){
//        if(n==0) return 0;
//        if(n%2==0) return  sumAlt(n-1)-n;
//            return sumAlt(n-1)+n;
//    }
//

//    static void multiple(int n, int k){
//        if(k==1){
//            System.out.println(n);
//            return;
//        }
//        multiple(n,k-1);
//        System.out.print(n*k+" ");
//    }

//    static int power(int p, int q){
//        if(q==0) return 1;
//        int smallPower=power(p,q/2);
//        if(q%2==0) return smallPower*smallPower;
//        return p*smallPower*smallPower;
//    }

//     static int power(int p,int q){
//         if(q==0) return 1;
//         return p* power(p,q-1);
//     }

//    static int countsNum(int n){
//        if(n>=0 && n<=9) return 1;
//        return 1+ countsNum(n/10);
//    }

//    static int fac(int n){
//        if(n==0) return 1;
//        return fac(n-1)*n;
//    }

//    static int fibo(int n){
//        if(n==0 || n==1) return n;
//        return fibo(n-1)+fibo(n-2);
//    }

//    static int sumOfAllNatural(int n){
//        if(n>=0 && n<=9){
//            return n;
//        }
//        int smallAns=sumOfAllNatural(n/10);
//        return smallAns + n%10;
//    }

    public static void main(String[] args) {
         int[]a={1,2,9,4,8,4,41,4};
         int target=42;
         ArrayList<Integer>ans=allIndices(a,target,0);
         if(target>a.length){
             System.out.println("wrong input target ");
         }
         for(Integer p:ans){
             System.out.print(p+" ");
         }
        //System.out.println(allIndices(a,target,0));
//         if(search(a,a.length,target,0)){
//             System.out.println("yes");
//         }
//         else{
//             System.out.println("no");
//         }


//    int n=8;
//    int m=4;
//    if(n>m){
//        System.out.println("yes Right is greater ");
//    }


//        int n=9;
//        int m=4;
//       String k= (n<m)? "n is greater than m":"m is grater than n";
//        System.out.println(k);


//
//        int i=0;
//        while(i<21){
//            System.out.println(i);
//            i++;
//        }

//        for(int i=0; i<11;i++){
//            System.out.println(i);
//        }

//        int i=0;
//        do{
//            System.out.println(i);
//            i++;
//        }
//        while(i<=10);

//             int a = 5, b = 6;
//             int c = a++;
//             int d = ++a;
//             int e = b--;
//             int f = -b;
//             System.out.println(c);
//             System.out.println(a);

//             System.out.println(d);
//
//             System.out.println(e);
//
//             System.out.println(f);
//             int a=5;
//             int b=2;
//             long res=a/b;
        // System.out.println(res);
//              int b=9;
//              int c;
//              c=b++;
//              System.out.println(b);
//              System.out.println(c);

    }
}



