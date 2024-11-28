public class reverse {
    public static void main(String[] args) {
        int x = 2563;
       
       int a = x%10;
       int b = x/10%10;
       int c = x/100%10;
       int d = x/1000;
       
       System.out.print(""+a+b+c+d);
    }
}
