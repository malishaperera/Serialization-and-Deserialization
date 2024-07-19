package lk.ijse.gdse.serialization_and_deserialization.serialization;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student implements Serializable {
        private String name;
        private int age;
        private String email;
        private String city;
}
