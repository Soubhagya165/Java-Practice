public class pattern8 {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (int l = 1; l <= 2 * (6 - i); l++) {
                System.out.print("  ");
            }
            for (int k = i; k >=1; k--) {
                
                    System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
