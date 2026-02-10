import java.util.Scanner ;
public class Value {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        String a[] = new String [7];
        System.out.println("Enter the Names");

        for (int i = 0; i < 7; i++) {
            a[i] = sc.nextLine();
        }

        for (int i = 0; i < 7; i++) {
            System.out.println("Names:" + a[i]);
                
            
        }
        
    }

}