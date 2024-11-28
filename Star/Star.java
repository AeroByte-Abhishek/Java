public class Star {
    public static void main(String[] args) {
        int i, j;
        
        for(i = 1; i<=10; i++){
            for(j = 10; j>=0; j--){
                if(j >= 11-i){
                    System.out.print("x ");
                }else{
                    System.out.print(" ");
                }
            }
                System.out.print("\n");
            
        }
    }
}
