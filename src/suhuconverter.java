import java.util.Scanner;

public class suhuconverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jenis suhu
        System.out.println("Masukkan jenis suhu (F untuk Fahrenheit, R untuk Reamur): ");
        char jenisSuhu = scanner.next().charAt(0);

        // Input nilai suhu dalam Celsius
        System.out.println("Masukkan nilai suhu dalam Celsius: ");
        double suhuCelsius = scanner.nextDouble();

        // Konversi suhu
        double hasilKonversi = 0;
        String statusKelipatan = "";
        if (jenisSuhu == 'F' || jenisSuhu == 'f') {
            hasilKonversi = (suhuCelsius * 9/5) + 32;
        }else if (jenisSuhu == 'R' || jenisSuhu == 'r') {
            hasilKonversi = suhuCelsius * 4/5;

        }else {
            System.out.println("Jenis suhu tidak valid. Program berhenti.");
            System.exit(0);
        }

        // Validasi kelipatan 2 dan 5
        if (hasilKonversi % 2 == 0 && hasilKonversi % 5 == 0) {
            statusKelipatan = "Kelipatan 2 dan 5";
        } else {
            statusKelipatan = "Bukan kelipatan 2 dan 5";
        }

        // Menampilkan hasil konversi dan status kelipatan
        System.out.println("Hasil konversi: " + hasilKonversi);
        System.out.println("Status kelipatan: " + statusKelipatan);

        scanner.close();
    }
}