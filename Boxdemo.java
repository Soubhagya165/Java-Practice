

class Student{ // Creating class Student

    //Class containing Instance Variables
    String name;
    int age;
    double mark;
    
    //class containing Methods
    void displaymarks()
    {
        System.out.println("The name of the Student is : "+name);
        System.out.println("The age of the Student is : "+age);
        System.out.println("The mark of the Student is : "+mark);
        System.out.println();
    }
}

//Main class this class name should be the file name
public class Boxdemo {

    //Main Function
    public static void main(String[] args) {

        //Creating objects s1 and s2 of student type
        Student s1 = new Student();
        Student s2 = new Student();

        //Assigning values to s1 and s2

        s1.name = "Soubhagya Kumar Mishra";
        s1.age = 21;
        s1.mark = 75.6;

        s2.name = "Debabrata das";
        s2.age = 22;
        s2.mark = 89.2;

        //Calling the methods by objects

        s1.displaymarks();
        s2.displaymarks();
    }
}
