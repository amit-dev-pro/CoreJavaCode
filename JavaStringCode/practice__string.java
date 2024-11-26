public class practice__string {

    static void sort(int[]a){
        int n=a.length;
        for(int i=0; i<n-1; i++)
        {
            for(int j=0; j<n-i-1; j++)
            {
                if(a[j] < a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
//    static void sortString(String[]a){
//        int n=a.length;
//        for(int i=0; i<n-1; i++){
//            int min_index=i;
//            for(int j=i+1; j<n; j++){
//                if(a[j].compareTo (a[min_index])>0){
//                    min_index=j;
//                }
//            }
//            String temp=a[i];
//            a[i]=a[min_index];
//            a[min_index]=temp;
//        }
//    }
    public static void main(String[] args) {

        int[]a={5,6,4,9,0};
        sort(a);
        for(int ans:a){
            System.out.print(ans+" ");
        }

        System.out.println("Hii..Ray G Thanks for coding ");

    }
}
