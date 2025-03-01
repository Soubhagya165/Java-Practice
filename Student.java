class X{
    public int Add(int x,int y) {
        System.out.println("Anshu");
        return x+y;
    }

    public String Add(String x,String y)
    {
        System.out.println("Chiku");
        return x+y;
    }
}

public class Student {
    public static void main(String[] args) {
        X obj = new X();
        String z = obj.Add("2", "3");
        System.out.println(z);
    }
}