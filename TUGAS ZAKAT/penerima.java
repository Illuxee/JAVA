public class AbidinPenerima {
    private String namaPenerima;
    private String alamat;

    public AbidinPenerima(String namaPenerima, String alamat) {
        this.namaPenerima = namaPenerima;
        this.alamat = alamat;
    }

    public String getNamaPenerima() {
        return namaPenerima;
    }

    public void setNamaPenerima(String namaPenerima) {
        this.namaPenerima = namaPenerima;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void displayInfo() {
        System.out.println("\n-- Informasi Penerima --");
        System.out.println("Nama Penerima : " + namaPenerima);
        System.out.println("Alamat        : " + alamat);
    }
}
