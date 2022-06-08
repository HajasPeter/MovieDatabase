package pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Director {
    private String firstName;
    private String lastName;
    private String nationality;
    private LocalDate dateOfBirth;
}
