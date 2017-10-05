package keywords;

public class StaticKeyword {
//static variable
    static int id;
     static String name;
    static String institute="codekul";

    StaticKeyword(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
     static void display(){
        System.out.println("id: "+id+"\t"+"name: "+name+"\t"+"institute: "+institute);
    }
    //static
  //  {
   //     System.out.println("in static block");
   // }
    public static void main(String[] args) {

       // System.out.println("in static method");
        StaticKeyword staticKeyword=new StaticKeyword(1,"pooja");
        StaticKeyword staticKeyword1=new StaticKeyword(2,"bhagyashree");
        staticKeyword.display();
      //  staticKeyword1.display();

    }

}
