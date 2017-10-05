package abstarction;

public interface InterfaceDemo {
    void call();
    void msg();
    void games();

}
interface second{
    void call();
    void msg();
}
class Mobiledemo implements InterfaceDemo,second {


    @Override
    public void call() {
        System.out.println("calling");
    }

    @Override
    public void msg() {
        System.out.println("msgng");
    }

    @Override
    public void games(){
        System.out.println("gaming");
    }

    public static void main(String[] args) {
InterfaceDemo in=new Mobiledemo();
second sc=new Mobiledemo();
in.call();
in.msg();
in.games();
sc.call();
sc.msg();

    }
}
