// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
class Rectangle{
    double length;
    double breadth;


    public Rectangle(double length,double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }


    double calculateArea(){
        return length*breadth;
    }

    double calculateCircumference(){
        return 2*(length+breadth);
    }
}
class Main{
    public static void main(String[] args) {
        Rectangle rectangle5x6 = new Rectangle(5,6);
        Rectangle rectangle8x5 = new Rectangle(8,5);

        System.out.println("Area of the rectangle: " +rectangle5x6.calculateArea() );
        System.out.println("Circumference of the rectangle: "+rectangle5x6.calculateCircumference());;
        System.out.println("Area of the rectangle: " +rectangle8x5.calculateArea());
        System.out.println("Circumference of the rectangle: "+rectangle8x5.calculateCircumference());
    }
}