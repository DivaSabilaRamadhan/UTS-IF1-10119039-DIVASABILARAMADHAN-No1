/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author 
 * Nama  : Diva Sabila Ramadhan 
 * Kelas : IF1
 * NIM   : 10119039
 * Deskripsi Program : program perhitungan umur 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Age usia = new Age(2018);
        System.out.println("Tahun lahir anda : ");
        usia.setYearBirth(sc.nextInt());
        System.out.println();
        
        System.out.println("====Hasil Perhitungan Umur====");
        System.out.println("Tahun Lahir Anda : " + usia.getYearBirth());
        System.out.println("Hari Ini Tahun   : " + usia.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah : " + usia.hitungUmur() + "Tahun");
        System.out.println("Tandanya Kamu : ".concat(usia.tandanyaKamu(usia.hitungUmur())));
    }
    
}
