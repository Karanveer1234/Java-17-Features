package record;

import java.util.Objects;

public final class Person {
    private final String name;
    private final String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(address, person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static void main(String a[]){
        Person p1 = new Person("karan","flat 209 , Soundraya Tower");
        Person p2 = new Person("karan","flat 209 , Soundraya Tower");

        System.out.println(p1.equals(p2));
        System.out.println(p1.toString());

    }
}
