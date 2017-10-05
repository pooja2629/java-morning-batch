package test;

import java.util.Scanner;

public class OneDArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int a[]=new int[10];

        for (int i = 0; i < 5; i++) {
            a[i] = scanner.nextInt();
            System.out.println(a[i]+" ");
        }
    }

}
