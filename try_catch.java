import java.util.Arrays;

public class try_catch {
    public static void printArray(int[]arr){
        int n=arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
//    public static void palindromic(int[]arr){
//        int n=arr.length;
//        for(int i=0; i<n; i++){
//            if(arr[i]!=arr[n-i-1]){
//                System.out.println("This is not palindromic array ");
//                break;
//            }
//            System.out.println("This is palindromic array ");
//            break;
//        }
//    }
    public static void printSwap(int[]arr){
        int n=arr.length;
        for(int i=0; i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
    }
    // {1 2 3 4 5} -> {15 14 12 9 5}
    public static void prefixSum(int[]arr){
       int n=arr.length;
       for(int i=n-2; i>=0; i--){
           arr[i]+=arr[i+1];
       }
    }
    public static void missingNum(int[]arr){
        int n=arr.length;
        int current_number=((n+1)*(n+2))/2;

        int sum=0;
        for(int i=0; i<n; i++){
            sum+=arr[i];
        }
        int ans=current_number-sum;
        System.out.println("in this array find out missing number "+ans);
    }

    public static void leanerSearch(int[]arr,int target){
        int n=arr.length;
         int idx=-1;
        for(int i=0; i<n; i++){
            if(arr[i]==target){
                idx=i;

            }
        }
        if(idx==-1){
            System.out.println("target value is not fond in array");
        }
        else {
            System.out.println("target value is fond in array "+idx);
        }
    }

    public static int binarySearch(int[]arr,int target){
        int n=arr.length;
        int low=0;
        int high=n-1;
        int result=0;

        while(low<=high){
            int mid=low+(high-low)/2;
                if(arr[mid]==target){
                       result++;
                     high=mid-1;
                }
                else if(arr[mid]>target){
                     high=mid-1;
                     result++;
                }
                else{
                     low=mid+1;
                     result++;

                }
            }
        return result;
        }
        public static int countOccurence(int[]arr,int target){
               int n=arr.length;
               int count=0;
               for(int i=0; i<n; i++){
                   if(arr[i]==target){
                        count++;
                   }
               }
                return count;
        }
        public static int duplicateValue(int[]arr){
        int n=arr.length;
        int store=0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static boolean palindromic(int[]arr){
        int n=arr.length;
        int flag=0;
       for(int i=0; i<n/2; i++){
           if(arr[i]!=arr[n-i-1]){
                return false;
           }
       }
       return true;
    }
    public static void maximumNum(int[]arr){
        int n=arr.length;
        int max=0;
        for(int i=0 ; i<n; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
         System.out.println(max);

    }
    public static int minimumNum(int[]arr){
        int n=arr.length-1;
        int min=0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]>arr[j])
                    min=arr[i];
            }
        }

        return min;
     }
    // function definition
    public static int findFirstOccurence(int[] arr, int target) {
        int low=0,high=arr.length-1;
        int result=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                result=mid;
                high=mid-1;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return result;
    }
    public static void sortArray(int[]arr) {
        int n=arr.length-1;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] <arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void countNum(int[]arr){
        int n=arr.length-1;
        int count=0;
        for(int i=0; i<n; i++){
            count++;
        }
        System.out.println(count);
    }
    public static void addAllNum(int[]arr){
        int n=arr.length;
        int addNum=0;
        for(int i=0; i<n; i++){
             addNum+=arr[i];
        }
        System.out.print(addNum+" ");
    }
        public static int findSquareRoot(int num){
            int low=0, high=num, result=-1;
            //modified binary search
            while(low <= high){
                int mid = low + (high - low)/2;
                long val = mid * mid;

                if(val == num){
                    // prefect square root
                    return mid;
                }
                else if(val < num){
                    // store the floor value, incase the number is not perfect square root, we can print the floor value
                    result = mid;
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }
            return result;
        }
        public static void bubbleSort(int[]arr){
        int n=arr.length;
        for(int i=0; i<n; i++){
            boolean flag=false;
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
            }
        }
        for(int ans:arr){
            System.out.print(ans+" ");
        }
    }
    public static int minimumIndexVal(int[]arr) {
        int n = arr.length;
        int ans=-1;
        int st = 0, end = n - 1;
        int mid = 0;
        while (st <= end) {
            mid = st + (end - st) / 2;
            if(arr[mid]<=arr[n-1]){
                ans=mid;
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return ans;
    }
    public static int minimumVal(int[]arr){
        int n = arr.length;
        int ans=-1;
        int st = 0, end = n - 1;
        int mid = 0;
        while (st <= end) {
            mid = st + (end - st) / 2;
            if(arr[mid]<=arr[n-1]){
                ans=mid;
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return ans;
    }
    public static int findTargetVal(int[]arr,int target){
        int n=arr.length;
        int st=0, end=n-1;
        int ans=-1;
        while(st<=end){
            int mid=st+(end-st)/2;
           if(arr[mid]==target){
               return mid;
           }
           else if(arr[mid]<arr[end]){
               if(target>arr[mid]&& target<=arr[end]){
                   st=mid+1;
               }
               else{
                   end=mid-1;
               }

           }
           else{
               if(target>=arr[st]&& target<arr[mid]){
                   end=mid-1;
               }
               else{
                   st=mid+1;
               }
           }
        }
         return -1;
    }
    public static void bubbleSort1(int[]arr){
        int n=arr.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

       for(int e:arr){
           System.out.print(e+" ");
       }
    }
    public static void insertionSort(int[] arr){
        for(int i=1; i<arr.length; i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;

                j--;
            }
        }
    }
    public static void main(String[] args) {
//        System.out.println("Enter the array size ");
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int[]arr=new int[n];
//        System.out.println("Enter the "+n+" elements ");
//        for(int i=0; i<n; i++){
//            arr[i]=sc.nextInt();
//        }
        int[]arr={25,6,89,22,05,88,2};

//
//       int answer=findFirstOccurence(arr,target);
//       if(answer==-1){
//           System.out.println("in this array not found any occurence location ");
//       }
//       else{
//           System.out.println("The occurence location in this array is "+answer);
//       }
        insertionSort(arr);
              System.out.println(Arrays.toString(arr) );

    }
}
