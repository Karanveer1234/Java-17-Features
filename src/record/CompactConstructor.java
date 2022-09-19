package record;

record Item1 (int id, String name) {
    public Item1 {
        if (id < 100 || name.isEmpty()) {
            throw new IllegalArgumentException("Invalid data");
        }
    }
}
public class CompactConstructor {
    public static void main(String[] args) {
        Item1 item1 = new Item1(101, "Item1");
        System.out.println(item1);
        Item1 item2 = new Item1(50, "Item2");
        System.out.println(item2);
    }
}
