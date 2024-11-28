class AllContacts{
    int id;
    long mobileNo;
    String firstName, lastName, emailId;

    void setId(int id){
        this.id = id;
    }
    int getId(){
        return id;
    }


    void setNumber(long mobileNo){
        this.mobileNo = mobileNo;
    }
    long getNumber(){
        return mobileNo;
    }


    void setName(String firstName){
        this.firstName = firstName;
    }
    String getName(){
        return firstName;
    }


    void setLastName(String lastName){
        this.lastName = lastName;
    }
    String getLastName(){
        return lastName;
    }

    void setEmailId(String emailId){
        this.emailId = emailId;
    }
    String getEmailId(){
        return emailId;
    }

    void ShowContact(){
        System.out.println("ID: " + id);
        System.out.println("first Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Mobile Number: " + mobileNo);
        System.out.println("Email Id: " + emailId);
    }

}


public class Contact {

    public static void main(String[] args) {
        AllContacts c1 = new AllContacts();
        c1.setId(69);
        c1.setName("Abhishek");
        c1.setLastName("Mishra");
        c1.setNumber(8305194740L);
        c1.setEmailId("abhishek23@gmail.com");

        c1.ShowContact();
    }
}