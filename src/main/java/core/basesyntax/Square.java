package core.basesyntax;

public class Square extends Figure {
    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void getInfoFigure() {
        System.out.println("Figure: " + "square, " + "area: "
                + getArea() + " sq.units, " + "side: "
                + getSide() + " units, " + "color: " + getColor());
    }
}