package lk.ijse.gdse.serialization_and_deserialization.serialization;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {
        private String name;
        private int age;
        private String email;
        private String city;
}
