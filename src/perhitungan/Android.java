
package perhitungan;

public class Android extends namanik implements Interfacebobot{
    private double hitungHasil;
    public Android(String nama, String nik, double nilaiTulis, double nilaiCoding, double nilaiWawancara) {
        super(nama, nik, nilaiTulis, nilaiCoding, nilaiWawancara);
    }

    public double getHitungHasil() {
        return hitungHasil;
    }


    @Override
    public void hitungHasil() {
        this.hitungHasil = ((super.getNilaiTulis() * 0.2) + (super.getNilaiCoding() * 0.50) + (super.getNilaiWawancara() * 0.3));
    }
    
}
