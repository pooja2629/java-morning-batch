package keywords;
// uses- 1) to initialize instance variable
//2)by default this key is inserted
//3)to call parameterized constructor in default constructor()
//4) to pass the argument in method
//5)argument inside the constructor
public class ThisKey {
    int id;
    String name;
    ThisKey()
    {
        this(1,"pooja");
    }
    ThisKey(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    void show(){

        System.out.println("id: "+id+"\t"+"name: "+name);
    }
    void get(){

        show();
    }
    public static void main(String[] args) {
        ThisKey thiskey=new ThisKey();
        thiskey.get();

    }
}
