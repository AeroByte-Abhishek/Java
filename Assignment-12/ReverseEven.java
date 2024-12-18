import java.util.Scanner;

public class ReverseEven {
    public static void main(String[] args) {

        // message for user
        System.out.println("Enter a number here : ");
        Scanner sc = new Scanner(System.in);

        //user enter the number here
        int n = sc.nextInt();
        
        //program to print N even numbers in reverse
        for(int i = n; i>=1; i--){
            System.out.println(i*2);
        }

    }
}
