package kelas;

public class Pesanan {
    private String idPesanan;
    private String idPelanggan;
    private String idAdmin;
    private String status;
    private String tanggalPesanan;
    private double totalHarga;

    public Pesanan(String idPesanan, String idPelanggan, String idAdmin, String status, String tanggalPesanan, double totalHarga) {
        this.idPesanan = idPesanan;
        this.idPelanggan = idPelanggan;
        this.idAdmin = idAdmin;
        this.status = status;
        this.tanggalPesanan = tanggalPesanan;
        this.totalHarga = totalHarga;
    }

    public String getIdPesanan() {
        return idPesanan;
    }

    public void setIdPesanan(String idPesanan) {
        this.idPesanan = idPesanan;
    }

    public String getIdPelanggan() {
        return idPelanggan;
    }

    public void setIdPelanggan(String idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    public String getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(String idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTanggalPesanan() {
        return tanggalPesanan;
    }

    public void setTanggalPesanan(String tanggalPesanan) {
        this.tanggalPesanan = tanggalPesanan;
    }

    public double getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(double totalHarga) {
        this.totalHarga = totalHarga;
    }
}