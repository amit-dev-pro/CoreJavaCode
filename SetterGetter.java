
/*
class  incap{

    private int age;
    private String name;
    public void setDate1(int age){
        this.age=age;

    }

    public void setDate2(String name){

        this.name=name;
    }
    public void show(){
        System.out.println(name+" "+age);
    }

}

     */

  class students
  {
      private int age;
      private String name;
      public students(String name,int age){
          this.name=name;
          this.age=age;
      }
      public String getName(){
          return name;
      }
      public int getAge() {
          return age;
      }
  }
  class std{
      private int a, b;

      public std(){
          System.out.println("This constructor has created zero parameterized");
      }
      public std(int a,int b){
          this.a=a;
          this.b=b;
      }
      public void show(){
          System.out.println(a+" "+b);
      }
  }

  public class newCode {
    public static void main(String[]args){
        /*
        incap i=new incap();
        incap i1=new incap();
//        i.age=90;
//        i.name="amit";
        i.setDate1(25);
        i1.setDate1(85);
        i.setDate2("amit lal");
        i1.setDate2("rahul yadav");
        i.show();
        i1.show();

         */

        students s=new students("Amit kumar",65);
        int ans=s.getAge();
        String an=s.getName();
        System.out.println(ans+" "+an);

        std st1=new std();

        std st=new std(12,45);
        st.show();






       System.out.println("\n\nHello Ray G Thanks for coding journey\n\n          RADHE RADHE");
    }
}
