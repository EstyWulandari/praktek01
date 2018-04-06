/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek01;

/**
 *
 * @author proWindows8.1
 */
public class SepedaMotor {
    String merk;
    String jenis;
    String warna;
    String silinder;
    String tahun;
    
    void cetakInfo(){
        System.out.println("Merk            :"+merk);
        System.out.println("Jenis           :"+jenis);
        System.out.println("Warna           :"+warna);
        System.out.println("Isi Silinder    :"+silinder);
        System.out.println("Tahun Perakitan :"+tahun);
        
        System.out.println("");
        System.out.println("Mempermudah Pekerjaan");
        System.out.println("");
    }
}
