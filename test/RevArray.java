package test;

import com.sun.org.apache.xpath.internal.SourceTree;

public class RevArray {
    public static void main(String[] args) {
        int a[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        for (int i =0; i<4; i++) {

            for (int j=0; j<4; j++) {
                System.out.print("");

                if (i == j) {

                    for (int k =0; k <=i; k++) {
                        System.out.print("   ");
                    }
                    System.out.print(a[i][j]);
                }
            }
            System.out.println("\n");

        }
    }
}
