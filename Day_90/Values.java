import java.util.Scanner;

public class Values {
    public static void main ( String [] args) {

        int [][] number = new int [3][4] ;

       Scanner sc = new Scanner ( System.in) ;

       System.out.println( " Enter the numbers ");
          
       for ( int i = 0 ; i<=3; i++ ){
        for ( int j = 0 ; j<=4; j++ ){
            number [i] [j] = sc.nextInt();
            System.out.println ( number[i] [j]);
            sc.close();
        }
        
       }



      

    }
}
