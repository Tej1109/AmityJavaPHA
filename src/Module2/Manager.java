package Module2;

public class Manager extends Employee {
    Manager(String name, String id,double salary,double bonus){
        super(name,id,salary,bonus);
    }
    @Override
    double calculateSalary(){
        return this.basicSalary + this.bonus;
    }
}
