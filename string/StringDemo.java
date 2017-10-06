package string;
//string types- litral
// using new keyword
//string constant pull(memory location)
public class StringDemo {
    public static void main(String[] args) {
        String s= "pooja";  // litral
        String s1="pooja";
        String s2=new String("pooja");     //using new keyword
        //if(s==s2){ // compares the address
            if (s1.equals(s2)){ // compares values inside the address
            System.out.println(s.hashCode());
            System.out.println(s1.hashCode());
            System.out.println(s2.hashCode());
            System.out.println("same values");

        }
        else{
            System.out.println("different values");
        }
    }
}
