package record;
record Rectangle(int length, int width) {
    record BigRectangle(int num) {
        public BigRectangle {
            num = num * 2;
        }
    }
    public Rectangle createBigRectangle(int num) {
        BigRectangle b = new BigRectangle(num);
        int l = length + b.num();
        int w = width + b.num();
        return new Rectangle(l, w);
    }
}
public class NestedRecordExample {
        public static void main(String[] args) {
            Rectangle r = new Rectangle(10, 5);
            Rectangle br = r.createBigRectangle(3);
            System.out.println(br);
        }
}
