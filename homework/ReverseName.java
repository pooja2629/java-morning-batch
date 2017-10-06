package homework;

import sun.security.util.Length;

public class ReverseName {
    public static void main(String[] args) {
        String s = "WELCOMETOCODEKUL";
        int l=s.length();  // for calculating the length
        System.out.println(l);
        char[] array = s.toCharArray();
        char array1[]=new char[l];
        String s1=new String(array);
        for (int i =l-1; i >= 0; i--) {

            for (int j=0;j<i;j++) {
//                System.out.println(array[i]);
                array1[j] = array[i];
                // System.out.println(s1);
            }
            }
        System.out.println(array1);
//        String s1=new String(array);
    }
}