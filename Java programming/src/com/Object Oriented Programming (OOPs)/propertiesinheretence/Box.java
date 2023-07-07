package propertiesinheretence;

public class Box {
    double h;
    double l;
    double w;

    Box () {
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    Box (double side){
        this.l = side;
        this.h = side;
        this.w = side;
    }

    Box (double l,double h,double w){
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box (old Box){
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

    public void display(){
        System.out.println("Running the box");
    }
}
