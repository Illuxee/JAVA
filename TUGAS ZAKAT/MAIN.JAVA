import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pilihan;

        do {
            // Input untuk Donatur
            System.out.print("Masukkan Nama Donatur: ");
            String nama = input.nextLine();
            System.out.print("Masukkan NIM Donatur: ");
            String nim = input.nextLine();
            System.out.print("Masukkan Kelas Donatur: ");
            String kelas = input.nextLine();

            // Membuat objek Donatur
            MarzuqiDonatur donatur = new MarzuqiDonatur(nama, nim, kelas);
            donatur.displayInfo();

            // Input untuk Penerima
            System.out.print("\nMasukkan Nama Penerima: ");
            String namaPenerima = input.nextLine();
            System.out.print("Masukkan Alamat Penerima: ");
            String alamat = input.nextLine();

            // Membuat objek Penerima
            AbidinPenerima penerima = new AbidinPenerima(namaPenerima, alamat);
            penerima.displayInfo();

            // Pilihan zakat
            System.out.println("\nPilih jenis zakat yang ingin dihitung:");
            System.out.println("1. Zakat Fitrah");
            System.out.println("2. Zakat Maal");
            System.out.println("3. Zakat Profesi");
            System.out.println("4. Zakat Ternak");
            System.out.print("Masukkan pilihan (1-4): ");
            int jenisZakat = input.nextInt();

            switch (jenisZakat) {
                case 1:
                    donatur.hitungZakatFitrah();
                    break;
                case 2:
                    System.out.print("Masukkan jumlah harta: ");
                    double harta = input.nextDouble();
                    donatur.hitungZakatMaal(harta);
                    break;
                case 3:
                    System.out.print("Masukkan penghasilan bulanan: ");
                    double penghasilan = input.nextDouble();
                    donatur.hitungZakatProfesi(penghasilan);
                    break;
                case 4:
                    System.out.print("Pilih jenis ternak (1. Kambing, 2. Sapi): ");
                    int jenisTernak = input.nextInt();
                    System.out.print("Masukkan jumlah ternak: ");
                    int jumlahTernak = input.nextInt();
                    donatur.hitungZakatTernak(jenisTernak, jumlahTernak);
                    break;
                default:
                    System.out.println("Pilihan zakat tidak valid.");
                    break;
            }

            input.nextLine(); // Membersihkan buffer
            System.out.print("\nApakah Anda ingin menghitung zakat lagi? (ya/tidak): ");
            pilihan = input.nextLine();

        } while (pilihan.equalsIgnoreCase("ya"));

        System.out.println("Program selesai.");
        input.close();
    }
}
