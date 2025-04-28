class Main {
    int age;
    String name;

    public Main (int age) {
        this.age = age;
    }

    public Main (String name) {
        this.name = name;
    }

    public void display () {
        System.out.println(age);
        System.out.println(name);
    }
}

public class ConstructorOverload {
    public static void main(String[] args) {
        Main obj = new Main("Silu");
        obj.display();
    }
}
