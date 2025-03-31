package kelas;

public class CustomParfum extends Pelanggan {  
    private String idCustom;
    private String kelasParfum;
    private String notesParfum;
    private double hargaCustom;

    public CustomParfum(String idPelanggan, String idCustom, String kelasParfum, 
                       String notesParfum, double hargaCustom) {
        super(idPelanggan, "Pelanggan Custom", "-", "-", "-", "-");  
        this.idCustom = idCustom;
        this.kelasParfum = kelasParfum;
        this.notesParfum = notesParfum;
        this.hargaCustom = hargaCustom;
    }

    public void displayInfo() {
        System.out.println("Custom ID: " + idCustom + " oleh Pelanggan: " + getIdPelanggan());
    }
}