import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int matrix1[][] = new int[2][2];
        int matrix2[][] = new int[2][2];

        System.out.println("Enter 4 numbers for first 2x2 matrix:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                matrix1[i][j] = sc.nextInt();

        System.out.println("Enter 4 numbers for second 2x2 matrix:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                matrix2[i][j] = sc.nextInt();

        System.out.println("Matrix after addition:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++)
                System.out.println(matrix1[i][j] + matrix2[i][j] + " ");
            System.out.println();
        }

        sc.close();
    }
}
