import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data diri
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan jenis kelamin (P/L): ");
        char jenisKelamin = scanner.next().charAt(0);

        System.out.print("Masukkan tanggal lahir (format: YYYY-MM-DD): ");
        String tanggalLahirStr = scanner.next();

        // Konversi string tanggal lahir menjadi objek LocalDate
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirStr, formatter);

        // Hitung umur
        LocalDate tanggalSekarang = LocalDate.now();
        int umur = tanggalSekarang.getYear() - tanggalLahir.getYear();

        // Output data diri
        System.out.println("\nData Diri:");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + (jenisKelamin == 'P' ? "Perempuan" : "Laki-laki"));
        System.out.println("Tanggal Lahir: " + tanggalLahir.format(formatter));
        System.out.println("Umur: " + umur + " tahun");

        scanner.close();
    }
}
