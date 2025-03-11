class Box {
    int width;
    int height;
    int depth;

    void volume() {
        System.out.println("The volume is : "+width*height*depth);
    }

}
public class Method {
    public static void main(String[] args) {
        Box Mybox1 = new Box();
        Box Mybox2 = new Box();

        Mybox1.width = 5;
        Mybox1.height = 7;
        Mybox1.depth = 3;

        Mybox2.width = 4;
        Mybox2.height = 2;
        Mybox2.depth = 7;

        Mybox1.volume();
        Mybox2.volume();
    }
}
