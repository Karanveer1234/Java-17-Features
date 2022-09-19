package sealed;

public sealed class Rectangle extends Shape permits FilledRectangle {
    public double length, width;
}
