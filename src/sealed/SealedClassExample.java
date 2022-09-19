package sealed;

public class SealedClassExample {
        public static void main(String args[])
        {
            // creating instance of grandfather
            Person grandfather = new GrandFather(87, "Albert");
            grandfather.name = "Albert";
            System.out.println("The age of grandfather is: "+getAge(grandfather));
        }
           // getting the age of the Person
        public static int getAge(Person person)
        {
            //if the person is an instance of the Father class, returns the age of the father
            if (person instanceof Father father)
            {
                return (father.getFatherAge());
            }
            else if (person instanceof GrandFather grandFather)
            {
                return (grandFather.getGrandFatherAge());
            }
              //returns nothing if does not match with any of the above conditions
            return -1;
        }
    }
    //the class person can be extends by Father and GrandFather class
    abstract sealed class Person permits Father, GrandFather
    {
        String name;
        String getName()
        {
            return name;
        }
    }

    final class Father extends Person
    {
        String name;
        int age;
        //constructor of the Father class
        Father(int age, String name)
        {
            this.age = age;
            this.name = name;
        }
        int getFatherAge()
        {
            return age;
        }
    }
    //non-sealed class can be extends by unknown class
    non-sealed class GrandFather extends Person
    {
        int age;
        GrandFather(int age, String name)
        {
            this.age = age;
            this.name = name;
        }
        int getGrandFatherAge()
        {
            return age;
        }
    }

