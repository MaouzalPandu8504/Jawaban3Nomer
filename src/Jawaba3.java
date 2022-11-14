import java.util.Scanner;
import java.util.Random;
public class Jawaba3 {
    private static int Random;

    public static void main(String[] args) {
        String nama,prodi;
        int angka0=0;
        int angka1=1;
        int angka2=2;
        int angka3=3;
        int angka4=4;
        int angka5=5;
        int angka6=6;
        int angka7=7;
        int angka8=8;
        int angka9=9;

        Scanner inputNama = new Scanner(System.in);
        Scanner inputProdi = new Scanner(System.in);
        Random NIK = new Random(12);
        for(int index=0;index<100;index++);{
            Random = NIK.nextInt(12);
        }
        System.out.println("Masukan Nama Pendaftar ");
        nama = inputNama.nextLine();
        System.out.println("        Masukan Nama Prodi yang Tersedia ");
        System.out.println("Teknik Informatika   |   DKV   |   Teknik Komputer ");
        prodi = inputProdi.nextLine();
        System.out.println("Selamat Anda Telah Terdaftar dengan NIK : ");

    }
}
