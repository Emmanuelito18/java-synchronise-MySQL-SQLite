package clases;

//<editor-fold defaultstate="collapsed" desc="Librerias para la base de datos MySQL">
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//</editor-fold>

/**
 *Esta clase se utiliza para manejar la conexión y operaciones de la 
 * base de datos MySQL
 * @author Emmanuel
 */
public class conectarMySQL {
    private String url="jdbc:mysql://localhost:3306/pruebamysql?serverTimezone=UTC";
    private String user="root";
    private String password="";
    Connection conexion=null;//Se utilizará para gestionar la apertura y cierre de la conexión a la base de datos
    //<editor-fold defaultstate="collapsed" desc="Conexión de la base de datos">
    public void conectar(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");//Obtiene el conector para la conexión a la base de datos
            conexion=DriverManager.getConnection(url, user, password);//realiza la conexión a la base de datos
            System.out.println("Conexión exitosa");
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Error en la conexión: "+e);
        }
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Cierra la conexión a la base de datos">
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Acciones de la base de dato">
    
    //<editor-fold defaultstate="collapsed" desc="Mete información a la base de datos">
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Muesta información de la base de datos">
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Elimina infomarción de la base de datos">
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Actualiza información de la base de datos">
    
    //</editor-fold>
    
    //</editor-fold>
    
    public static void main(String[] args){
        conectarMySQL datos=new conectarMySQL();
        datos.conectar();
    }
}
