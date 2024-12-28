package assignments;

public class A7 {
    public void driver(){
        Complex c1 = new Complex();
        c1.setComplex(20, 80);
        c1.printComplex();
    }
}

class Complex{
    private int real, imag;

    public void setComplex(int r, int i){
        real = r;
        imag = i;
    }


    public void printComplex(){
        System.out.println("Real Number is : " + real);
        System.out.println("Imaginary number is : " + imag);
    }
}