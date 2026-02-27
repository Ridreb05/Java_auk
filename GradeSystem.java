class GradeSystem {
    double percentage;
    GradeSystem(double p){
        percentage = p;
    }
    void calculateGrade(){
        if(percentage >= 90){
            System.out.println("The grade is A");
        }
        else if(percentage >= 80){
            System.out.println("The grade is B");
        }
        else if(percentage >= 70){
            System.out.println("The grade is C");
        }
        else if(percentage >= 60){
            System.out.println("The grade is D");
        }
        else if(percentage >= 40){
            System.out.println("The grade is E");
        }
        else{
            System.out.println("The grade is F");
        }
    }
    public static void main(String[] args) {
        GradeSystem obj = new GradeSystem(85);
        obj.calculateGrade();
    }
}