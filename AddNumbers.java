class AddNumbers {
    int a, b;

    void add(){
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is " + sum);
    }

    public static void main(String[] args) {
        AddNumbers obj = new AddNumbers();
        obj.a = 10;
        obj.b = 20;
        obj.add();
    }
}