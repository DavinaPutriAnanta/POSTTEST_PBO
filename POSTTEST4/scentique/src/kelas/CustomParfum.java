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
   
        throw new UnsupportedOperationException("Unimplemented method 'getkelasparfum'");
    }
}