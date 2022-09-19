package record;

import java.util.Objects;

public final class ItemEquivalentToRecordClass {
    private final int id;
    private final String name;
    public ItemEquivalentToRecordClass(int id, String name) {
        this.id = id;
        this.name = name;
    }
   public int id() {
        return this.id;
    }
   public String name() {
        return this.name;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj instanceof ItemEquivalentToRecordClass other) {
            return Objects.equals(id, other.id) && Objects.equals(name, other.name);
        } else {
            return false;
        }
    }
    @Override
    public String toString() {
        return "Item[id=" + id + ", name=" + name + "]";
    }
}
