class Fibonacci {
    int n;
    Fibonacci(int n){
        this.n = n;
    }
    void printSeries(){
        int a = 0, b = 1;
        System.out.println("The Fibonacci series is:");
        for(int i = 0; i < n; i++){
            System.out.println(a+" ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
    public static void main(String[] args) {
        Fibonacci obj = new Fibonacci(10);
        obj.printSeries();
    }
}