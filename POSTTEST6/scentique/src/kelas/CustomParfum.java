package kelas;

public class CustomParfum extends Pelanggan {  
    public String idCustom;
    public String kelasParfum;
    public String notesParfum;
    public double hargaCustom;

    public CustomParfum(String idPelanggan, String idCustom, String kelasParfum, 
                       String notesParfum, double hargaCustom) {
        super(idPelanggan, "Pelanggan Custom", "-", "-", "-", "-");
        this.idCustom = idCustom;
        this.kelasParfum = kelasParfum;
        this.notesParfum = notesParfum;
        this.hargaCustom = hargaCustom;
    }
    @Override
    public void displayInfo() {
        System.out.println("Pelanggan Custom - ID: " + getIdPelanggan() + 
                         ", Custom ID: " + idCustom + ", Kelas: " + kelasParfum);
    }
    public String getkelasparfum() {
        return this.kelasParfum;
    }

    public String getIdCustom() {
        return idCustom;
    }

    public void setIdCustom(String idCustom) {
        this.idCustom = idCustom;
    }

    public String getKelasParfum() {
        return kelasParfum;
    }

    public void setKelasParfum(String kelasParfum) {
        this.kelasParfum = kelasParfum;
    }

    public String getNotesParfum() {
        return notesParfum;
    }

    public void setNotesParfum(String notesParfum) {
        this.notesParfum = notesParfum;
    }

    public double getHargaCustom() {
        return hargaCustom;
    }

    public void setHargaCustom(double hargaCustom) {
        this.hargaCustom = hargaCustom;
    }
}