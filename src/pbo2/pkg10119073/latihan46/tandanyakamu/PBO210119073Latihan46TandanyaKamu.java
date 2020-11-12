package pbo2.pkg10119073.latihan46.tandanyakamu;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Aghnia Dewi Mahiranie
 * KELAS    : PBO2
 * NIM      : 10119073
 * Deskripsi Program : Program ini berisi program untuk menentukan kepribadian berdasarkan umur
 *
 */

public class PBO210119073Latihan46TandanyaKamu {

    public static void main(String[] args) {
        Age age = new Age(Calendar.getInstance().get(Calendar.YEAR));
        
        System.out.print("Masukkan Tahun Lahir Anda : ");
        Scanner scanner = new Scanner(System.in);
        age.setYearBirth(scanner.nextInt());
        System.out.println("");
        System.out.println("======Hasil Perhitungan Umur======");
        System.out.println("Tahun Lahir anda : "+age.getYearBirth());
        System.out.println("Hari ini tahun : "+age.getYearNow());
        System.out.println("Umur Kamu sampai hari ini adalah "+age.hitungUmur()+" tahun");
        age.tandanyaKamu(age.hitungUmur());
    }
    
}
