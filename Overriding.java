class Aves{

    String color;
}

class Mamal extends Aves{

    int age;
}

class Animal extends Mamal{

    String name;
}

class Dog extends Animal{

    double price;
}
public class Overriding {
    public static void main(String[] args) {
        Animal obj = new Animal();
        obj.name = "Silu";
        Mamal obj2 = new Dog();
        obj2.color = "red";

    }
}
