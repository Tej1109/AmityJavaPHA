package Module2;

public class Department {
    private String deptName;
    private String hodName;
    private Professor[] professors = new Professor[10];
    private int count = 0;

    Department(String deptName, String hodName){
        this.deptName = deptName;
        this.hodName = hodName;
    }

    void addProfessor(Professor p){
        this.professors[count] = p;
        this.count += 1;
    }

    @Override
    public String toString(){
        String dept = "Department: " + this.deptName + "\n" ;
        String hod = "HOD: " + this.hodName + "\n";
        String professorDetails = "";

        for (int i = 0; i < this.count; i++){
            professorDetails += professors[i].getDetails() + "\n";
        }
        return dept + hod + professorDetails;
    }
}
