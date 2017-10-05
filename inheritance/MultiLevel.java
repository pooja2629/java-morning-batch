package inheritance;
class animal
{
   void show(){
       System.out.println("in animal class");
   }
}
class dog extends animal
{
    void display(){
        System.out.println("in dog class");
    }
}
class cat extends dog
{
    public static void main(String[] args) {
        cat c=new cat();
        c.display();
        c.show();
    }
}

//public class MultiLevel {
//}
