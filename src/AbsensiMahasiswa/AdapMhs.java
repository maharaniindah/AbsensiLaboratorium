///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package AbsensiMahasiswa;
//
//import java.awt.List;
//
///**
// *
// * @author Asus
// */
//public class AdapMhs {
//public Object[][] getAllGuru(){
//	    EMahasiswa em = new EMahasiswa();
//	    List<Mahasiswa>lstmhs=em.ListMhs();
//	    Object[][] datamhs= new Object[lstmhs.size()][5];
//	    
//	    int mysize = 0;
//	    for(Mahasiswa mhs:lstmhs){
//	        datamhs[mysize][0]=mhs.getNrp();
//	        datamhs[mysize][1]=mhs.getId_jadwal();
//	        datamhs[mysize][2]=mhs.getWaktu();
//	        datamhs[mysize][3]=mhs.getStatus();
//	        mysize++;
//	    }
//	    return datamhs;
//	    }
//}