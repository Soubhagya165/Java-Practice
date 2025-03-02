class Mybox{
    int height;
    int width;
    int depth;

    Mybox(int height,int width,int depth)
    {
        this.height = height;
        this.depth = depth;
        this.width = width;
    }

    void displayvolume()
    {
        System.out.println("The Volume is : "+height*width*depth);
    }
}
public class Constructor {
    public static void main(String[] args) {
        Mybox obj1 = new Mybox(5, 4, 3);
        Mybox obj2 = new Mybox(7, 6, 2);

        obj1.displayvolume();
        obj2.displayvolume();
    }
}
