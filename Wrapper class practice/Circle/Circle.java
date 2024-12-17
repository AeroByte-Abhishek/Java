class CircleDetails{
    private Integer r;

    public void setR(Integer r) {
        this.r = r;
    }

    public Integer getR() {
        return r;
    }

    public Double getArea(){
      return Math.PI * r * r;
    }

    public Double getCircumference(){
        return 2* Math.PI *r;
    }

}

public class Circle {

    public static void main(String[] args) {
        CircleDetails c1 = new CircleDetails();

        c1.setR(32);
        System.out.println("Radius : " + c1.getR());
        System.out.println("Area of circle is : " + c1.getArea());
        System.out.println("Circumference of circle is : " + c1.getCircumference());
    }
}