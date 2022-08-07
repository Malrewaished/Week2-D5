import java.lang.management.GarbageCollectorMXBean;

public class Circle implements GeometricIbject {
protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
public double getPerimeter(){
        return radius * radius;
}

public double getArea(){
        return radius;
}
}