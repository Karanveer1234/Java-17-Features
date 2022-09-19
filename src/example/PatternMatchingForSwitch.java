package example;

public class PatternMatchingForSwitch {

    public static void main(String ...a){
        System.out.println("convert string into double="+getDoubleUsingIf(1)) ;
        System.out.println("convert string into double="+getDoubleUsingSwitch(1)) ;
    }
    static double getDoubleUsingIf(Object o) {
        double result;
        if (o instanceof Integer) {
            result = ((Integer) o).doubleValue();
        } else if (o instanceof Float) {
            result = ((Float) o).doubleValue();
        } else if (o instanceof String) {
            result = Double.parseDouble(((String) o));
        } else {
            result = 0d;
        }
        return result;
    }

    //type pattern example
    static double getDoubleUsingSwitch(Object o) {
        return switch (o) {
            case Integer i -> i.doubleValue();
            case Float f -> f.doubleValue();
            case String s -> Double.parseDouble(s);
            default -> 0d;
        };
    }
}
