package Module2;

public class Passport {
    String passportNo;
    String issueDate;
    String expiryDate;

    Passport(String passportNo,String issueDate,String expiryDate){
        this.expiryDate = expiryDate;
        this.passportNo = passportNo;
        this.issueDate = issueDate;
    }

    String getDetails(){
        return "Passport: " + this.passportNo+" Issue: " + this.issueDate + " Expiry : " +this.expiryDate;
    }
}
