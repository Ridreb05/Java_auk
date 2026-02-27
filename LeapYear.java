class LeapYear {
    int year;
    LeapYear(int y){
        year = y;
    }
    void checkLeap(){
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("The year is a leap year");
        }
        else{
            System.out.println("The year is not a leap year");
        }
    }
    public static void main(String[] args) {
        LeapYear obj = new LeapYear(2024);
        obj.checkLeap();
    }
}