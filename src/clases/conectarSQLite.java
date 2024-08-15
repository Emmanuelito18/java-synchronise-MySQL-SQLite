package clases;

//<editor-fold defaultstate="collapsed" desc="librerias para manejar las conexiones de la base de datos SQLite">
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//</editor-fold>
import javax.swing.table.DefaultTableModel;//Se utiliza para mostrar la información de la base de datos en la tabla

/**
 *Esta clase se utiliza para manejar la conexión y operaciones de la
 * base de datos SQLite
 * @author Emmanuel
 */
public class conectarSQLite {
    private String url="jdbc:sqlite:src\\baseDatos\\pruebaSQLite.db";//Establece el url de la base de datos
    Connection conexion;//crea una variable de tipo Connection, se utilizará para realizar la conexión
    //<editor-fold defaultstate="collapsed" desc="conexion de la base de datos">
    /**
     * Este método se utiliza para realizar la conexión a la base de datos SQLite
     */
    public void conectar(){
        try{
            conexion=DriverManager.getConnection(url);
            if(conexion!=null){
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
            conexion.close();//cierra la conexión a la base de datos
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
            PreparedStatement insertar=conexion.prepareStatement("INSERT INTO juegos(nombreJuego,plataforma,fechaActualizado) VALUES(?,?,NULL)");
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
     * @return Devuelve un <code>DefaultTableModel</code> con la información de los registros de la base de datos. Se utiliza para meter los datos a una tabla
     */
    public DefaultTableModel seleccionar(){
        String columnas[]={"ID","Juego","Plataforma","Creado","Actualizado"};//Se utiliza para los identificadores de columnas
        DefaultTableModel modelo=new DefaultTableModel();
        modelo.setColumnCount(5);//Establece la cantidad de columnas 
        modelo.setColumnIdentifiers(columnas);//Especifica los identificadores de las columnas
        try{
            Object[] registro=new Object[5];
            PreparedStatement seleccionar=conexion.prepareStatement("SELECT * FROM juegos");
            ResultSet resultado=seleccionar.executeQuery();//Ejecuta la sentencia para mostrar la información de la base de datos
            while(resultado.next()){//Mientras haya registros
                //<editor-fold defaultstate="collapsed" desc="Código de depuración">
                /*System.out.print("ID: "+resultado.getInt(1)+" ");
                System.out.print("Nombre del juego: "+resultado.getString(2)+" ");
                System.out.print("Plataforma: "+resultado.getString(3)+" ");
                System.out.print("Fecha de creación: "+resultado.getString(4)+" ");
                System.out.println("Fecha de actualización: "+resultado.getString(5));*/
                //</editor-fold>
                registro[0]=resultado.getInt(1);
                registro[1]=resultado.getString(2);
                registro[2]=resultado.getString(3);
                registro[3]=resultado.getString(4);
                registro[4]=resultado.getString(5);
                modelo.addRow(registro);
            }
        }catch(SQLException error){
            error.printStackTrace();
        }
        return modelo;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Elimina información de la base de datos">
    /**
     * Este método se utiliza para eliminar registros de la base de datos SQLite,
     * la información la elimina de la tabla juegos según el id del registro
     * @param id este parámetro se utliza para eliminar registros en la base de datos
     */
    public void eliminar(int id){
        try{
            PreparedStatement eliminar=conexion.prepareStatement("DELETE FROM juegos WHERE id=?");
            eliminar.setInt(1, id);//Recibe el id del registro a eliminar de tabla de la base de datos SQLite
            eliminar.executeUpdate();//Ejecuta la eliminación del registro en la base de datos SQLite
        }catch(SQLException error){
            error.printStackTrace();
        }
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Actualiza información en las base de datos">
    /**
     * Este método se utiliza para realizar actualizaciones de registros en la base de datos SQLite
     * en la tabla juegos
     * @param nombreJuego Este parámetro se utiliza para llenar el campo de nombreJuego
     * @param plataforma Este parámetro se utilza para llenar el campo de la plataforma
     * @param id Este parámetro se utiliza para buscar el registro a actualizar
     */
    public void actualizar(String nombreJuego, String plataforma, int id){
        try{
            PreparedStatement actualizar=conexion.prepareStatement("UPDATE juegos SET nombre=?,plataforma=?,fechaActualizado=datetime('now','localtime') WHERE id=?");
            actualizar.setString(1, nombreJuego);//Hace la actualización del nombre del juego
            actualizar.setString(2, plataforma);//Hace la actualización de la plataforma 
            actualizar.setInt(3, id);//Hace la búsqueda del número 
            actualizar.executeUpdate();//Hace la actualización de registros en la base de datos
        }catch(SQLException error){
            error.printStackTrace();
        }
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Verifica si la base de datos está vacía">
    /**
     * Este método se utiliza para saber si la base de datos está vacía o no,
     * se utilza para hacer la sincronización de las bases de datos
     * @return <code>estado</code> devuelve <code>true</code> sí la base de datos está vacía o <code>flase</code> sí la base de datos está llena
     */
    public boolean estaVacio(){
        boolean estado=false;//Se utilza para saber el estado de la base de datos 
        try{
            PreparedStatement vacio=conexion.prepareStatement("SELECT COUNT(*) AS cantidadRegistros FROM juegos");//ejecuta una consulta para obtener la cantidad de registros de la tabla
            ResultSet resultado=vacio.executeQuery();//Ejecuta la petición a la base de datos
            resultado.next();//
            int cantidad=resultado.getInt("cantidadRegistros");//Asigna el numero de registros en la tabla a cuenta
            if(cantidad==0){//Sí la base de datos está vacía
                estado=true;
            }else{//Sí la base de datos no está vacía
                estado=false;
            }
        }catch(SQLException error){
            error.printStackTrace();
        }
        return estado;//Regresa el valor del estado de la base de datos
    }
    //</editor-fold>
    
    //</editor-fold>
        
    /*public static void main(String[] args){
        conectarSQLite conexion=new conectarSQLite();
        conexion.conectar();
        conexion.desconectar();
    }*/
}
