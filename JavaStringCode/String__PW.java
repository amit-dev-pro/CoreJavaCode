import java.util.Arrays;
public class String__PW {
    public static void main(String[] args) {
        int[]a={3,6,3,65,1,34};
        int n=a.length;
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a.length; j++)
            {
                if(a[i]>a[j])
                {
                    System.out.println(a[i]);
                }
            }
        }


//        boolean flag=false;
//        String str="THE QUICK BROWN FOX JUMPS OVER LAZY DOG";
//        str=str.replace(" ", "");
//        char []ch=str.toCharArray();
//
//        int ar[]=new int[26];
//
//        for(int i=0;i<ch.length;i++)
//        {
//            ar[ch[i]-65]++;
//        }
//        for(int i=0;i<ar.length;i++)
//        {
//            if(ar[i]==0)
//            {
//                System.out.println("Its not pangram");
//                flag=true;
//            }
//        }
//
//        if(flag==false)
//        {
//            System.out.println("Its pangram");
//        }




//        String s="School master";
//        String ss="Theclassroom";

//        first ; remove the  whiteSpace using the replace method
//         second ; convert the uppercase or lowercase
//         third ; conver the character array char[]a=s.toCharArray()
//         fourth ; sort the array

//        s=s.replace(" ","");
//        ss=ss.replace(" ","");
//
//        s=s.toLowerCase();
//        ss=ss.toLowerCase();
//
//        char[]ch=s.toCharArray();
//        char[]ch1=ss.toCharArray();
//        System.out.println(ch);
//        System.out.println(ch1);
//
//        Arrays.sort(ch);
//        Arrays.sort(ch1);
//        System.out.println(ch);
//        System.out.println(ch1);
//
//        if(Arrays.equals(ch,ch1))
//        {
//            System.out.println("it is ansgram");
//        }
//        else {
//            System.out.println("t is not anagram");
//        }


//        String s="nitin java";
//        String ss="";
//        for(int i=s.length()-1 ; i>=0; i--)
//        {
//            ss=ss+s.charAt(i);
//        }
//        if(s.equals(ss))
//        {
//            System.out.println("it is palindrome");
//        }
//        else {
//            System.out.println("it is not palindrome");
//        }



//        for(int i=str.length()-1; i>=0; i--){
//            str1=str1+str.charAt(i);
//        }
//        System.out.println(str1);
//        String str2=" ";
//        String []arr=str1.split(" ");
//        for(String ele: arr){
//            for(int i=ele.length()-1; i>=0; i--){
//                str2=str2+ele.charAt(i);
//            }
//            str2=str2+" ";
//        }

       // System.out.println(str2);



//        String str1="pwskill";
//        String str2=" ";
//        for(int i=str1.length()-1; i>=0; i--)
//        {
//            str2=str2+str1.charAt(i);
//        }
//        System.out.println("before  reversing the string "+str1);
//        System.out.println("after reversing the string "+str2);

//        String str1="pwskill java";
//        String str2=" ";
//        String arr[]=str1.split(" ");
//        for(int i=arr.length-1; i>=0; i--)
//        {
//            str2=str2+arr[i] +" ";
//        }
//        System.out.println("before  reversing the string "+str1);
//        System.out.println("after reversing the string "+str2);

//        String str1="pwskill java";
//        String str2=" ";
//        for(int i=str1.length()-1; i>=0; i--)
//        {
//            str2=str2+str1.charAt(i);
//        }
//        System.out.println("before  reversing the string "+str1);
//        System.out.println("after reversing the string "+str2);

//        String str1="pwskill java ";
//        String str2=" ";
//        String []arr=str1.split(" ");
//        for(String ele:arr)
//        {
//            for(int i=ele.length()-1; i>=0; i--)
//            {
//                str2=str2+ele.charAt(i) ;
//            }
//              str2=str2 + " ";
//        }
//        System.out.println("before  reversing the string "+str1);
//        System.out.println("after reversing the string "+str2);


      //  String str1="pwskill";
//        String str2=" ";
//        for(int i=str1.length()-1; i>=0; i--)
//        {
//            str2=str2+str1.charAt(i);
//        }
//        System.out.println("before  reversing the string "+str1);
//        System.out.println("after reversing the string "+str2);

    }
}
