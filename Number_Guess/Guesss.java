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
            int distance = Math.abs(num2 - num );

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
            else if( num2 < num ) {
                System.out.println(" Your Number is small.");
                attempt++;
            }
            else if ( num2 > num) {
                System.out.println("Your number is big.");
                attempt++;
            }
            else {
                System.out.println( " ");

            }
            if ( distance <= 2){
                System.out.println(" You are very close.");
            }
            else if ( distance <= 5 ){
                System.out.println(" You are close.");
            }
                 else if ( distance <= 10){
                System.out.println(" You are far.");
            }
            else {
                System.out.println( " You are very far.");
            }

        }

        sc.close();
    }

    public static void main(String[] args) {
        Guesss g = new Guesss (15);
        g.checks();
    }
}

