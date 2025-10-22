package Module3;

public class StudentMarks  {

    public void enterMarks(int marks) throws InvalidMarksException{
        if (marks < 0 || marks > 100){
            throw new InvalidMarksException();
        }
        else {
            System.out.println("Entered Successfully");
        }
    }
}
