package Day_2 ;

public class Rectangle {
    private double length;
    private double breadth;
    private double area;
    private double perimeter ;

     Rectangle ( double l, double b ){
        length = l;
        breadth = b;

    }
    void areaofRectangle(){
        area = length * breadth ;
        System.out.println( " Area of rectangle is: " + area );
    }
    void perimeterofRectangle(){
        perimeter = 2 * ( length + breadth);
        System.out.println("Perimeter of Rectangle is:" + perimeter );
    }
     




}
