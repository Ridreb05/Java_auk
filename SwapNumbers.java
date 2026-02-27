class SwapNumbers {
    int num;
    SwapNumbers(int n){
      num = n;
    }
    void swap(){
        int temp = thisnum;
        this.num = objnum;
        obj.num = temp;
    }
    void display(){
        System.out.println("The number is " + num);
    }
    public static void main(String[] args) {
        SwapNumbers obj1 = new SwapNumbers(5);
        SwapNumbers obj2 = new SwapNumbers(10);
        System.out.println("Before swapping:");
        obj1.display();
        obj2.display();
        obj1.swap(obj2);
        System.out.println("After swapping:");
        obj1.display();
        obj2.display();
    }
}