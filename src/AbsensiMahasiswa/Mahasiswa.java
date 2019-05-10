/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbsensiMahasiswa;

/**
 *
 * @author Asus
 */
public class Mahasiswa {
private String nrp,id_jadwal,waktu,status;

    public Mahasiswa() {
    }

    public Mahasiswa(String nrp, String id_jadwal, String waktu, String status) {
        this.nrp = nrp;
        this.id_jadwal = id_jadwal;
        this.waktu  = waktu;
        this.status = status;
    }


    public String getNrp() {
        return nrp;
    }

    public void setNrp(String nrp) {
        this.nrp = nrp;
    }

    public String getId_jadwal() {
        return id_jadwal;
    }

    public void setId_jadwal(String id_jadwal) {
        this.id_jadwal = id_jadwal;
    }

    public String getWaktu() {
        return waktu;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "nrp=" + nrp + ", id_jadwal=" + id_jadwal + ", waktu=" + waktu + ", status=" + status +'}';
    }
}
  
