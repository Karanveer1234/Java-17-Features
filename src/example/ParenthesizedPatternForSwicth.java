package example;

public class ParenthesizedPatternForSwicth {

    public static void main(String ...a){
        System.out.println("convert string into double="+getDoubleValueUsingParenthesizedPatterns("1")) ;

    }

    static double getDoubleValueUsingParenthesizedPatterns(Object o) {
        return switch (o) {
            case String s && s.length() > 0 && !(s.contains("#") || s.contains("@")) -> Double.parseDouble(s);
            default -> 0d;
        };
    }

}
