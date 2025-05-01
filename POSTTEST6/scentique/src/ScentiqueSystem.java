import java.util.*;
import kelas.*;

public class ScentiqueSystem {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Parfum> daftarParfum = new ArrayList<>();
    static ArrayList<Pelanggan> daftarPelanggan = new ArrayList<>();

    public static final double DISKON_MEMBER = 0.1; 
    public static double hitungHargaSetelahDiskon(double harga, boolean isMember) {
        return isMember ? harga * (1 - DISKON_MEMBER) : harga;
    }

    public static void tampilkanInfoPelanggan(Pelanggan pelanggan) {
        pelanggan.displayInfo();
    }

    public static void tampilkanInfoPelanggan(Pelanggan pelanggan, boolean showDetail) {
        if (showDetail) {
            System.out.println("\n=== DETAIL PELANGGAN ===");
            pelanggan.displayInfo();
            if (pelanggan instanceof Admin) {
                ((Admin)pelanggan).kelolaSistem();
            } else if (pelanggan instanceof CustomParfum) {
                System.out.println("Kelas Parfum: " + ((CustomParfum)pelanggan).getkelasparfum());
            }
        } else {
            pelanggan.displayInfo();
        }
    }

    public static void main(String[] args) {
        daftarPelanggan.add(new Admin("ADM001", "Admin Scentique", "admin@scentique.com", "admin123"));
        daftarPelanggan.add(new CustomParfum("CUST001", "ORDER123", "Premium", "Aroma Kayu", 500000));

        Pesanan demoPesanan = new Pesanan("ORDER999", "CUST001", "ADM001", "Pending", "2023-11-20", 250000);
        try {
            System.out.println("\n=== DEMO INTERFACE ===");
            demoPesanan.prosesPembayaran(300000);
            System.out.println(demoPesanan.generateInvoice());
        } catch (IllegalArgumentException e) {
            System.out.println("Error pembayaran: " + e.getMessage());
        }

        System.out.println("\n=== DEMO STATIC METHOD ===");
        System.out.println("Harga 100000 untuk member: " + hitungHargaSetelahDiskon(100000, true));
        System.out.println("Harga 100000 untuk non-member: " + hitungHargaSetelahDiskon(100000, false));

        int pilihan;
        do {
            System.out.println("\nSistem Pemesanan dan Custom Parfum di Scentique");
            System.out.println("1. Tambah Parfum");
            System.out.println("2. Lihat Parfum");
            System.out.println("3. Hapus Parfum");
            System.out.println("4. Lihat Contoh Polymorphism");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");

            try {
                pilihan = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Input harus berupa angka!");
                pilihan = 0;
                continue;
            }

            switch (pilihan) {
                case 1:
                    tambahParfum();
                    break;
                case 2:
                    lihatParfum();
                    break;
                case 3:
                    hapusParfum();
                    break;
                case 4:
                    System.out.println("\nDemo Polymorphism:");
                    for (Pelanggan p : daftarPelanggan) {
                        tampilkanInfoPelanggan(p, true);
                    }
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan sistem Scentique!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);
    }

    static void tambahParfum() {
        try {
            System.out.print("Masukkan ID Parfum: ");
            String idParfum = scanner.nextLine().trim();
            if (idParfum.isEmpty()) {
                throw new IllegalArgumentException("ID Parfum tidak boleh kosong!");
            }

            System.out.print("Masukkan Nama Parfum: ");
            String namaParfum = scanner.nextLine().trim();
            if (namaParfum.isEmpty()) {
                throw new IllegalArgumentException("Nama Parfum tidak boleh kosong!");
            }

            System.out.print("Masukkan Harga Parfum: ");
            double hargaParfum = Double.parseDouble(scanner.nextLine());
            if (hargaParfum <= 0) {
                throw new IllegalArgumentException("Harga harus lebih dari 0");
            }

            System.out.print("Masukkan Stok Parfum: ");
            int stok = Integer.parseInt(scanner.nextLine());
            if (stok < 0) {
                throw new IllegalArgumentException("Stok tidak boleh negatif");
            }

            daftarParfum.add(new Parfum(idParfum, namaParfum, hargaParfum, stok));
            System.out.println("Parfum berhasil ditambahkan!");

        } catch (NumberFormatException e) {
            System.out.println("Input harus berupa angka!");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static void lihatParfum() {
        if (daftarParfum.isEmpty()) {
            System.out.println("Tidak ada parfum dalam daftar.");
        } else {
            System.out.println("\nDaftar Parfum:");
            for (Parfum p : daftarParfum) {
                System.out.printf("ID: %s | Nama: %-15s | Harga: Rp%,.2f | Stok: %d%n",
                        p.getIdParfum(), p.getNamaParfum(), p.getHargaParfum(), p.getStok());
            }
        }
    }

    static void hapusParfum() {
        if (daftarParfum.isEmpty()) {
            System.out.println("Tidak ada parfum dalam daftar.");
            return;
        }

        try {
            System.out.print("Masukkan ID Parfum yang ingin dihapus: ");
            String idParfum = scanner.nextLine().trim();
            boolean ditemukan = false;

            for (int i = 0; i < daftarParfum.size(); i++) {
                if (daftarParfum.get(i).getIdParfum().equalsIgnoreCase(idParfum)) {
                    daftarParfum.remove(i);
                    System.out.println("Parfum berhasil dihapus.");
                    ditemukan = true;
                    break;
                }
            }

            if (!ditemukan) {
                System.out.println("Parfum tidak ditemukan.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}