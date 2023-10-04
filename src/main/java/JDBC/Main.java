package JDBC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws SQLException
    {
        String sql = null;
        String dayOfWeek = null;
        String classes = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)))
        {
            dayOfWeek = reader.readLine().trim().toLowerCase();
            classes = reader.readLine().trim().toLowerCase();
            sql = reader.readLine();
        }
        /* SQL query #1: For selecting teachers with inputted day and class
        sql = "Select fullName from
        (select fullName, unnest(subjects) as subj from teachers) left join subjects on
        subjects.name = subj
        left join (select name, unnest(classrooms) as klass from subjects)
        on subjects.name = subj
        where subj = 'maths' and dayOfWeek = '" + dayOfWeek + "' and klass = + "classes""
         */
        /* SQL query #2: Total classes per day
        Select dayOfWeek, sum(classes) as totalClasses
        from
	        (select classes, unnest(subjects) as subj from teachers)
	        left join subjects on subjects.name = subj
        Group by dayOfWeek
        */
        catch(IOException ex){
            ex.printStackTrace();
        }
        SQLstatement.statement(sql);
    }
}