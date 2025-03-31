package kelas;

public class Admin extends Pelanggan { 
    public Admin(String idAdmin, String nama, String email, String password) {
        super(idAdmin, nama, email, password, "-", "-");  
    }

    public void kelolaSistem() {
        System.out.println("Admin " + getNama() + " sedang mengelola sistem...");
    }
}