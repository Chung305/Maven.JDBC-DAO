package daos;

import com.mysql.cj.jdbc.Driver;
import models.Car;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class ConnectionFactory {
    public static final String URL = "jdbc:postgresql://localhost:5432/cars";
    public static final String USER = "chung";
    public static final String PASS = "chung";


    public static Connection getConnection(){
        try{
            DriverManager.registerDriver(new Driver());
            return DriverManager.getConnection(URL, USER, PASS);
        }catch(SQLException e){
            throw new RuntimeException("Error Connecting to the database", e);
        }
    }

    public static void main(String[] arg){
        DataAccessor dao = new DataAccessor();
        System.out.println("starting");

        try{
            List<Car> cars = dao.findAll();
            for(Car each : cars){
                System.out.println(each.toString() + "nothing");
            }

        }catch(SQLException e){
            e.printStackTrace();
            System.out.println("not working");
        }
    }

}
