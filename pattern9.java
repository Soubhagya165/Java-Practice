public class pattern9 {
    public static void main(String[] args) {
        int a = 1;
        int b = 9/2+1;
        for(int i = 1;i<=9;i++)
        {
            for(int j = 1;j<=a;j++)
            {
                System.out.print(j+" ");
            }
            if(i<b)
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