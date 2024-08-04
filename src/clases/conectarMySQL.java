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
    /**
     * Este método se utilza para conectarse a la base de datos MySQL.
     * Este método no recibe argumentos
     */
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
    /**
     * Este método se utilza para desconectarse de la base de datos MySQL.
     * Este método no recibe argumentos
     */
    public void desconectar(){
        try{
            conexion.close();//Cierra la conexión a la base de datos
            System.out.println("Desconexión exitosa");
        }catch(SQLException e){
            System.out.println("Error al desconectar: "+e);
        }
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Acciones de la base de dato">
    
    //<editor-fold defaultstate="collapsed" desc="Mete información a la base de datos">
    /**
     * Este método se utilza para meter información a la base de datos MySQL.
     * @param nombreJuego se utiliza para determinar el nombre del juego
     * @param plataforma se utilza para determinar la plataforma del juego
     */
    public void insertar(String nombreJuego,String plataforma){
        try{
            PreparedStatement insertar=conexion.prepareStatement("INSERT INTO juegos (nombreJuegos,plataforma) VALUES (?,?)");
            insertar.setString(1, nombreJuego);
            insertar.setString(2, plataforma);
            insertar.executeUpdate();
        }catch(SQLException error){
            System.out.println("Error al meter información a la base de datos: "+error);
        }
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Muesta información de la base de datos">
    /**
     * Este método se utiliza para mostrar la información de la base de datos MySQL de la tabla juegos
     * Este método no recibe argumentos
     */
    public void seleccionar(){
        try{
            PreparedStatement seleccionar=conexion.prepareStatement("SELECT * FROM juegos");
            ResultSet resultado=seleccionar.executeQuery();//Ejecuta la petición a la base de datos MySQL
            while (resultado.next()) {//Mientras haya registros
                System.out.print("ID: "+resultado.getInt(1)+" ");
                System.out.print("juego: "+resultado.getString(2)+" ");
                System.out.println("plataforma: "+resultado.getString(3));
            }
        }catch(SQLException error){
            System.out.println("Error al hacer la inserción: "+error);
        }
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Elimina infomarción de la base de datos">
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Actualiza información de la base de datos">
    
    //</editor-fold>
    
    //</editor-fold>
    
    /*public static void main(String[] args){
        conectarMySQL datos=new conectarMySQL();
        datos.conectar();
        datos.desconectar();
    }*/
}
