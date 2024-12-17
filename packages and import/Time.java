import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;
import java.math.*;

public class Time{
    public static void main(String[] args) {
        LocalDate d = LocalDate.now(); // LocaldateTime is an object   //.now() is a static member function and it calls the reference of object
        System.out.println("Today's Date is : " + d);

    
        Random rand = new Random();
        int rand_a = 100 + rand.nextInt(101);

       
        System.out.println("Random is "+rand_a);

        LocalTime t = LocalTime.now();
        System.out.println("Current Time is : "+ t);

        System.out.println("Random Number is : "+ Math.random());
    }
}