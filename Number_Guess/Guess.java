import java.util.Scanner;
  public class Guess {
    int number ;

    Guess( int number ) {
        this.number= number ;
    }    


void check (){
      Scanner sc = new Scanner(System.in);
          
      while (true) {

    System.out.println(" Enter your guess ");
    int n = sc.nextInt();
    if ( n == number ) {
        System.out.println( " Your guess is correct");
    }
    else if ( n > number ) {
           System.out.println( " Your guess  is greater");

        
    }
    
    else {
        System.out.println( " Your guess is smaller  ");
        
    }
        
 
      }
      sc.close();
}

    public static void main(String[] args) {
       
        
        Guess  g = new Guess( 13) ;
         
         g .check();

       
    }
}
 