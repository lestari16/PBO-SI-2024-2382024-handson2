import java.util.Scanner;

public class soal1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

    /*input angka pertama dari user*/
    System.out.print("Masukan angka pertama:");
    int num1 = scanner.nextInt();

    /*input angka kedua dari user*/
    System.out.print("Masukkan angka kedua:");
    int num2 = scanner.nextInt();
    // membandingkan kedua angka dan mencetak nilai yang lebih besar
    if (num1 > num2){
        System.out.println("Angka terbesar adalah: " + num1);
    } else if(num2 > num1){
        System.out.println("Angka terbesar adalah: " + num2);
    } else{
        System.out.println("Kedua angka sama besar.");
    }
        scanner.close();

}
}
