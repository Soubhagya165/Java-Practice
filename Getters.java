class Getname{
    String name = "Soubhagya Kumar Mishra";

    public String getname() {
        return name;
    }

    public String setname(String x)
    {
        this.name = x;
        return x;
    }
    
}

public class Getters {
    public static void main(String[] args) {
        Getname obj = new Getname();
        System.out.println(obj.getname());
        System.out.println(obj.setname("My name is Silu"));
    }
}
