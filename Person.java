class Person {
    String name;
    int age;
    Person(){
        name = "Unknown";
        age = 0;
    }
    Person(String n, int a){
        name = n;
        age = a;
    }
    void display(){
        System.out.println("The name of the person is " + name);
        System.out.println("The age of the person is " + age);
    }
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.display();
        Person p2 = new Person("Debanik", 20);
        p2.display();
    }
}