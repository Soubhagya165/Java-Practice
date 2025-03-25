public class AddNumbers {
    int a,b,sum;
    AddNumbers(int a, int b)
    {
        this.a = a;
        this.b = b;
        sum = a+b;
    }
    public void displaySum()
    {
        System.out.println("Sum = "+sum);
    }
    public static void main(String[] args) {
        AddNumbers obj1 = new AddNumbers(30,43);
        obj1.displaySum();
    }
}
