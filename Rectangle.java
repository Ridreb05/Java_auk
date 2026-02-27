class Rectangle {
    double length, width;
    void calculate(){
        double area = length * width;
        double perimeter = 2 * (length + width);
        System.out.println("The area of the rectangle is " + area);
        System.out.println("The perimeter of the rectangle is " + perimeter);
    }

    public static void main(String[] args) {
        Rectangle obj = new Rectangle();
        obj.length = 10;
        obj.width = 5;
        obj.calculate();
    }
}