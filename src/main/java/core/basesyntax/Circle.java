package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void getInfoFigure() {
        System.out.println(("Figure: " + "circle, " + "area: " + getArea()
                + " sq.units, " + "radius: " + getRadius()
                + " units, " + "color: " + getColor()));
    }
}