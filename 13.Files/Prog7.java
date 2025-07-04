import java.io.*;
import java.util.*;

class Person implements Serializable {
    int code;
    String name;
    String course;

    public Person(int code, String name, String course) {
        this.code = code;
        this.name = name;
        this.course = course;
    }

    public void display() {
        System.out.println("Code: " + code + ", Name: " + name + ", Course: " + course);
    }
}

public class Prog7 {

    public static void writePersonsToFile(String filename, List<Person> persons) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(persons);
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Person> readPersonsFromFile(String filename) {
        List<Person> persons = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            persons = (List<Person>) ois.readObject();
            System.out.println("Data read from file successfully.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return persons;
    }

    public static void main(String[] args) {
        String filename = "persons.dat";

        List<Person> personsToWrite = new ArrayList<>();
        personsToWrite.add(new Person(1, "Ram", "Java"));
        personsToWrite.add(new Person(2, "Kishore", "Python"));
        personsToWrite.add(new Person(3, "Rajesh", "React"));
        writePersonsToFile(filename, personsToWrite);
        List<Person> personsRead = readPersonsFromFile(filename);
        System.out.println("Reading persons from file:");
        for (Person p : personsRead) {
            p.display();
        }
    }
}
