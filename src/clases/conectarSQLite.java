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
    public void conectar(){
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
    
    //<editor-fold defaultstate="collapsed" desc="Cierra la conexion de la base de datos">
    /**
     * Este método se utiliza para cerrar la conexión a la base de datos SQLite
     */
    public void desconectar(){
        try{
            connect.close();//cierra la conexión a la base de datos
            System.out.println("se ha cerrado la conexion exitosamente");
        }catch(SQLException error){
            error.printStackTrace();
        }
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Acciones de la base de datos">
    
    //<editor-fold defaultstate="collapsed" desc="Mete información en la base de datos">
    /**
     * Este método se utliza para meter información en la base de datos SQLite
     * la información la mete en la tabla juegos
     * @param nombreJuego este parámetro se utiliza para ser introducido como valor en la base de datos
     * @param plataforma este parámetro se utiliza para ser introducido como valor en la base de datos
     */
    public void insertar(String nombreJuego, String plataforma){
        try{
            PreparedStatement insertar=connect.prepareStatement("INSERT INTO juegos COLUMS(nombreJuego,plataforma) VALUES(?,?)");
            insertar.setString(1, nombreJuego);//Hace la inserción del nombre del juego en la base de datos
            insertar.setString(2, plataforma);//Hace la inserción de la plataforma en la base de datos
            insertar.executeUpdate();//Hace la inserción del registro en la base de datos
        }catch(SQLException error){
            error.printStackTrace();
        }
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Muestra información de la base de datos">
    /**
     * Este método se utiliza para mostrar la información que hay en la base de datos SQLite de la tabla juegos
     * Este método no recibe parámetros
     */
    public void seleccionar(){
        try{
            PreparedStatement seleccionar=connect.prepareStatement("SELECT * FROM juegos");
            ResultSet resultado=seleccionar.executeQuery();
            while(resultado.next()){
                System.out.println("ID: "+resultado.getInt("id"));
                System.out.println("Nombre del juego: "+resultado.getString("nombre"));
                System.out.println("Plataforma: "+resultado.getString("plataforma"));
            }
        }catch(SQLException error){
            error.printStackTrace();
        }
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Elimina información de la base de datos">
    /**
     * Este método se utiliza para eliminar registros de la base de datos SQLite,
     * la información la elimina de la tabla juegos según el id del registro
     * @param id este parámetro es el número del registro que se utiliza como identificación
     */
    public void eliminar(int id){
        try{
            PreparedStatement eliminar=connect.prepareStatement("DELETE FROM juegos WHERE id=?");
            eliminar.setInt(1, id);//Recibe el id del registro a eliminar de tabla de la base de datos SQLite
            eliminar.executeUpdate();//Ejecuta la eliminación del registro en la base de datos SQLite
        }catch(SQLException error){
            error.printStackTrace();
        }
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Actualiza información en las base de datos">
    public void actualizar(String nombreJuego, String plataforma, int id){
        try{
            PreparedStatement actualizar=connect.prepareStatement("UPDATE juegos SET nombre=?,plataforma=? WHERE id=?");
            actualizar.setString(1, nombreJuego);
            actualizar.setString(2, plataforma);
            actualizar.setInt(3, id);
            actualizar.executeUpdate();
        }catch(SQLException error){
            error.printStackTrace();
        }
    }
    //</editor-fold>
    
    //</editor-fold>
        
    /*public static void main(String[] args){
        conectarSQLite conexion=new conectarSQLite();
        conexion.conectar();
        conexion.desconectar();
    }*/
}
