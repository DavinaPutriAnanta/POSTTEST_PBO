package kelas;

public class Pelanggan {
    private String idPelanggan;
    private String nama;
    private String email;
    private String password;
    private String alamat;
    private String noTelp;

    public Pelanggan(String idPelanggan, String nama, String email, String password, String alamat, String noTelp) {
        this.idPelanggan = idPelanggan;
        this.nama = nama;
        this.email = email;
        this.password = password;
        this.alamat = alamat;
        this.noTelp = noTelp;
    }

    public String getIdPelanggan() {
        return idPelanggan;
    }

    public void setIdPelanggan(String idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }
}