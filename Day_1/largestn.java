import java.util.Scanner;

public class largestn {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        int a = scanner.nextInt();

        System.out.print("Enter value of b: ");
        int b = scanner.nextInt();

        System.out.print("Enter value of c: ");
        int c = scanner.nextInt();

        if (a > b && a > c) {
            System.out.println("a is largest");
        } 
        else if (b > a && b > c) {
            System.out.println("b is largest");
        } 
        else {
            System.out.println("c is largest");
        }
        scanner.close();
    }
}
