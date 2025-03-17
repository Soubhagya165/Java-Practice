class Box {
    int height;
    int width;
    int depth;

    void display()
    {
        System.out.println("The Volume is : "+height*depth*width);
    }

    Box (int height,int width,int depth)
    {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }
}

public class Parameter{
    public static void main(String[] args) {
        Box box1 = new Box(3,5,7);
        Box box2 = new Box(8,9,2);

        box1.display();
        box2.display();
    }
}