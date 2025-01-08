package lv.rvt;

public class Box {
    private double w;
    private double h;
    private double l;
    private double side;


    public Box (double length, double height, double width){  
        this.w = width;
        this.l = length;
        this.h = height;
    }

    public Box(double side){
        this.side = side;
    }

    public double width(){
        return this.w;
    }
    public double height(){
        return this.h;
    }
    public double length(){
        return this.l;
    }
    


    public Box( Box oldBox){
        this.w = oldBox.w;
        this.l = oldBox.l;
        this.h = oldBox.h;
    }

    public double volume() {
        return this.w * this.l * this.h;
    }

    public double area() {
        return 2 * faceArea() + 2 * topArea() + 2 * sideArea() ;
    }

    private double faceArea() {
        return this.h * this.w;
    }

    private double topArea() {
        return this.l * this.h;
    }

    private double sideArea() {
        return this.w * this.h;
    }

    public Box biggerBox( Box oldBox ) {
        return new Box(1.25*oldBox.width(), 1.25*oldBox.length(), 1.25*oldBox.height());
    }

    public Box smallerBox( Box oldBox ) {
        return new Box(0.75*oldBox.width(), 0.75*oldBox.length(), 0.75*oldBox.height());
    }


    public boolean nests(Box outsideBox) {
        return this.h < outsideBox.height() && this.w < outsideBox.width() && this.l < outsideBox.length();
    }









}

