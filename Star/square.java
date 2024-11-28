public class square {

    public static void main(String[] args) {
        int  i, j;
        
        for(i=0; i<=5; i++){
            for(j=0; j<=5; j++){
                if(j==0 || j==5 && i<=5 || i==0 || i==5){
                    System.out.print("x");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}