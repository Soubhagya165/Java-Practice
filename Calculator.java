import java.util.Scanner;

class Newcalculator{

    public String Newoperation(int a,int b,Scanner sc,int n) {
        

        switch(n){
            case 1:
            System.out.println("The Addition is : "+(a+b));
            break;
            case 2:
            System.out.println("The Substraction is : "+(a-b));
            break;
            case 3:
            System.out.println("The Multipliaction is : "+(a*b));
            break;
            case 4:
            System.out.println("The Division is : "+(a/b));
            break;
            case 5:
            return "Exit";
            
            default:
            System.out.println("Enter a valid number !!!");

        }
        return "";
    }
    public String Operation() {
        String display1 = "Enter One Operation : \n\n"+
        "1.Addition\n"+
        "2.Substraction\n"+
        "3.Multiplication\n"+
        "4.Division\n"+
        "5.Exit";
        return display1;
    }
    void display() {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.print("Enter 1st Number : ");
            int a = sc.nextInt();
            System.out.print("Enter 2nd Number : ");
            int b = sc.nextInt();
            System.out.println(Operation());
            int n = sc.nextInt();
        String z = Newoperation(a,b,sc,n);


        if(z.equals("Exit"))
        {
            System.out.println("Exiting the Program");
            break;
        }
        }
        
    }

    
}

public class Calculator {
    public static void main(String[] args) {
        Newcalculator obj = new Newcalculator();
        obj.display();
    }
}
