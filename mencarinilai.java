package ifElse;
import java.util.Scanner;
/**
 *
 * @author hady
 */
public class mencarinilai{
    public static void main (String [] hady){
        Scanner input = new Scanner (System.in);
        String nama , nim ;
        char grade ;
        final double n_tugas , n_uts , n_kuis , n_uas , n_akhir;
        System.out.println("===== Menghitung Nilai Mahasiswa=====\n");
        System.out.print("Masukan nama : ");
        nama = input.nextLine();
        System.out.print("Masukan NIM : ");
        nim = input.nextLine();
        System.out.print("Nilai tugas : ");
        n_tugas = input.nextInt();
        System.out.print("Nilai kuis : ");
        n_kuis = input.nextInt();
        System.out.print("Nilai uts : ");
        n_uts = input.nextInt();
        System.out.print("Nilai uas : ");
        n_uas = input.nextInt();
        n_akhir = (0.15 * n_tugas + 0.20 * n_kuis + 0.30 * n_uts + 0.35 * n_uas);
        if (n_akhir >= 85 && n_akhir <=100){
            grade = 'A';
        }
        else if (n_akhir > 75 && n_akhir < 85){
            grade = 'B';
        }
        else if (n_akhir > 65 && n_akhir < 75){
            grade = 'C';
        }
        else if (n_akhir > 50 && n_akhir < 65){
            grade = 'D';
        }
        else {
            grade = 'E';
        }
        if (grade == 'A' || grade == 'B' || grade == 'C'){
            System.out.println("\n"+nama+" dengan NIM "+nim+" memiliki nilai akhir "+n_akhir+" = ("+grade+")"+""
                    + "\n dan dinyatakan Lulus");
        }
        else {
            System.out.println("\n"+nama+" dengan NIM "+nim+" memiliki nilai akhir "+n_akhir+" = ("+grade+")"+""
                    + "\n dan dinyatakan Tidak Lulus");
        }  
    }
}