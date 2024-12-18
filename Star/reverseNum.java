public class reverseNum {
    public static void main(String[] args) {
        int i,j,k;

        for(i=1, k=1; i<=4; i++){
           
            for(j=1; j<=4; j++){
               
                if(j<=i){
                    System.out.print(k++);
                }
            }
            System.out.println();
        }
       
    }
}
