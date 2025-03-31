import java.util.*;
import kelas.*;

public class ScentiqueSystem {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Parfum> daftarParfum = new ArrayList<>();

    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("\nSistem Pemesanan dan Custom Parfum di Scentique");
            System.out.println("1. Tambah Parfum");
            System.out.println("2. Lihat Parfum");
            System.out.println("3. Hapus Parfum");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Input harus berupa angka!");
                scanner.next();
            }
            pilihan = scanner.nextInt();
            scanner.nextLine();

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
                    System.out.println("Terima kasih telah menggunakan sistem Scentique!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 4);
    }

    static void tambahParfum() {
        System.out.print("Masukkan ID Parfum: ");
        String idParfum = scanner.nextLine().trim();
        if (idParfum.isEmpty()) {
            System.out.println("ID Parfum tidak boleh kosong!");
            return;
        }

        System.out.print("Masukkan Nama Parfum: ");
        String namaParfum = scanner.nextLine().trim();
        if (namaParfum.isEmpty()) {
            System.out.println("Nama Parfum tidak boleh kosong!");
            return;
        }

        System.out.print("Masukkan Harga Parfum: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Input harus berupa angka!");
            scanner.next();
        }
        double hargaParfum = scanner.nextDouble();

        System.out.print("Masukkan Stok Parfum: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Input harus berupa angka!");
            scanner.next();
        }
        int stok = scanner.nextInt();
        scanner.nextLine();

        daftarParfum.add(new Parfum(idParfum, namaParfum, hargaParfum, stok));
        System.out.println("Parfum berhasil ditambahkan!");
    }

    static void lihatParfum() {
        if (daftarParfum.isEmpty()) {
            System.out.println("Tidak ada parfum dalam daftar.");
        } else {
            System.out.println("Daftar Parfum:");
            for (Parfum p : daftarParfum) {
                System.out.println("ID: " + p.getIdParfum() + ", Nama: " + p.getNamaParfum() + ", Harga: " + p.getHargaParfum() + ", Stok: " + p.getStok());
            }
        }
    }

    static void hapusParfum() {
        if (daftarParfum.isEmpty()) {
            System.out.println("Tidak ada parfum dalam daftar.");
            return;
        }

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
    }
}