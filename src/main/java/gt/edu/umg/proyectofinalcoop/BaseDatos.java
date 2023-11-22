// Programador: Francisco Javier Cifuentes Cajas Id: 2590-20-10308.
package gt.edu.umg.proyectofinalcoop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class BaseDatos {
    
private Connection conexion;
    
    
    public BaseDatos() {
        try {
            //se obtiene el driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            String bd="pfcoop";
            String url="jdbc:mysql://localhost:3306/"+bd+"?serverTimezone=UTC";
            String user="root";
            String password="root";
            conexion=DriverManager.getConnection(url, user, password);
            System.out.println("conexion exitosa");
        }
        catch (ClassNotFoundException ex){
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException ex){
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    
    public Connection getConexion(){
        return conexion;
    }











}
