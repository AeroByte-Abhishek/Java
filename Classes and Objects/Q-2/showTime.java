class Time {
    int hours, minutes, seconds;    //instance variables


    //Method to set values of time 

    void setValues(int a, int b, int c){
        hours = a;
        minutes = b;
        seconds = c;
    }


    // Method to display values of time

    void displayValues(){
        System.out.println(hours + " Hours");
        System.out.println(minutes + " Minutes");
        System.out.println(seconds + " Seconds");
    }

}

public class showTime {
    public static void main(String[] args) {
        Time t1 = new Time();       // Create an object of Time
        t1.setValues(3, 45, 20);    // Set the time
        t1.displayValues();     // Display the time
    }
}