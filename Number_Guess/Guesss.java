import java.util.Scanner;

public class Guesss {

    int num;
    int num2;

    Guesss (int num) {
        this.num = num;
    }

    void checks() {
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        int attempt = 1;

        while (check) {
            System.out.print("Enter the number: ");
            num2 = sc.nextInt();

            if (num2 == num) {
                System.out.println("Your guess is correct!");
                System.out.println("You guessed the number in " + attempt + " attempts.");
                check = false;
            }
            else if (num2 == num * 2) {
                System.out.println("Your number is double of the secret number.");
                attempt++;
            }
            else if (num2 > num * 2) {
                System.out.println("Your number is too big.");
                attempt++;
            }
            else {
                System.out.println("Your number is smaller.");
                attempt++;
            }
        }

        sc.close();
    }

    public static void main(String[] args) {
        Guesss g = new Guesss (15);
        g.checks();
    }
}
