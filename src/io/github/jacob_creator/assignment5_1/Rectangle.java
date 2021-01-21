package io.github.jacob_creator.assignment5_1;

public class Rectangle {

    private double height;
    private double width;
    private double area;
    private double param;

    public Rectangle(double height, double width) {
        if(height > 0){
            this.height = height;
        } else {
            this.height = 0;
        }

        if(width > 0){
            this.width = width;
        } else {
            this.width = 0;
        }

        if(area == 0){
            this.area = width * height;
        }

        if(param == 0){
            this.param = (2*(width)) + (2*(height));
        }

    }

    public double getArea() {
        return area;
    }

    public double getHeight() {
        return height;
    }

    public double getParam() {
        return param;
    }

    public double getWidth() {
        return width;
    }

    public String toString(){
        return "The height is: "+ height +  "\n" + "The Width is: " + width +"\n"+ "The Area is: " + area+"\n"+ "The parameter is: " + param +"\n";
    }
}