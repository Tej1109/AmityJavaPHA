package Module2;

public class PremiumStudent extends  Student2{
    double discount;
    PremiumStudent(String name,Course enrolledCourse,double discount){
        super(name,enrolledCourse);
        this.discount = discount;
    }

    public String toString(){
        return "Premium " +super.toString() + " Discount" + ": " + ((int) this.discount) + "%";
    }
}
