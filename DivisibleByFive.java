class DivisibleByFive {
    int num;
    DivisibleByFive(int n){
        num = n;
    }
    void check(){
        if(num % 5 == 0){
            System.out.println("The number is divisible by 5");
        }
        else{
            System.out.println("The number is not divisible by 5");
        }
    }
    public static void main(String[] args) {
        DivisibleByFive obj = new DivisibleByFive(25);
        obj.check();
    }
}