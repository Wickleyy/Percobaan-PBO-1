import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class codelab {
    public static void main(String[] args){
        String nama;
        char jeniskelamin;
        String tanggallahir;
        int umur;
        int bulan;

        Scanner objInput = new Scanner(System.in);

        System.out.println("Nama : ");
        nama = objInput.nextLine();
        System.out.println("Jenis kelamin (L/P) : ");
        jeniskelamin = objInput.next().charAt(0);
        System.out.println("Tanggal lahir (format: YYYY-MM-DD) : ");
        tanggallahir = objInput.next();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate tanggalLahir = LocalDate.parse(tanggallahir, formatter);

        LocalDate tanggalSekarang = LocalDate.now();
        umur = tanggalSekarang.getYear() - tanggalLahir.getYear();
        bulan = tanggalSekarang.getMonthValue() - tanggalLahir.getMonthValue();

        System.out.println("Nama: " + nama);
        System.out.println("Jenis kelamin: " + (jeniskelamin == 'L' ? "Laki-Laki" : "Perempuan"));
        System.out.println("Tanggal lahir: " + tanggallahir);
        System.out.println("Umur: " + umur + "Tahun" + bulan + "Bulan");
    }
}