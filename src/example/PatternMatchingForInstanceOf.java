package example;


public class PatternMatchingForInstanceOf {

    public static void main(String[] a) {
        /* instanceOfPatternMatchingBefore17();*/
        //System.out.println(getPerimeterBefore17(new Rectangle(10,29)));
        System.out.println("before 16" + getPerimeterBefore16(new Circle(10)));

        //The Pattern matching instanceof feature performs casts after type comparisons.
        System.out.println("Inside 16" + getPerimeterUsing16(new Circle(10)));

        /*  instanceOfPatternMatching17();*/
    }

    public static double getPerimeterBefore16(Shape shape) throws IllegalArgumentException {
        if (shape instanceof Rectangle) {
            Rectangle s = (Rectangle) shape;
            return 2 * s.length() + 2 * s.width();
        } else if (shape instanceof Circle) {
            Circle s = (Circle) shape;
            return 2 * s.radius() * Math.PI;
        } else {
            throw new IllegalArgumentException("Unrecognized shape");
        }
    }

    public static double getPerimeterUsing16(Shape shape) throws IllegalArgumentException {
        if (shape instanceof Rectangle r) {
            return 2 * r.length() + 2 * r.width();
        } else if (shape instanceof Circle c) {
            return 2 * c.radius() * Math.PI;
        } else {
            throw new IllegalArgumentException("Unrecognized shape");
        }
    }
}

