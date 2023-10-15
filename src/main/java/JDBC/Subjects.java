package JDBC;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="subjects", schema="public")
@Data
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
