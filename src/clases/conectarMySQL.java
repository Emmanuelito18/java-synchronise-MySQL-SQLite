package clases;

//<editor-fold defaultstate="collapsed" desc="Librerias para la base de datos MySQL">
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//</editor-fold>
import javax.swing.table.DefaultTableModel;//Se utiliza para mostrar la información de la base de datos en la tabla

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
            PreparedStatement insertar=conexion.prepareStatement("INSERT INTO juegos (nombreJuego,plataforma,fechaActualizado) VALUES (?,?,NULL)");
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
     * @return Devuelve un <code>DefaultTableModel</code> con la información de los registros de la base de datos. Se utiliza para meter los datos a una tabla
     */    
    public DefaultTableModel seleccionar(){
        String columnas[]={"ID","Juego","Plataforma","Creado","Actualizado"};//Se utiliza para los identificadores de columnas
        DefaultTableModel modelo=new DefaultTableModel();
        modelo.setColumnCount(5);//Establece la cantidad de columnas 
        modelo.setColumnIdentifiers(columnas);//Especifica los identificadores de las columnas
        try{
            Object[] juego=new Object[5];
            PreparedStatement seleccionar=conexion.prepareStatement("SELECT * FROM juegos");
            ResultSet resultado=seleccionar.executeQuery();//Ejecuta la petición a la base de datos MySQL
            while (resultado.next()) {//Mientras haya registros
                //<editor-fold defaultstate="collapsed" desc="Código de depuración">
                /*System.out.print("ID: "+resultado.getInt(1)+" ");
                System.out.print("juego: "+resultado.getString(2)+" ");
                System.out.print("plataforma: "+resultado.getString(3)+" ");
                System.out.print("Fecha de creación: "+resultado.getTimestamp(4)+" ");
                System.out.println("Fecha de actualización: "+resultado.getTimestamp(5));*/
                //</editor-fold>
                juego[0]=resultado.getInt(1);
                juego[1]=resultado.getString(2);
                juego[2]=resultado.getString(3);
                juego[3]=resultado.getTimestamp(4);
                juego[4]=resultado.getTimestamp(5);
                modelo.addRow(juego);
            }
        }catch(SQLException error){
            System.out.println("Error al hacer la inserción: "+error);
        }
        return modelo;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Elimina infomarción de la base de datos">
    /**
     * Este método se utiliza para eliminar registros de la base de datos MySQL,
     * la información la elimina de la tabla juegos según el id del registro
     * @param id este argumento se utiliza para determinar el id del registro a eliminar
     */
    public void eliminar(int id){
        try{
            PreparedStatement eliminar=conexion.prepareStatement("DELETE FROM juegos WHERE id=?");
            eliminar.setInt(1, id);//Recibe el id del registro a eliminar de la base de datos MySQL
            eliminar.executeUpdate();//Ejecuta la eliminación de registros de la base de datos MySQL
        }catch(SQLException error){
            System.out.println("Error al eliminar el registro de la base de datos MySQL: "+error);
        }
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Actualiza información de la base de datos">
    /**
     * Este método se utilza para actualizar registros en la base de datos MySQL
     * en la tabla juegos
     * @param nombreJuego Este parámetro se utilza para reemplazar el nombre existente del juego
     * @param plataforma Este parámetro se utilza para reemplazar la plataforma existene del juego
     * @param id Este parámetro se utilza para buscar el registro a actualizar
     */
    public void actualizar(String nombreJuego,String plataforma, int id){
        try{
            PreparedStatement actualizar=conexion.prepareStatement("UPDATE juegos SET nombreJuego=?, plataforma=?,fechaActualizado=CURRENT_TIMESTAMP WHERE id=?");
            actualizar.setString(1, nombreJuego);//Establece el nombre del juego
            actualizar.setString(2, plataforma);//Establece la plataforma
            actualizar.setInt(3, id);//Hace la busqueda del registro utilizando el id
            actualizar.executeUpdate();//Hace la actualización del registro en la base de datos
        }catch(SQLException error){
            System.out.println("Error al actualizar el registro: "+error);
        }
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Verifica si la base de datos está vacía">
    /**
     * Este método se utilza para saber si la base de datos está vacía o no,
     * se utiliza para hacer la sincronización de las bases de datos
     * @return <code>estado</code> devuelve <code>true</code> sí la base de datos está vacía o <code>flase</code> sí la base de datos está llena
     */
    public boolean estaVacio(){
        boolean estado=false;//Se utiliza para saber el estado de la base de datos
        try{
            PreparedStatement vacio=conexion.prepareStatement("SELECT COUNT(*) AS cantidadRegistros FROM juegos");//ejecuta una consulta para obtener la cantidad de registros de la tabla
            ResultSet resultado=vacio.executeQuery();//Ejecuta la petición a la base de datos
            resultado.next();//Mientras haya registros
            int cantidad=resultado.getInt("cantidadRegistros");//Asigna el numero de registros en la tabla a cuenta
            if(cantidad==0){//Si la base de datos está vacía
                estado=true;
            }else{//Si la base de datos no está vacía
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
        conectarMySQL datos=new conectarMySQL();
        datos.conectar();
        datos.desconectar();
    }*/
}
