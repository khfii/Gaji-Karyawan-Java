package GajiKaryawan;
import java.sql.*; 

/**
 *
 * @author Kahfi
 */
public class koneksi {
    
      private static java.sql.Connection koneksi; 
    
    public static java.sql.Connection getKoneksi(){
        if(koneksi==null){
            try {
                String url = "jdbc:mysql://localhost:3306/datapegawai"; 
                String user = "root"; 
                String password = ""; 
                
                
                DriverManager.registerDriver(new com.mysql.jdbc.Driver()); 
                
                
                koneksi = DriverManager.getConnection(url, user, password); 
            } catch (Exception e) {
                System.out.println("Koneksi Error");
            }
        }
        return koneksi; 
    }
    
    public static void main(String[] args) {
        getKoneksi(); 
    }
    
}
