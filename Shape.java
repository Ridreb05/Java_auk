class Shape {
    double area;
    void displayarea(){
        System.out.println("The area of the shape is " + area);
    }
}
class Square extends Shape {
    Square(double side){
       area = side * side;
 
}
class Circle extends Shape {
    Circle(double radius){
        area = Math.PI * radius * radius;
    }
}
class Rectangle extends Shape {
    Rectangle(double length, double width){
        area = length * width;
    }
}
public static void main(String[] args) {
    Square s = new Square(4);
    Circle c = new Circle(3);
    Rectangle r = new Rectangle(5,2);
    r.displayarea();
    System.out.print("Square area: ");
    s.displayarea();
    System.out.print("Circle area: ");
    c.displayarea();
    System.out.print("Rectangle area: ");
    r.displayarea();
}
}