/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbsensiMahasiswa;

import Connection.ConnectionManager;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Asus
 */
public class EMahasiswa {
    
    public String AbsensiMhs(Mahasiswa mhs){
        String query ="INSERT INTO absensi(NRP,id_jadwal,waktu_masuk,status)"
                +"value(?,?,?,?)";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.Logon();
        String Respon;
        try {
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setString(1, mhs.getNrp());
            pstm.setString(2, mhs.getId_jadwal());
            pstm.setString(3, mhs.getWaktu());
            pstm.setString(4, mhs.getStatus());
            pstm.executeUpdate();
            Respon="Insert Sukses";
        } catch (SQLException ex) {
            Respon="Insert Gagal";
            ex.printStackTrace();
        }
        conMan.Logoff();
        return Respon;
    }
    
    /**
     *
     * @return
     */

}
