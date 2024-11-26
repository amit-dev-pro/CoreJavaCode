
public class pwPattern {
    public static void main(String[] args) {
         int n =8;
         for(int i=0; i< n; i++){
             for(int j=0; j<n; j++){
                 if(i==0 && j<=(n-1)/2 || j==0 && i<=(n-1)/2 || i+j<=(n-1)/2 || i==0 && j>=(n-1)/2
                         || j==n-1 && i<=(n-1)/2 || j-i>(n-1)/2 || j==0 && i>(n-1)/2 || i==n-1 && j<=(n-1)/2 ||
                 i-j>(n-1)/2 || i==0 && j>=(n-1)/2 || j==n-1 && i>=(n-1)/2 || i+j >(n-1)+(n-1)/2  ){
                     System.out.print("*");
                     }
                 else{
                     System.out.print(" ");
                 }
             }
              System.out.print("       ");
             for(int j=0; j<n; j++){
                 if( i==j || i+j==n-1 || j==(n-1)/2 || i==0 || i==n-1 || i==(n-1)/2 ){
                     System.out.print("*");
                 }
                 else{
                     System.out.print(" ");
                 }
             }
             System.out.println();
         }



//        int n=20;
//        for(int i=0; i<n; i++){
//            for(int j=0; j<n; j++){
//                if(i==j || i+j==n-1 || j==0 || j==n-1 || i==0 || i==n-1 || i+j==(n-1)/2 || i-j==(n-1)/2 || j-i==(n-1)/2 || i+j==n-1+(n-1)/2) {
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//             // this code copy of above code second graph
//                  System.out.print("   ");
//                for(int j=0; j<n; j++){
//                    if(i+j==(n-1)/2 || i-j==(n-1)/2 || j-i==(n-1)/2 || i+j==n-1+(n-1)/2 || i==0 || i==n-1 || j==0 || j==n-1){
//                        System.out.print("*");
//                    }
//                    else{
//                        System.out.print(" ");
//                    }
//                }
//
//            // this code copy of above code third graph
//            System.out.print("   ");
//            for(int j=0; j<n; j++){
//                if(i==0 && j<=(n-1)/2 || j==0 && i<=(n-1)/2 || i+j<=(n-1)/2 || i==0 && j>=(n-1)/2 ||j==n-1 &&
//                        i<=(n-1)/2 || j-i>=(n-1)/2 || j==0 && i>=(n-1)/2 || i==n-1 && j<=(n-1)/2 || i-j>=(n-1)/2 ||
//                  j==n-1 && i>=(n-1)/2 || i==n-1 && j>=(n-1)/2 || i+j>=n-1+(n-1)/2){
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//
//            System.out.println();
//        }
         // end here
//
//        int n=6;
//        for(int i=0; i<n; i++){
//            for(int j=0; j<n; j++){
//                if(i+j==n-1){
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

//        int n=6;
//        for(int i=0; i<n; i++){
//            for(int j=0; j<n; j++){
//                if(i==j){
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//        int n=12;
//        for(int i=0; i<n; i++){
//            for(int j=0; j<n; j++){
//                if(i==0 && j<(n-1)/2 || j==0 || j==(n-1)/2 && i>0 && i<n-1 || i==n-1 && j<(n-1)/2){
//                    System.out.print("*"+" ");
//                }
//                else{
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }

//        int n=12;
//        for(int i=0; i<n; i++){
//            for(int j=0; j<n; j++){
//                if(i==0 && j>0 && j<(n-1)/2 || j==0 && i>0 || i==(n-1)/2 && j<=(n-1)/2 ||  j==(n-1)/2 && i>0 ){
//                    System.out.print("*"+" ");
//                }
//                else{
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }

//        int n=6;
//        for(int i=0; i<n;i++ ){
//            for(int j=0; j<n; j++){
//                if(j==0 || j==n-1 || i==(n-1)/2){
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

//         int n=8;
//         for(int i=0; i<n; i++){
//             for(int j=0; j<n ;j++){
//                 if(i==0 || j==0 || i==(n-1)/2 || j==n-1){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }

//        int n=5;
//        for(int i=0; i<n; i++){
//            for(int j=0;j<n; j++){
//                if(i==0 || j==0 || i==n-1 || j==n-1){
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
    }
}
