public class Star_2 {
    public static void main(String[] args) {
        int i, j;
        
        for (i = 1; i <= 5; i++) {
            for (j = 5; j >= 1; j--) {
                if (j < 1 + i) {
                    System.out.print("x");
                } 
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }




        /*************Another way for same pattern**************/

        // int i, j;
        
        // for(i = 1; i<=5; i++){
        //     for(j = 1; j<=5; j++){
        //         if(j >= 6-i){
        //             System.out.print("x");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //         System.out.print("\n");
            
        // }
    }
}
