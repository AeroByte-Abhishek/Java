public class decision {
    public static void main(String[] args) {
        int  a = 49;
        
        if(a%5 == 0 || a%7 == 0){
            System.out.println("Given Number is divisible by 5 or 7");
        }else{
            System.out.println("Given Number is not divisible by 5");
        }



        int x = 32;
        int z = 41;
        if(z/2 * 2 != z ){
            System.out.println("Number is odd");
        }else{
            System.out.println("Number is even");
        }


        int y = 29;
        if(a>x && a>y){
            System.out.println("a is greater than x and y");
        }
        if(x>a && x>y)
        {
            System.out.println("x is greater that y");
        }else if(y>a && y>x){
            System.out.println("Y is greater that a and x");
        }
    }
}