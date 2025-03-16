public class pattern10 {
    public static void main(String[] args) {
        int x = 9 / 2 + 1;
        int a=1;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (i == j || i + j == 10) {
                    System.out.print(a + " ");
                
                } else {
                    System.out.print("  ");
                }
            }
            if(i<x) 
            {
                a++;
            }
            else
            {
                a--;
            }
            System.out.println();
        }

    }
}
