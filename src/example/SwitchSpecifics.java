package example;

public class SwitchSpecifics {
    public static void main(String... a) {
        System.out.println("convert string into double=" + getDoubleUsingSwitchAndNullValue(null));

    }

    //Covering All Values:
    static double getDoubleUsingSwitch(Object o) {
        return switch (o) {
            case String s -> Double.parseDouble(s);
            default -> 0d;
        };

    }

    //handling null values
    static double getDoubleUsingSwitchAndNullValue(Object o) {
        return switch (o) {
            case String s -> Double.parseDouble(s);
            case null -> 0d;
            default -> 0d;
        };

    }

    // we can use total type and default both in switch
    static double getDoubleUsingSwitchAndNullValue1(Object o) {
        return switch (o) {
            case String s -> Double.parseDouble(s);
            case Object ob -> 0d;
            //default -> 0d;
        };
    }

        // Label is dominated by a preceding case label 'CharSequence c'
        static Double orderingInSubclass(Object o) {
            return switch (o) {
                case String c -> Double.parseDouble(c);
                //case String s -> Double.parseDouble(s);
                default -> 0d;
            };
        }

}