import java.util.*;

abstract class Shape {
    int a, b;

    abstract void printArea();
}

class Rectangle extends Shape {
    int l, w;

    Rectangle(int l, int w) {
        this.l = l;
        this.w = w;
    }

    void printArea() {
        System.out.println("Area of the rectangle is " + (l * w));
    }
}

class Triangle extends Shape {
    float b, h;

    Triangle(float b, float h) {
        this.b = b;
        this.h = h;
    }

    void printArea() {
        System.out.println("Area of the triangle is " + (0.5 * b * h));
    }
}

class Circle extends Shape {
    float r;

    Circle(float r) {
        this.r = r;
    }

    void printArea() {
        System.out.println("Area of the circle is " + (3.14 * r * r));
    }
}

class Area {
    public static void main(String args[]) {
        Rectangle r = new Rectangle(2, 3);
        Triangle t = new Triangle(5, 6);
        Circle c = new Circle(7);
        Shape s;
        s = r;
        s.printArea();
        s = t;
        s.printArea();
        s = c;
        s.printArea();
    }
}