class Car {
    long price;
    String ownerName, colour, brand;
    static String SuperCar = "La Rose Noire Droptail";

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }


    public void setPrice(long price){
        this.price = price;
    }
    public long getPrice(){
        return price;
    }


    public void setColour(String colour) {
        this.colour = colour;
    }
    public String getColour() {
        return colour;
    }


    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public String getOwnerName() {
        return ownerName;
    }


    // public static void setSuperCar(String superCar) {
    //     SuperCar = superCar;
    // }
    // public static String getSuperCar() {
    //     return SuperCar;
    // }



    void showCarDetails(){
        System.out.println("Brand name of the car is : " + brand);
        System.out.println("Price of the car is : " + price);
        System.out.println("Colour of the car is : " + colour);
        System.out.println("Owner of the car is : " + ownerName);
        System.out.println("Super Car is so expensive : " + brand + " " + Car.SuperCar);
    }

}

public class RichPerson {

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setBrand("Rolls Royce");
        c1.setPrice(251000000);
        c1.setColour("Teal");
        c1.setOwnerName("Elon Musk");
        c1.showCarDetails();
    }
}