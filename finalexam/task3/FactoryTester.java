package finalexam.task3;

import java.io.IOException;

public class FactoryTester {
    public static void main(String[] args) {
        PaperFactory factory = new PaperFactory();

        Person person1 = new Person("John", "Doe", "12345");
        Person person2 = new Person("Jane", "Smith", "67890");

        factory.addPerson(person1);
        factory.addPerson(person2);

        System.out.println("Staff after adding:");
        factory.getStaff().forEach(System.out::println);

        try {
            factory.saveStaffToFile("staff.dat");
            factory.getStaff().clear();
            System.out.println("Staff after clearing:");
            factory.getStaff().forEach(System.out::println);

            factory.loadStaffFromFile("staff.dat");
            System.out.println("Staff after loading from file:");
            factory.getStaff().forEach(System.out::println);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        factory.deletePerson(person1);

        System.out.println("Staff after deleting John Doe:");
        factory.getStaff().forEach(System.out::println);
    }
}
