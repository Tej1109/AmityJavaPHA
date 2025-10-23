package Module4;
import java.util.Scanner;
import java.util.HashMap;
public class PHA_M4_Q2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        HashMap<String,Boolean> attendanceSheet= new HashMap<>();
        while (true){
            System.out.println("Enter name to mark attendance: ");
            String name = scanner.nextLine();
            if (attendanceSheet.containsKey(name)){
                System.out.println("Already marked");
                break;
            }
            else {
                attendanceSheet.put(name,true);
                System.out.println("Attendance marked for " + name);
            }
        }
    }
}
