package JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLstatement
{
    public static void statement(String sql) throws SQLException
    {
        Connection connection = PostgresConnection.connection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while(resultSet.next())
        {
            if(sql.contains("teachers"))
                System.out.println(resultSet.getString("fullname") + " " + resultSet.getArray("subjects") +
                        " " + resultSet.getInt("classes") + " " + resultSet.getInt("students"));
        }
        if(connection != null){
            try{
                connection.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
