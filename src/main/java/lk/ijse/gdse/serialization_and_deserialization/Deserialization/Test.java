package lk.ijse.gdse.serialization_and_deserialization.Deserialization;

import java.io.*;

public class Test {
    public static void main(String[] args) {
        DeserializationExplain object = new DeserializationExplain(1,"Test01");
        String filename = "file.ser";

        try {
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(object);

            out.close();
            file.close();

            System.out.println("Object has been serialized");
        } catch(IOException e) {
            e.printStackTrace();
        }

        DeserializationExplain object1 = null;


        try {
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            object1 = (DeserializationExplain)in.readObject();

            in.close();
            file.close();

            System.out.println("Object has been Deserialized ");
            System.out.println("a = " + object1.a);
            System.out.println("b = " + object1.b);
        } catch(IOException e) {
            e.printStackTrace();
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
