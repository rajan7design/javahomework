 class RR {
    String model;
    int year;

    RR(String m, int y) {
        model = m;
        year = y;
    }
}


public class Car {
    public static void main(String[] args) {
        RR c1 = new RR("Rolls Royce Boat Tail", 2020);
        
        System.out.println("Model:" + c1.model);
        System.out.println("The Presented year is:" + c1.year);
    }
}
