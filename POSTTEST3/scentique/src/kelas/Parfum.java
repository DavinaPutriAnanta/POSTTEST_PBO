package kelas;

public class Parfum {
    private String idParfum;
    private String namaParfum;
    private double hargaParfum;
    private int stok;

    public Parfum(String idParfum, String namaParfum, double hargaParfum, int stok) {
        this.idParfum = idParfum;
        this.namaParfum = namaParfum;
        this.hargaParfum = hargaParfum;
        this.stok = stok;
    }

    public String getIdParfum() {
        return idParfum;
    }

    public void setIdParfum(String idParfum) {
        this.idParfum = idParfum;
    }

    public String getNamaParfum() {
        return namaParfum;
    }

    public void setNamaParfum(String namaParfum) {
        this.namaParfum = namaParfum;
    }

    public double getHargaParfum() {
        return hargaParfum;
    }

    public void setHargaParfum(double hargaParfum) {
        this.hargaParfum = hargaParfum;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
}
