package model;

public class Person {
    private String Name;
    private String PhoneNumber;
    private String EmailAddress;
    Person(String Name, String PhoneNumber, String EmailAddress){
        this.Name= Name; this.PhoneNumber=PhoneNumber; this.EmailAddress=EmailAddress;
    }
    public void setName(String name) {
        Name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public void setEmailAddress(String emailAddress) {
        EmailAddress = emailAddress;
    }

    public String getName() {return Name;}

    public String getPhoneNumber() {return PhoneNumber;}

    public String getEmailAddress() {return EmailAddress;}
}
