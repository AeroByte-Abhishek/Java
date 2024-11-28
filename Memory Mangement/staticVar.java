class Test {
    int a = 1, b = -1;  // Instance Variable | Non-static variable
    static int k = 5;   // Static variable | class variable

    void setA(int x){       //Instance method cuzz it works as instance (object) specific that's why it is not become static variable
        a = x;
    }

    void setB(int y){       //Instance method cuzz it works as instance (object) specific that's why it is not become static variable
        b = y;
    }

    static void setK(int z){       // it is not work for object so koi matlab hi nhi hai ise instance banane ka
        k = z;
    }
}

class staticVar{
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        Test t3; //it is reference (nullable) | local variable and contains blank cuzz local variables are blank by default

        t1.setA(4);
        t1.setB(9);
        t1.setK(10);

        System.out.println("a = " + t1.a +  " b = "+ t1.b);
        System.out.println("a = " + t2.a + " b = "+ t2.b);
        System.out.println("K = " + Test.k);

        
    }
}