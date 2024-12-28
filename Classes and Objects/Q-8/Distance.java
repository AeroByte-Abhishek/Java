class AllDistance {
    private int km, m, cm;

    public void setDistance(int a, int b, int c){
        km = a;
        m = b;
        cm = c;
    }

    public void showDistance(){
        System.out.print(km + "km ");
        System.out.print(m + "m ");
        System.out.print(cm + "cm ");
    }


    public AllDistance addDistance(AllDistance d){
        AllDistance temp = new AllDistance();

        temp.cm = cm + d.cm;
        temp.m = temp.cm/100 + m + d.m;     //here we converted the cm to m but the cm is not updated yet
        temp.cm = temp.cm%100;      //here we update cm because if addition of two cm is 150 cm then it is wrong to write cuzz 100cm = 1cm so we have to write only 50cm so it is updated 
        temp.km = temp.m/1000 + km + d.km;
        temp.m = temp.m%1000;

        return temp;
    }
    
}

public class Distance {

    public static void main(String[] args) {
        AllDistance d1 = new AllDistance();
        AllDistance d2 = new AllDistance();
        AllDistance d3;
        d1.setDistance(3, 40, 10);
        d2.setDistance(2, 150, 20);
        d3 = d1.addDistance(d2);
        d3.showDistance();
        
    }
}