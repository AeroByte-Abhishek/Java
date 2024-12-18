import java.util.Scanner;

public class Natural{
    public static void main(String[] args) {

        // message for user
        System.out.println("Enter a number here : ");
        Scanner sc = new Scanner(System.in);

        //user enter the number here
        int a = sc.nextInt();

        for(int i = 0; i<=a; i++){
            System.out.println(i);
        }

    }
}