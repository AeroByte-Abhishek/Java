class Box {
    int length, breadth, height;    // Instance variable (object ke variables)
    void setDimension(int x, int y, int z){
        length = x;
        breadth = y;
        height = z;
    }

    void showDimension(){
        System.out.println("Length = " + length);
        System.out.println("Breadth = " + breadth);
        System.out.println("Height = " + height);
    }
}

class BoxDemo{
    public static void main(String[] args) {
        Box b1 = new Box();
        b1.setDimension(20, 40, 60);
        b1.showDimension();
    } 
}