package kelas;

interface Pembayaran {
    void prosesPembayaran(double jumlah) throws IllegalArgumentException;
    String generateInvoice();
}

public class Pesanan implements Pembayaran {
    private String idPesanan;
    private String idPelanggan;
    private String idAdmin;
    private String status;
    private String tanggalPesanan;
    private double totalHarga;

    public Pesanan(String idPesanan, String idPelanggan, String idAdmin, 
                  String status, String tanggalPesanan, double totalHarga) {
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

    @Override
    public void prosesPembayaran(double jumlah) throws IllegalArgumentException {
        if (jumlah <= 0) {
            throw new IllegalArgumentException("Jumlah pembayaran harus positif");
        }
        if (jumlah < totalHarga) {
            System.out.println("[PEMBAYARAN] Pembayaran kurang: Rp" + (totalHarga - jumlah));
        } else {
            System.out.println("[PEMBAYARAN] Berhasil! Kembalian: Rp" + (jumlah - totalHarga));
            this.status = "Lunas";
        }
    }

    @Override
    public String generateInvoice() {
        return "=== INVOICE PESANAN ===\n" +
               "ID Pesanan    : " + idPesanan + "\n" +
               "Tanggal       : " + tanggalPesanan + "\n" +
               "Total Harga   : Rp" + totalHarga + "\n" +
               "Status        : " + status + "\n" +
               "ID Pelanggan  : " + idPelanggan;
    }
}