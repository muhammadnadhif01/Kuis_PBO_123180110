/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perhitungan;

/**
 *
 * @author Asus
 */
public class Web extends namanik implements Interfacebobot {
     private double hitungHasil;

    public Web(String nama, String nik, double nilaiTulis, double nilaiCoding, double nilaiWawancara) {
        super(nama, nik, nilaiTulis, nilaiCoding, nilaiWawancara);
    }

    public double getHitungHasil() {
        return hitungHasil;
    }

    @Override
    public void hitungHasil() {
         this.hitungHasil = ((super.getNilaiTulis() * 0.4) + (super.getNilaiCoding() * 0.35) + (super.getNilaiWawancara() * 0.25));
      }
    
}
