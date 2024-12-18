import java.util.Scanner;

public class EvenN {
    public static void main(String[] args) {

        // message for user
        System.out.println("Enter a number here : ");
        Scanner sc = new Scanner(System.in);

        //user enter the number here
        int n = sc.nextInt();
        
        //program to print N even numbers
        for(int i = 1; i<=n; i++){
            System.out.println(i*2);
        }

    }
}
