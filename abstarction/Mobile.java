package abstarction;

abstract  class Mobile {
    abstract void call();
    abstract void msg();
    void game(){
        System.out.println("playing game");
    }
}
abstract class cellphone extends Mobile{
    void call(){
        System.out.println("calling");
    }
    void msg(){
        System.out.println("msging");
    }
}
class Abstraction extends cellphone{
    public static void main(String[] args) {
        Mobile m=new Abstraction();
        m.call();
        m.msg();
        m.game();
    }
}
