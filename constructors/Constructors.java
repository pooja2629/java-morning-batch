package constructors;
public class Constructors {
    int i, j;
    Constructors(int i, int j) {
     this.i=i;
     this.j=j;
    }
    int add() {
        int c=i+j;
        return c;
    }
   int sub(){
        int c=i-j;
        return c;
   }
   int mul(){
       int c=i*j;
       return c;
   }
   int div(){
       int c=i/j;
       return c;
   }
    public static void main(String[] args) {
        Constructors constructors = new Constructors(30, 15);
       int d= constructors.add();
       int d1=constructors.sub();
       int d2=constructors.mul();
       int d3=constructors.div();
        System.out.println(d);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }
}