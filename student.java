public class student {
    public static class Student {
        String name;
        int age;
        double mark;
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.age = 21;
        s1.name = "Silu";
        s1.mark =23.32;
        System.out.println(s1.age);
        System.out.println(s1.mark);
        System.out.println(s1.name);
        
    }
}
