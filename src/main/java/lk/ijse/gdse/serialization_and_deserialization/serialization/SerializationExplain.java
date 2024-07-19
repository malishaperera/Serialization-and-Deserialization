package lk.ijse.gdse.serialization_and_deserialization.serialization;

import java.io.*;

public class SerializationExplain {
    public static void main(String[] args) {
        Student student = new Student("Malisha", 22);

        // Serialization
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
            oos.writeObject(student);
            System.out.println("Serialization complete: " + student);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"))) {
            Student deserializedPerson = (Student) ois.readObject();
            System.out.println("Deserialization complete: " + deserializedPerson);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
