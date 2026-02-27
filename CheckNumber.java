class CheckNumber {
    int num;
    CheckNumber(int n){
        num = n;
    }
    void check(){
        if(num > 0){
            System.out.println("The number is positive");
        }
        else if(num < 0){
            System.out.println("The number is negative");
        }
        else{
            System.out.println("The number is zero");
        }
    }
    public static void main(String[] args) {
        CheckNumber obj = new CheckNumber(-5);
        obj.check();
    }
}