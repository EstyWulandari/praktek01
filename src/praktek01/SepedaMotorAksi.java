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
public class SepedaMotorAksi {
    public static void main(String[] args) {
        SepedaMotor Honda = new SepedaMotor();
        SepedaMotor Yamaha = new SepedaMotor();
        SepedaMotor Suzuki = new SepedaMotor();
        
        Honda.merk="Scoopy";
        Honda.jenis="Metic";
        Honda.warna="Silver";
        Honda.silinder="100cc";
        Honda.tahun="2017";
        
        Yamaha.merk="Jupiter MX";
        Yamaha.jenis="kopling";
        Yamaha.warna="Merah";
        Yamaha.silinder="135cc";
        Yamaha.tahun="2013";
        
        Suzuki.merk="Shogun SP";
        Suzuki.jenis="Manual";
        Suzuki.warna="Biru";
        Suzuki.silinder="110cc";
        Suzuki.tahun="2009";
    }
}
