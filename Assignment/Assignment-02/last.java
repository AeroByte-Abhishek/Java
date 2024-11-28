class last {
    public static void main(String[] args){
        int a = 792;
        int b = 83;
        System.out.println( "Without last digit: " + (a/10));
        
        //swap the values of a and b
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("a: " + a + " b :" +b);

        // swap values using 3rd variable
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a: " + a + " b: " + b);

        System.out.println(35&83);
        System.out.println(47|29);
        System.out.println(76^108);
        System.out.println(200>>1);
    }
}