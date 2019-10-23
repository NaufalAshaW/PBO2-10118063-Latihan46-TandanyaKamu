/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118063.latihan46;
import java.util.Calendar;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : Naufal Asha
 * KELAS    : IF-2
 * NIM      : 10118063
 */
public class TandanyaKamu {
    
    private static int yearNow, umur;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        yearNow = Calendar.getInstance().get(Calendar.YEAR);
        Age age = new Age(yearNow);
        
        System.out.print("Masukkan Tahun Lahir Anda : ");
        age.setYearBirth(scanner.nextInt());
        
        umur = age.hitungUmur();
        
        System.out.println("\n=====Hasil Perhitungan Umur=====");
        System.out.println("Tahun Lahir Anda : " + age.getYearBirth());
        System.out.println("Hari ini Tahun : " + age.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah : " 
                + umur +" tahun");
        System.out.println("Tandanya kamu : " + age.tandanyaKamu(umur));
    }
    
}
