package homework;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

    int a[]=new int[10];
            int n,i;
    Scanner scanner=new Scanner(System.in);
        System.out.println("how many elements are there in array");

        n = scanner.nextInt();

        System.out.print("Enter " + n + " Element to Store in Array : ");
        for(i=0; i<n; i++)
        {
            a[i] = scanner.nextInt();
        }


        System.out.print("Elements in Array is :\n");
        for(i=0; i<n; i++)
        {
            System.out.print(a[i] + "  ");
        }

    }



}
