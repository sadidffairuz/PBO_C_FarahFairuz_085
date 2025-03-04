import java.util.Scanner;
import java.time.LocalDate;

public class codelabDataDiri1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Nama : ");
        String nama = input.nextLine();

        System.out.println("Masukkan Jenis Kelamin (P/L) : ");
        char pilihJenisKelamin = input.next().charAt(0);

        System.out.println("Masukkan Tahun Lahir : ");
        int tahunLahir = input.nextInt();

        input.close();

        int tahunSekarang = LocalDate.now().getYear();

        int umur = tahunSekarang - tahunLahir;

        String jenisKelamin;
        if (pilihJenisKelamin == 'L' || pilihJenisKelamin == 'l') {
            jenisKelamin = "Laki-laki";
        } else if (pilihJenisKelamin == 'P' || pilihJenisKelamin == 'p') {
            jenisKelamin = "Perempuan";
        } else {
            jenisKelamin = "Tidak Diketahui Jenis Kelaminnya";
        }

        System.out.println("Nama : " + nama);
        System.out.println("Jenis Kelamin : " + jenisKelamin);
        System.out.println("Umur : " + umur + " tahun");
    }
}
