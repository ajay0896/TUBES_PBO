/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package velora;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author X1 Carbon Gen 8
 */
public class Koneksi {

    public static Connection com;

    public static Connection konfigDB() throws SQLException {
        try {
            String url = "jdbc:mysql://localhost/velora";
            String user = "root";
            String pass = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            com = DriverManager.getConnection(url, user, pass);
            // JOptionPane.showMessageDialog(null, "Koneksi Berhasil");
            System.out.println("koneksi berhasil;");

        } catch (Exception e) {
            //  JOptionPane.showMessageDialog(null, "Koneksi gagal");
            System.err.println("koneksi gagal" + e.getMessage());
        }
        return com;
    }


}
