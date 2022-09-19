package record;
record Item(int id, String name) { }
public class ItemRecordClass {
    public static void main(String[] args) {
        Item item = new Item(10, "Item1");
        System.out.println(item.id() +", " + item.name());
    }
}
