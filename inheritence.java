// types of inheritance method := a.inherited ,b.overidding , c.specialized


/*
class aeroplane
{
    void takeOff()
    {
        System.out.println("the aeroplane is take off ");
    }
    void fly()
    {
        System.out.println("the cargoplane is flying ");
    }
}
class cargoPlane extends aeroplane
{
      void fly()
    {
        System.out.println("cargoplane is flying ");
    }
    void disp()
    {
        System.out.println("something i want to include special");
    }
}
class passengerPlane extends aeroplane
{
    void fly()
    {
        System.out.println("passengerPlane is flying ");
    }
    void disp()
    {
        System.out.println("something i want to include special");
    }
}
*/

// hierarchical inheritance
//class animal
//{
//    void sleep()
//    {
//        System.out.println("animals need to sleep");
//    }
//}
//class tiger extends animal
//{
//
//}
//class deer extends animal
//{
//
//}
//class lion extends animal
//{
//
//}

// multi inhertance
//class demo1
//{
//    void disp()
//    {
//        System.out.println("multi level inheritance ");
//    }
//}
//class demo2 extends demo1
//{
//
//}
//class demo3 extends demo2
//{
//
//}

//  single inheritance
//class animal
//{
//    void sleep()
//    {
//        System.out.println("animal needs to sleep");
//    }
//}
//class tiger extends animal
//{
//
//}


// types of Inheritance :- a.single level ,b.multi level ,c.Hierarchical inheritance d.Multiple inheritance

//class human  //super class / base class /parent class
//{
//    private String name;
//    int age;
//    human()
//    {
//        System.out.println("human class constructor");
//    }
//
//    void sleep()
//    {
//        age=29;
//        System.out.println("human need good sleep");
//        System.out.println(age);
//    }
//}
//class student extends human // child class /sub class /derived class
//{
//       void disp()
//       {
//           System.out.println("The age is : "+age);
//          // System.out.println("The name is : "+name);
//       }
//}

class human{
    String name;
    int age;

    human(){
        System.out.println("human class constructor");
    }
    void sleep() {
        age = 20;
        System.out.println("human need good sleep");
        System.out.println(age);
    }
}
class student1 extends human{
    void dis(){
        System.out.println("The age is "+age);
        System.out.println("The name is "+name);
    }
}
public class inheritence {
    public static void main(String[] args) {
        for(int i=0; i<11; i++){
            System.out.println(i);
        }
//         student1 s=new student1();
//         s.dis();
//         s.sleep();
//        passengerPlane obj=new passengerPlane();
//        obj.fly();
//        obj.takeOff();
//        obj.disp();


         // hierarchical inheritance
//        deer obj=new deer();
//        obj.sleep();


        // multi level inhertance
//        demo1 obj=new demo1();
//        obj.disp();

        // sinle ingeritance
//        tiger obj=new tiger();
//        obj.sleep();

        // first code
//        student obj=new student();
//        obj.sleep();
//        obj.disp();
        System.out.println("Hii.. Ray G Thanks for coding journey ");
    }
}
