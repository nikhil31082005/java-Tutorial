package propertiesinheretence;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(4,4,6);
        Box box2 = new Box(box1);
        System.out.println(box1.l+" "+box1.h+" "+box1.w);
    }
}
