import java.util.Scanner;

public class IFstatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in);

        int nomorHari;
        System.out.println("Masukkan nomor dianatara 1 sampai 7");
        nomorHari = scanner.nextInt();
        String namaHari = "";

        if (nomorHari == 1) {
            namaHari = "Minggu";
        } else if (nomorHari == 2){
            namaHari = "Senin";
        } else if (nomorHari == 3) {
            namaHari = "Selasa";
        }  else if (nomorHari == 4) {
            namaHari = "Rabu";
        } else if (nomorHari == 5) {
            namaHari = "kamis";
        } else if (nomorHari == 6) {
            namaHari = "Jumat";
        }  else if (nomorHari == 7) {
            namaHari = "Sabtu";
        } else {
            System.out.println("Masukan nomor diantara 1 samapai 7");
            System.out.println(0);
        }
        System.out.println("nama Hari:"+ namaHari);
    }
}
