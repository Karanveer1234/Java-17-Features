package record;
record EmployeeRecord(Long id,
                      String firstName,
                      String lastName,
                      String email,
                      int age) {

    // Public accessor method
    public String firstName() {
        System.out.println("Length is " + firstName);
        return firstName;
    }
}
public class RecordExample {
    public static void main(String[] args) {
        EmployeeRecord e1 = new EmployeeRecord
                (1l, "Karanveer", "Singh", "karanveerthakur057@gmail.com", 38);
        System.out.println(e1.id());
        System.out.println(e1.email());
        System.out.println(e1.firstName());
        System.out.println(e1);

        EmployeeWithOwnConstructors e2 = new EmployeeWithOwnConstructors(1001, "Derok", "Dranf");

        // auto generated getter methods
        System.out.println(e2.id() + " " + e2.firstName()
                + " " + e2.lastName());

        // Auto-generated toString() method
        System.out.println(e2.toString());

        // Creating object with parameterized constructor
        EmployeeWithOwnConstructors e3 = new EmployeeWithOwnConstructors(1002, "Seren");

        // Using instance methods
        e2.getFullName();

        // Using static methods
        System.out.println("Employee " + e3.id()
                + " Token = "
                + e3.generateEmployeeToken());

        // Using the equals() method
        System.out.print("Is e1 equal to e2: "
                + e2.equals(e3));

    }
}