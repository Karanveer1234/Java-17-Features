package record;

public record EmployeeWithOwnConstructors(int id, String firstName,
                                          String lastName) {
    // Instance fields need to be present in the record's
    // parameters but record can define static fields.
    static int empToken;

    /*// Constructor 1 of this class
    // Compact Constructor
    public EmployeeWithOwnConstructors
    {
        if (id < 100) {
            throw new IllegalArgumentException(
                    "Employee Id cannot be below 100.");
        }
        if (firstName.length() < 2) {
            throw new IllegalArgumentException(
                    "First name must be 2 characters or more.");
        }
    }*/

    // Constructor 2 of this class
    // Alternative Constructor
    public EmployeeWithOwnConstructors(int id, String firstName)
    {
       this(id, firstName, null);

    }

    // Instance methods
    public void getFullName()
    {
        if (lastName == null)
            System.out.println(firstName());

        else
            System.out.println(firstName() + " "
                    + lastName());
    }

    // Static methods
    public static int generateEmployeeToken()
    {
        return ++empToken;
    }
}

/*
public final class EmployeeWithOwnConstructors extends java.lang.Record {
    private final int id;
    private final java.lang.String firstName;
    private final java.lang.String lastName;
    static int empToken;

    public Employee(int id, java.lang.String firstName, java.lang.String lastName) { */
/* compiled code *//*
 }

    public Employee(int id, java.lang.String firstName) { */
/* compiled code *//*
 }

    public void getFullName() { */
/* compiled code *//*
 }

    public static int generateEmployeeToken() { */
/* compiled code *//*
 }

    public int id() { */
/* compiled code *//*
 }

    public java.lang.String firstName() { */
/* compiled code *//*
 }

    public java.lang.String lastName() { */
/* compiled code *//*
 }

    public java.lang.String toString() { */
/* compiled code *//*
 }

    public final int hashCode() { */
/* compiled code *//*
 }

    public final boolean equals(java.lang.Object o) { */
/* compiled code *//*
 }
}*/
