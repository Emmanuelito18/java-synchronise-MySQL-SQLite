package clases;

//<editor-fold defaultstate="collapsed" desc="librerias para manejar las conexiones de la base de datos">
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//</editor-fold>

/**
 *Esta clase se utiliza para manejar la conexión a la base de datos SQLite
 * @author Emmanuel
 */
public class conectarSQLite {
    String url="jdbc:sqlite:src\\baseDatos\\pruebaSQLite.db";//Establece el url de la base de datos
    Connection connect;//crea una variable de tipo Connection, se utilizará para realizar la conexión
    //<editor-fold defaultstate="collapsed" desc="conexion de la base de datos">
    /**
     * Este método se utiliza para realizar la conexión a la base de datos SQLite
     */
    public void conectarInterna(){
        try{
            connect=DriverManager.getConnection(url);
            if(connect!=null){
                System.out.println("Estoy conectado a la base de datos");
            }
        }catch(SQLException error){
            error.printStackTrace();
        }
    }
    //</editor-fold>
}
