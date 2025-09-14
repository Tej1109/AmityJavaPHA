package Module2;

public class Employee {
    String name;
    String id;
    double basicSalary;
    double bonus;
    Employee(String name,String id, double basicSalary){
        this.name = name;
        this.basicSalary = basicSalary;
        this.id = id;
    }
    Employee(String name,String id, double basicSalary,double bonus){
        this.name = name;
        this.basicSalary = basicSalary;
        this.id = id;
        this.bonus = bonus;
    }

    double calculateSalary(){
        return this.basicSalary;
    }

    public String toString(){
        if (this.id.charAt(0) == 'M'){
            return "Manager " + this.name + "(" + this.id + ")" + " Salary: " + calculateSalary();
        }
        else {
            return "Employee " + this.name + "(" + this.id + ")" + " Salary: " + calculateSalary();
        }
    }
}
