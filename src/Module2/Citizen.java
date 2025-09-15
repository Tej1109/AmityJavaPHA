package Module2;

public class Citizen {
    String name;
    String dob;
    String address;
    Passport passport;

    Citizen(String name,String dob, String address, String passportNo, String issueDate,String expiryDate){
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.passport = new Passport(passportNo,issueDate,expiryDate);
    }

    @Override
    public String toString(){
        return "Citizen: " + this.name+ " DOB: "+ this.dob + " Address : " + this.address + "\n" + this.passport.getDetails();
    }
}
