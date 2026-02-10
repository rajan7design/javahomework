import java.util.Scanner;

public class Employee {

    int salary;
     boolean check = true;

    void getSalary() {
        Scanner sc = new Scanner(System.in);
        while (check) {
            
           
        System.out.print("Enter your salary: ");
        salary = sc.nextInt();

        if (salary >= 30000) {
            System.out.println("Your bonus is 10%");
        } else {
            System.out.println("Your bonus is 5%");
        }
        
        sc.close();
        
    }
}

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.getSalary();
    }

}

