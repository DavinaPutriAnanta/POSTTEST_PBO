package kelas;

public class DetailPesanan {
    private String idDetailPesanan;
    private String idPesanan;
    private String idParfum;
    private String idCustomParfum;
    private int jumlah;
    private double subtotal;

    public DetailPesanan(String idDetailPesanan, String idPesanan, String idParfum, String idCustomParfum, int jumlah, double subtotal) {
        this.idDetailPesanan = idDetailPesanan;
        this.idPesanan = idPesanan;
        this.idParfum = idParfum;
        this.idCustomParfum = idCustomParfum;
        this.jumlah = jumlah;
        this.subtotal = subtotal;
    }

    public String getIdDetailPesanan() {
        return idDetailPesanan;
    }

    public void setIdDetailPesanan(String idDetailPesanan) {
        this.idDetailPesanan = idDetailPesanan;
    }

    public String getIdPesanan() {
        return idPesanan;
    }

    public void setIdPesanan(String idPesanan) {
        this.idPesanan = idPesanan;
    }

    public String getIdParfum() {
        return idParfum;
    }

    public void setIdParfum(String idParfum) {
        this.idParfum = idParfum;
    }

    public String getIdCustomParfum() {
        return idCustomParfum;
    }

    public void setIdCustomParfum(String idCustomParfum) {
        this.idCustomParfum = idCustomParfum;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
}
