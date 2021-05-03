package haseebproject2;

public class CircleMuhammadHaseeb extends GeometricObject {

    double radius, Area, PI = 3.14;

    CircleMuhammadHaseeb(double r) {
        this.radius = r;
    }

    public String calcArea() {
        this.Area = 2 * (PI * this.radius);
        return String.valueOf(Area);
    }

}
