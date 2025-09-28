package Module2;
public class Professor {
    private String name;
    private String employeeId;
    private String specialization;

    Professor(String name,String employeeId,String specialization){
        this.name = name;
        this.employeeId  = employeeId;
        this.specialization = specialization;
    }

    String getDetails(){
        return "Name : " +this.name +", EmployeeID :  " + this.employeeId + ", Specialization : " +
                this.specialization;
    }
    @Override
    public String toString(){
        return this.getDetails();
    }

}
