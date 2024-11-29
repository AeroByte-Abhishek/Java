class bankAccount {
    int accountNumber, balance;
    String customerName;
    static float rateOfInterest;


    void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    int getAccountNumber() {
        return accountNumber;
    }

    void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    String getCustomerName() {
        return customerName;
    }
    
    void setBalance(int balance) {
        this.balance = balance;
    }
    public int getBalance() {
        return balance;
    }

    void calculateSimpleInterest(int time){

        if(time > 0){
        float simpleInterest = (balance * rateOfInterest * time)/100;
        System.out.println("Simple Interest is " + simpleInterest);
    }else{
        System.out.println("Time has to be greater than 0 years");
    }
    }

    static void setRateOfInterest(float rateOfInterest) {
        if(rateOfInterest >= 0){
            bankAccount.rateOfInterest = rateOfInterest;
        }else{
            System.out.println("Rate of interest cannot be negative");
        }
    }



    void showResult(){
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Customer Name : " + customerName);
        System.out.println("Balance : " + balance);
        System.out.println("Rate of Interest is : " + rateOfInterest);
    }
}

public class Account {

    public static void main(String[] args) {
        bankAccount b1 = new bankAccount();

        b1.setAccountNumber(120836);
        b1.setCustomerName("Abhishek Mishra");
        b1.setBalance(190000);
        bankAccount.setRateOfInterest(43.24f);
        b1.calculateSimpleInterest(4);
        b1.showResult();


    }
}