import java.util.Scanner;
public class StringRelated{

    // find the palindtrome without using index
    static boolean isPalindrome(String s,int l,int r){
        if(l>=r){
            return true;
        }
        return s.charAt(l)==s.charAt(r) && isPalindrome(s,l+1,r-1);
    }


    // reverse using imdex in recursion
//    static String reverse(String s,int idx){
//        if(idx==s.length()){
//            return " ";
//        }
//        String smallAns=reverse(s,idx+1);
//        return smallAns+s.charAt(idx);
//    }

//    // reverse string using substring
//    static String reverse(String s){
//        if(s.length()==0){
//            return " ";
//        }
//        String smallAns=reverse(s.substring(1));
//        return smallAns+s.charAt(0);
//    }

    // reverse string using index
//    static String reverse(String s,int idx){
//        if(idx==s.length()){
//            return " ";
//        }
//        String smallAns=reverse(s,idx+1);
//        return smallAns+s.charAt(idx);
//
//    }
//    static String remove1(String s,int idx){
//        if(idx==s.length()){
//            return " ";
//        }
//        String smallAns=remove1(s,idx+1);
//        char currChar=s.charAt(idx);
//        if(currChar!='a'){
//            return smallAns+currChar;
//        }
//        else{
//            return smallAns;
//        }
//    }

    // without using index ! remove  occurrence character
//    static String remove2(String s) {
//        if (s.length()==0) {
//            return " ";
//        }
//        String smallAns = remove2(s.substring(1));
//        char currChar = s.charAt(0);
//        if ( currChar!='a') {
//            return currChar + smallAns;
//        }
//
//        else {
//            return smallAns;
//
//        }
//    }
    public static void main(String[] args) {

//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter string ");
//        String s=sc.nextLine();
//        System.out.println("Total length in this string "+s.length()-1);
//        System.out.println(s.charAt(4));
//        //using substring function
//        System.out.println("find the character Between 8-17 "+s.substring(8,17));
//          //itrate method
//        for(int i=0; i<s.length(); i++){
//            System.out.println(s.charAt(i));
//        }
    }
}

