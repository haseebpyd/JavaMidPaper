
package haseebproject2;

public class Rectangle18arid2974 extends GeometricObject{
    double length, width, Area;

    Rectangle18arid2974(double l, double w) {
        this.length = l;
        this.width = w;
    }

    public String calcArea() {
        this.Area = this.length * this.width;
        return String.valueOf(Area);
    }
    
}
