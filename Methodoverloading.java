public class Methodoverloading{
    public static class Methodoverload{

        public static int display(int a ,int b)
        {
            System.out.println("it is an integer");
            return a+b;
        }

        public static String display(String a, String b)
        {
            System.out.println("it is a string");
            return a+b;
        }

        public static double display(double a,double b)
        {
            System.out.println("it is a double");
            return a+b;
        }

        public static float display(float a,float b) 
        {
            System.out.println("it is a float");
            return a+b;
        }
    }
    public static void main(String[] args) {
        Methodoverload obj = new Methodoverload();
        
        System.out.println(obj.display(3,2f));
    }
}