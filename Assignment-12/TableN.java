import java.util.Scanner;

public class TableN {
    public static void main(String[] args) {

        // message for user
        System.out.println("Enter a number here : ");
        Scanner sc = new Scanner(System.in);

        //user enter the number here
        int n = sc.nextInt();
        
        //program to print Table of N.
        for(int i = 1; i<=10; i++){
            System.out.println(n + " x " + i + " = " + i*n);
        }

    }
}
