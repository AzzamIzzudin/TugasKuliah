
package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {
    
    private Connection con;
    
    public Connection connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("berhasil terkoneksi");
        }catch(ClassNotFoundException e){
            System.out.println("gagal terkoneksi" + e);
        }
        
        String url = "jdbc:mysql://localhost/user";
        try{
            con = DriverManager.getConnection(url,"root","");
            System.out.println("Berhasil Terkoneksi");
        }catch(SQLException ex){
            System.out.println("Gagal Terkoneksi" + ex);
        }
        return con;
    }
}


