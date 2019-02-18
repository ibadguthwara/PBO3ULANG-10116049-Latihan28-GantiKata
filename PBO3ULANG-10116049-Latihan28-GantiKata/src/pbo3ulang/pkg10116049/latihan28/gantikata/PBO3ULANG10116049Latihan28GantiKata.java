package pbo3ulang.pkg10116049.latihan28.gantikata;

import java.util.Scanner;

/**
 *
* @author ibadguthwara
 * NAMA              : M. Ibad Guthwara
 * KELAS             : PBO 3 ULANG
 * NIM               : 10116049
 * DESKRIPSI PROGRAM : Membuat Program Mengganti Kata
 */
public class PBO3ULANG10116049Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Kalimat,Kata,Ubah;
        
        Scanner input = new Scanner(System.in);
    
        System.out.println("====Program Mengganti Kata====");
        System.out.println("");
        System.out.print("Masukan Kalimat : ");
        Kalimat = input.nextLine();
        
        System.out.print("Ganti Kata   : ");
        Kata = input.nextLine();
        
        System.out.print("Menjadi Kata : ");
        Ubah = input.nextLine();
        
        String Ganti = Kalimat.replace(Kata, Ubah);
        System.out.println("");
        System.out.println("====Hasil Formatting====");
        System.out.println("Kalimat Awal : " + Kalimat);
        System.out.println("Kalimat Baru : " + Ganti);
    }
    
}
