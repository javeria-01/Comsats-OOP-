package Class_Examples;
class Box{
    double width;
    double height;
    double depth;
}
public class BoxDemo {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        Box mybox3 = new Box();
        double volume;
        mybox1.width = 12;
        mybox2.height = 34.5;
        mybox3.depth=23.78;
        volume = mybox1.width* mybox2.height* mybox3.depth;
        System.out.println("Volume is "+volume);
    }
}
//student class age reg or name likhna multiple obje or sout krna