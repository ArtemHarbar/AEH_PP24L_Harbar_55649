package pl.pp;

class MojaSiodmaAplikacja {
    public static void main(String[] args) {
        Person person1 = new Person(); // Creating an object with default parameters
        person1.hiToAll(); // Displaying default values

        person1.forename = "Mateusz";
        person1.surname = "Karmazyn";
        person1.age = 24;
        person1.hiToAll(); // Displaying updated values

        // Creating another object using constructor with parameters
        Person person2 = new Person("Dariusz", "Walendziak", 42);
        person2.hiToAll();

        // Using growOld method
        person1.growOld();
        for(int i=0; i<3; i++) {
            person2.growOld();
        }

        // Displaying final ages
        person1.hiToAll();
        person2.hiToAll();

        // Using setName method
        System.out.println(person1.getName());
        person1.setName("Lolo");
        System.out.println(person1.getName());
        person1.hiToAll();
    }

    public static class Person {
        // Fields
        public String forename;
        public String surname;
        public int age;

        // Constructor
        public Person() {
            // Default constructor
        }

        // Constructor with parameters
        public Person(String forename, String surname, int age) {
            this.forename = forename;
            this.surname = surname;
            this.age = age;
        }

        // Method to increase age by 1
        public void growOld() {
            age++;
        }

        // Getter and setter methods for name
        public String getName() {
            return forename;
        }

        public void setName(String forename) {
            this.forename = forename;
        }

        // Method to display information about the person
        public void hiToAll() {
            System.out.println("Forename: " + forename);
            System.out.println("Surname: " + surname);
            System.out.println("Age: " + age);
            System.out.println();
        }
    }
}
