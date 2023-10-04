package JDBC;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.lang.reflect.Array;
import java.util.ArrayList;

@Entity
@Table(name="teachers", schema="public")
@Getter
@Setter
public class Teachers
{
    @Id
    private static String fullName;
    private static ArrayList<String> subjects = new ArrayList<>();
    private static int classes;
    private static int students;
}
