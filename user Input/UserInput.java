import java.util.Scanner;

public class UserInput{
    public static void main(String[] args) {
        System.out.println("Enter your full name and age here ");

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int age = sc.nextInt();

        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}