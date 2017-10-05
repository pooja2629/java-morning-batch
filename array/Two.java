package array;

public class Two {
    void show() {
        int a[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < 3; i++) {

            System.out.print("  ");
            for (int j = 2; j < 3; j++) {

                {
                    for (int k = 0; k <= i; k++) {

                        System.out.print("  ");
                    }
                    System.out.print("\t" + a[i][j]);
                }
            }
            System.out.println("\n");
        }

    }


    public static void main(String[] args) {
   Two two=new Two();
        System.out.println("output of 2 d array");
   two.show();
    }
}