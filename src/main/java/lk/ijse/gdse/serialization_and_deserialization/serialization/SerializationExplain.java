package lk.ijse.gdse.serialization_and_deserialization.serialization;

import java.io.*;

public class SerializationExplain {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student = new Student("Malisha", 22,"malisha01@gmail.com","Galle");

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(student);
        byte[] serializedData = baos.toByteArray();

        ByteArrayInputStream basis
                = new ByteArrayInputStream(serializedData);
        ObjectInputStream ois = new ObjectInputStream(basis);
        Student deserializedStudent = (Student) ois.readObject();

        System.out.println("Deserialized Person: " + "Name:" + deserializedStudent.getName()  + ", " +"Age:" + deserializedStudent.getAge() +", " +"Email:" + deserializedStudent.getEmail() + ", " +"City:" + deserializedStudent.getCity());
    }
}
