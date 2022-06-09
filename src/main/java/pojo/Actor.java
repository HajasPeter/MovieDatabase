package pojo;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Actors")
public class Actor {
    @Id
    @Column(name = "Id")
    @GeneratedValue
    private int id;

    @Column(name = "FirstName")
    private String firstName;

    @Column(name = "LastName")
    private String lastName;

    @Column(name = "Nationality")
    private String nationality;

    @Column(name = "DayOfBirth")
    private LocalDate dateOfBirth;
}
