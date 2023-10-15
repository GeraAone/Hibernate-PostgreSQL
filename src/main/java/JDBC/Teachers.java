package JDBC;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.lang.reflect.Array;
import java.util.ArrayList;

@Entity
@Table(name="teachers", schema="public")
@Data
public class Teachers
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private static String fullName;

    @Column(name = "subjects")
    private static ArrayList<String> subjects = new ArrayList<>();

    @Column(name = "classes")
    private static int classes;

    @Column(name = "students")
    private static int students;
}
