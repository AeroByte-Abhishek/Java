public class Star_3 {
    public static void main(String[] args) {
        int i,j;

        // for(i=1; i<=5; i++){
        //     for(j=1; j<=5; j++){
        //         if(j>=i){
                    
        //             System.out.print("x");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }




        for(i=1; i<=5; i++){
            for(j=1; j<=5; j++){
                if(j<=6-i){
                    
                    System.out.print("x");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
