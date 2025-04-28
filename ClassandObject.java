class ObjectCreation {
    private String name;
    private int age;
    private double marks;

    public ObjectCreation (String name,int age,double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public void display (String name2) {
        System.out.println(name2);
        System.out.println("My name is : "+name);
        System.out.println("My age is : "+age);
        System.out.println("My marks is : "+marks);
    }
}

public class ClassandObject {
    public static void main(String[] args) {
        ObjectCreation obj = new ObjectCreation("Silu", 21, 75.6);
        obj.display("Student Details");
    }
}