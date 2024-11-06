public class MarzuqiDonatur {
    private String nama;
    private String nim;
    private String kelas;

    public MarzuqiDonatur(String nama, String nim, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public void displayInfo() {
        System.out.println("\n-- Informasi Donatur --");
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + nim);
        System.out.println("Kelas : " + kelas);
    }

    public void hitungZakatFitrah() {
        System.out.println("Zakat Fitrah adalah 2.5 kg beras atau setara uang.");
        System.out.println("Kewajiban zakat fitrah untuk setiap orang.");
    }

    public void hitungZakatMaal(double harta) {
        double hargaEmas = 965000;
        double nisabMaal = 85 * hargaEmas;
        if (harta >= nisabMaal) {
            double zakatMaal = harta * 2.5 / 100;
            System.out.printf("Jumlah zakat maal yang harus dibayarkan adalah: %.2f%n", zakatMaal);
        } else {
            System.out.println("Harta belum mencapai nisab, zakat maal tidak wajib.");
        }
    }

    public void hitungZakatProfesi(double penghasilan) {
        double hargaBeras = 10000;
        double nisabProfesi = 520 * hargaBeras;
        if (penghasilan >= nisabProfesi) {
            double zakatProfesi = penghasilan * 2.5 / 100;
            System.out.printf("Jumlah zakat profesi yang harus dibayarkan adalah: %.2f%n", zakatProfesi);
        } else {
            System.out.println("Penghasilan belum mencapai nisab, zakat profesi tidak wajib.");
        }
    }

    public void hitungZakatTernak(int jenisTernak, int jumlahTernak) {
        if (jenisTernak == 1) { // Kambing
            if (jumlahTernak >= 40) {
                System.out.println("Zakat kambing wajib dikeluarkan 1 ekor kambing.");
            } else {
                System.out.println("Jumlah kambing belum mencapai nisab, zakat tidak wajib.");
            }
        } else if (jenisTernak == 2) { // Sapi
            if (jumlahTernak >= 30) {
                System.out.println("Zakat sapi wajib dikeluarkan 1 ekor sapi.");
            } else {
                System.out.println("Jumlah sapi belum mencapai nisab, zakat tidak wajib.");
            }
        } else {
            System.out.println("Pilihan ternak tidak valid.");
        }
    }
}
