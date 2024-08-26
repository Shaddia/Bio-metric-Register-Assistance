package BD;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author ING JARC
 */
public class ConexionBD {
         public Connection conexion;
    public Statement sentencia; 
    public ResultSet resultado;

public  String puerto="3306";
public  String nomservidor="localhost";
public  String db="huellas";
public  String user="root";
public  String pass="";
Connection conn=null;

public Connection conectar(){
    try{
    String ruta="jdbc:mysql://";
    String servidor=nomservidor+":"+puerto+"/";
    Class.forName("com.mysql.jdbc.Driver");
    conn = DriverManager.getConnection(ruta+servidor+db,user,pass);

    if (conn!=null){
    System.out.println("Conexión a base de datos exitosa");
    }
    else if (conn==null)
    {
    throw new SQLException();
    }
    }catch(SQLException e){
        JOptionPane.showMessageDialog(null, e.getMessage());
    } catch (ClassNotFoundException e) {
        JOptionPane.showMessageDialog(null, "Se produjo el siguiente error: "+e.getMessage());
    }catch (NullPointerException e){
        JOptionPane.showMessageDialog(null, "Se produjo el siguiente error: "+e.getMessage());
    }finally{
    return conn;
    }
}
public void desconectar(){
    conn = null;
    System.out.println("Desconexion a base de datos");
}

    public PreparedStatement prepareStatement(String string) {
        return null;
    }


}
