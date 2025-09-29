package Module2;

public class Surgeon extends  Doctor{
    String surgeryType;

    Surgeon(String name,int age, String specialization, String surgeryType){
        super(name,age,specialization);
        this.surgeryType = surgeryType;
    }

    @Override
    public String toString(){
        return "Name: "  + this.name + "\nAge : " + this.age + "\nSpecialization :" + this.specialization +
                "\nSurgery Type : " + this.surgeryType;
    }
}
