/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ZBOOK 15U G5-I7
 */
import java.util.Scanner;
public class netes1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        double F,C,naw,nak;
        System.out.printf("Masukkan Nilai Awal : ");
        naw = input.nextDouble();
        System.out.printf("Masukkan Nilai Akhir : ");
        nak = input.nextDouble(); 
        System.out.printf("%-10s%-10s%-13s%-10s\n","Celcius","Fahrenheid","|","Fahrenheid","Celcius");
        for (double a=naw;a<=nak;a++){
            if (a%2!=0){
            continue;
            }
            F = (9*a)/5+32;
            C = (5*(a-32))/9;
        System.out.printf("%-10s%-10s%-2s%-13s%-10s\n",String.format("%.0f",a),String.format("%.1f",F),"|",String.format("%.1f",a),String.format("%.1f",C));
        }
        }
    }
    
