package inheritance;

//single inheritance
class Parent
{
   int i=10;
   void show(){
        System.out.println(i);
    }
}
public class InheritanceDemo extends Parent {
   public static void main(String[] args) {
        InheritanceDemo inheritanceDemo=new InheritanceDemo();
        inheritanceDemo.show();
   }
}

