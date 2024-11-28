class AllDistance {
    int km, m, cm;

    void setDistance(int a, int b, int c){
        km = a;
        m = b;
        cm = c;
    }

    void showDistance(){
        System.out.println("Distance in km is : " + km);
        System.out.println("Distance in m is : " + m);
        System.out.println("Distance in cm is : " + cm);
    }
    
}

public class Distance {

    public static void main(String[] args) {
        AllDistance d1 = new AllDistance();

        d1.setDistance(10, 10000, 1000000);
        d1.showDistance();
    }
}