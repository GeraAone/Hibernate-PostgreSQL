package JDBC;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="subjects", schema="public")
@Getter
@Setter
public class Subjects
{
    @Id
    private static String name;
    private static String dayOfWeek;
    private static int[] classrooms;

}
