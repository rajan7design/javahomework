import java.util.Scanner;
 class GS {
    int number ;
    GS( int number ) {
        this.number= number ;
    }    
}

void guess (){
      Scanner scanner=new Scanner(System.in);
          int number ;
      while (true) {
    System.out.println(" Enter your guess ");
    int n = scanner.nextInt();
    if ( n == number ) {
        System.out.println( " Your guess is correct");
    }
    else {
        System.out.println( " Your guess is incorrect ");
    
    }


      }
}
public class Guess {
    public static void main(String[] args) {
       
        

         
         

       
    }
}
 