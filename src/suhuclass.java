import java.util.Scanner;

public class suhuclass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jenis suhu (Fahrenheit/F/Reamur/R): ");
        char jenisSuhu = input.next().charAt(0);

        System.out.print("Masukkan nilai suhu Celsius: ");
        double suhuCelsius = input.nextDouble();

        double hasilKonversi = 0;

        if (jenisSuhu == 'F' || jenisSuhu == 'f') {
            hasilKonversi = (suhuCelsius * 9/5) + 32;
        } else if (jenisSuhu == 'R' || jenisSuhu == 'r') {
            hasilKonversi = suhuCelsius * 4/5;
        } else {
            System.out.println("Jenis suhu tidak valid. Program berhenti.");
            System.exit(0);
        }

        System.out.println("Hasil konversi: " + hasilKonversi);

        // Validasi kelipatan 2 dan 5
        if (hasilKonversi % 2 == 0 && hasilKonversi % 5 == 0) {
            System.out.println("Hasil konversi merupakan kelipatan 2 dan 5.");
        } else {
            System.out.println("Hasil konversi bukan kelipatan 2 dan 5.");
        }

        input.close();
    }
}