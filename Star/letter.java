public class letter {
    public static void main(String[] args) {
        int i, j;
        char letter = 'A';

        for (i = 0; i <= 4; i++) {
            for (j = 0; j <= 4; j++) {
                if (j >= i) {
                    char result = (char) (letter + j);
                    System.out.print(result);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");

        }
    }
}
