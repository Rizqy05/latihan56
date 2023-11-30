/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117048.latihan56.umurbarangantik;

/**
 *
 * @author 
 * Nama : Rizqy Mulya Saputra
 * Nim : 22205007 
 * Kelas : PBO 
 * Deskripsi Program : Program ini berisi tentang umur barang antik radio.
 */
public class Latihan56UmurBarangAntik22205007 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Radio rdo = new Radio(234);
        rdo.setName("Radio AM");
        System.out.println("Nama Barang Antik : " + rdo.getName());
        rdo.tampilUmur();
    }

}
