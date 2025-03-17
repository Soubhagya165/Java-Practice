class Aves {
    public void eat() {
        System.out.println("Generally ,Aves fly");
    }
}

class Bird extends Aves {
    public void eat() {
        super.eat();
        System.out.println("Eats to live");
    }
}

class Parrot extends Bird {
    public void eat() {
        super.eat();
        System.out.println("Parrots eats seeds and fruits");
    }
}
public class vulture extends Bird{
        public void vision() {
            System.out.println("Vultures can see from sky");
        }
    

    public static void main(String[] args) {
        Bird obj = new Bird();
        Aves obj1 = new Aves();
        Parrot obj2 = new Parrot();
        vulture obj3 = new vulture();
        // obj.nature();
        // obj.eat();
        // obj1.nature();
        // obj2.nature();
        obj2.eat();
        // obj2.eat();
    }
}


