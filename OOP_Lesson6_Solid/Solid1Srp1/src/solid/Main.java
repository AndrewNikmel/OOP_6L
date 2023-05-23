package solid;

import solid.srp.Drawing;
import solid.srp.Point;
import solid.srp.Square;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(new Point(1,1), 5);
        Drawing drawing = new Drawing(5*2);
        System.out.printf("Площадь фигуры: %d \n", square.getArea());
        drawing.draw();
    }
}
