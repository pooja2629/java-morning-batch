package test;

public class Swaping {

    public static void main(String[] args) {
        int x=10,y=20;
        System.out.println("before swapping ");
        System.out.println("value of x is:"+x);
        System.out.println("value of y is:"+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("after swapping ");
        System.out.println("value of x is:"+x);
        System.out.println("value of y is:"+y);

    }
}
