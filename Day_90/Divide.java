import java.util.Scanner;

public class Divide {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int matrix[][] = new int[2][2];       
        System.out.println("Enter 4 numbers for 2x2 matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter a number to divide the matrix: ");
        int divideBy = sc.nextInt();

        System.out.println("Matrix after divide:");

        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[i][j] / divideBy + " "); 
            }
            System.out.println();
        }

        sc.close();
    }
}
