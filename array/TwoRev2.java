package array;

public class TwoRev2 {
    public static void main(String[] args) {
        int a[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 3; i <9; i++) {

            for (int j = 0; j <3; j++) {


                if (i == j) {
                    for (int k = 0; k<=i ; k++) {
                        System.out.print("  ");


                        }
                    }
                    System.out.print(a[i][j]);
                }
            }
            System.out.println("\n");
        }

    }

