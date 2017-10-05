package homework;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int Rows = scanner.nextInt();

        int Columns = scanner.nextInt();

        int[][] a = new int[Rows][Columns];

        System.out.println("Enter the numbers in array: ");

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a[i].length; j++) {

                a[i][j] = scanner.nextInt();
            }
            System.out.println("value of a");

        }
    }
}