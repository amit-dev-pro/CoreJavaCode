import java.util.Locale;
import java.util.*;
class input {
        int marks;

        int show() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks ");
         marks = sc.nextInt();
         return marks;
    }
}
//class demo {
//
//   int marks1;
//
//   void CollectMarks()
//   {
//       input ki=new input();
//       marks1=ki.show();
//   }
//
//    void dis() {
//        if (marks1 < 0) {
//            System.out.println("i things you inter negative marks ");
//
////            Scanner sc = new Scanner(System.in);
////            System.out.println("Enter the again  marks ");
////            marks1 = sc.nextInt();
//
//            if(marks1>0 && marks1<=100)
//            {
//                System.out.println("i things you Enter between 0 to 100 digits ");
//            }
//
//        }
//        else if (marks1 > 100) {
//            System.out.println("that's good choice i'm proud of you thanks ");
//        }
//   }
//}


class A {
    public void show() {
        System.out.println("i am in amit class");
    }

    static class R {
        public void dis() {
            System.out.println("i am in rahul class");
        }
    }
//      class R {
//        public void dis() {
//            System.out.println("i am in rahul class");
//        }
//    }
}


public class farmerInterest {

    public static void main(String[] args) {
        A a=new A();
        //A.R ar=a.new R();
        A.R ar1=new A.R();
        a.show();
        ar1.dis();

    }
}

