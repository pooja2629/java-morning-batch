package homework;

public class Reverse {
    public static void main(String[] args) {
        String s="welcome to codekul";
        String s1="";
        int l=s.length();
        System.out.println(l);
        //char[] array = s.toCharArray();

        for(int i=l-1;i >= 0;i--)
        {
            s1=s1+s.charAt(i);
        }
        System.out.println(s1);
        //System.out.println(array);

    }
    }



