class calculateCircle{
    int radius;
    float area, circumference;
    final float PI = 3.14159f;
    void setRadius(int r){
        radius = r;
    }
    
    void calculateArea(){
        area = PI * radius * radius;
    }

    void calculateCircumference(){
        circumference = 2*PI*radius;
    }

    void showRadius(){
        System.out.println("Radius of the circle is " + radius);
        System.out.println("Area of the circle " + area);
        System.out.println("Circumference of the circle " + circumference);
    }

   
}

public class Circle {

    public static void main(String[] args) {
        calculateCircle c1 = new calculateCircle();
        c1.setRadius(5);
        c1.calculateArea();
        c1.calculateCircumference();
        c1.showRadius();
        
    }
}