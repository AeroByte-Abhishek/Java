import java.util.Scanner;

public class SquareN {
    public static void main(String[] args) {

        // message for user
        System.out.println("Enter a number here : ");
        Scanner sc = new Scanner(System.in);

        //user enter the number here
        int n = sc.nextInt();
        
        //program to print squares of first N numbers
        for(int i = 1; i<=n; i++){
            System.out.println(i*i);
        }

    }
}
