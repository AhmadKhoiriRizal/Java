
//NAMA  : AHMAD KHOIRI RIZAL
//NIM   : 2022010128
//KELAS : RPL A 2022
 
/**
 *
 */
import java.util.Scanner;
public class Rapot {
    public static void main(String args[]){
     Scanner input = new Scanner(System.in);
     double indo,mtk,inggris,rataRataWajib;
     double olahraga,komputer,jawa,rataRataPeminatan;
     boolean output;
     
        System.out.println("====================================");   
        System.out.println("           Mapel Wajib              ");
        System.out.println("====================================");
        System.out.print("Masukkan Nilai Bahasa Indonesia : ");
        indo = input.nextDouble();
        System.out.print("Masukkan Nilai Matematika       : ");
        mtk = input.nextDouble();
        System.out.print("Masukkan Nilai Bahasa Inggris   : ");
        inggris = input.nextDouble();
        
        rataRataWajib = (indo + mtk + inggris)/3;
        System.out.printf("rata-rata Wajib                : "+ "%.2f %n",rataRataWajib);
        System.out.println("===================================");
        System.out.println("====================================");
   
        
        System.out.println("====================================");
        System.out.println("          Mapel Peminatan           ");
        System.out.println("====================================");
        System.out.print("Masukkan Nilai Olahraga        : ");
        olahraga = input.nextDouble();
        System.out.print("Masukkan Nilai Komputer        : ");
        komputer = input.nextDouble();
        System.out.print("Masukkan Nilai Bahasa Jawa     : ");
        jawa = input.nextDouble();
        System.out.println("====================================");
        System.out.println();
        
        rataRataPeminatan = (komputer + olahraga + jawa)/3;
        System.out.printf("rata-rata Peminatan            : "+ "%.2f %n",rataRataPeminatan);
        System.out.println("===================================");
        
        output = (indo >= 70) && (mtk >= 60) && (inggris >=65) && (rataRataWajib > 65) && (komputer >= 70) && (jawa >=70) && (rataRataPeminatan > 70);
        
        System.out.println("Kelulusan adalah "+ output);
        
  
        
  
     
    }
    
}