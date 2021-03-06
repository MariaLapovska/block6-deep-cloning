package ua.kpi.tef;

/**
 * Created by User on 07.04.2016.
 */
public class Point implements Cloneable {

    private double x;
    private double y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public Point clone()  {
        try {
            return (Point) super.clone();
        } catch (CloneNotSupportedException ex){
            return null;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Point point = (Point) o;

        if (Double.compare(point.x, x) != 0) {
            return false;
        }

        return Double.compare(point.y, y) == 0;

    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(getX());
        int result = (int) (temp ^ (temp >>> 32));

        temp = Double.doubleToLongBits(getY());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
