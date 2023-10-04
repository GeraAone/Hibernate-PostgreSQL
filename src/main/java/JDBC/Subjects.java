package JDBC;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="subjects", schema="public")
@Getter
@Setter
public class Subjects
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private static String name;
    @Column(name = "dayOfWeek")
    private static String dayOfWeek;
    @Column(name = "classrooms")
    private static int[] classrooms;

}
