package Module2;

public class Doctor extends Person{
    String specialization;
    Doctor(String name, int age, String specialization){
        super(name,age);
        this.specialization = specialization;
    }

    @Override
    public String toString(){
        return "Name: "  + this.name + "\nAge : " + this.age + "\nSpecialization :" + this.specialization;
    }
}
