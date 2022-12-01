package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public int getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    public int getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(int secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public void getInfoFigure() {
        System.out.println("Figure: " + "rightTriangle, " + "area: "
                + getArea() + " sq.units, " + "firstLeg: "
                + getFirstLeg() + " units, " + "secondLeg: "
                + getSecondLeg() + " units, " + "color: " + getColor());
    }
}