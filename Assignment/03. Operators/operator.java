public class operator {
    public static void main(String[] args) {
       char a = 'A';
       int b = 170;
       char uniCodeValue = (char)b;

       System.out.println("A\n" + ++a + uniCodeValue);



    // int a = 2345*10;
    // int b = a/100;
    int c = a%10;
    int d = b * 10 + c;
    System.out.println(d);

    System.out.println(5.5%1.5);
    }
}