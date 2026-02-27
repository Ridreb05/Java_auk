class ReverseNumber {
    int num;
    ReverseNumber(int n){
        num = n;
    }
    void reverse(){
        int rev = 0,temp = num;
        while(temp > 0){
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp = temp / 10;
        }
        System.out.println("The reverse of the number is " + rev);
    }
    public static void main(String[] args) {
        ReverseNumber obj = new ReverseNumber(1234);
        obj.reverse();
    }
}