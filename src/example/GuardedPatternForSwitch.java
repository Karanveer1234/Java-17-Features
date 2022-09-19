package example;

public class GuardedPatternForSwitch {
    public static void main(String ...a){
        System.out.println("convert string into double="+getDoubleUsingSwitch("1")) ;
        System.out.println("convert string into double="+getDoubleValueUsingGuardedPatterns("1")) ;
    }
    static double getDoubleUsingSwitch(Object o) {
        return switch (o) {
                case String s -> {
                if (s.length() > 0) {
                    yield Double.parseDouble(s);
                } else {
                    yield 0d;
                }
            } default -> 0d; };

    }

    //type GuardedPatterns example
    static double getDoubleValueUsingGuardedPatterns(Object o) {
        return switch (o) {
            case String s && s.length()>0 -> Double.parseDouble(s);
            default -> 0d;
        };
    }
}
