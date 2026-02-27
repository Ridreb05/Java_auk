class Student {
    String name;
    int age ;
    Student(String n, int a){
        name = n;
        age = a;
    }
    void display(){
        System.out.println("The name of the student is " + name);
        System.out.println("The age of the student is " + age);
    }
    public static void main(String[] args) {
        Student s1 = new Student("Debanik", 20);
        s1.display();
    }
}