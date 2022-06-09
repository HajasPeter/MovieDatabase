package pojo;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@NoArgsConstructor
@Entity
public class Movie {
    @Id
    @Column(name = "Id")
    @GeneratedValue
    private int id;

    @Column
    private String title;

    @Column
    private int duration;   // in minutes

    @Transient
    private ArrayList<Genres> genres;

    @Transient
    private ArrayList<Actor> actors;

    @Transient
    private ArrayList<Director> directors;
}
