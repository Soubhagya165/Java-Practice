import java.util.Scanner;
public class Democons {
    private String x;

    public Democons() {

    }

    public Democons (String x) {
        this.x = x;
    }

    public int getWordcount() {
        int count = 0;

        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Democons ob = new Democons(input);
        System.out.println("The "+ob.getWordcount());
        sc.close();

    }
}
