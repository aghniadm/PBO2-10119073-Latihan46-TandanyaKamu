package pbo2.pkg10119073.latihan46.tandanyakamu;

/**
 *
 * @author 
 * NAMA     : Aghnia Dewi Mahiranie
 * KELAS    : PBO2
 * NIM      : 10119073
 * Deskripsi Program : Program ini berisi program untuk menentukan kepribadian berdasarkan umur
 *
 */

public class Age {
    private int yearBirth, yearNow;
    private final String red = "\u001B[31m";

    public Age(int yearNow){
        this.yearNow = yearNow;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int getYearNow() {
        return yearNow;
    }
    
    public int hitungUmur(){
        int hitung = yearNow - yearBirth;
        return hitung;
    }
    
    public String tandanyaKamu(int umur){  
        if((0 <= umur)&&(umur <= 5)){
        System.out.println("Tandanya Kamu "+red+"LAGI LUCU-LUCU NYA");
    }else if ((5 < umur)&&(umur <= 10)){
        System.out.println("Tandanya Kamu "+red+"MASIH ANAK-ANAK");
    }else if ((10 < umur)&&(umur <= 13)){
        System.out.println("Tandanya Kamu "+red+"MASIH REMADJA");
    }else if ((13 < umur)&&(umur <= 19)){
        System.out.println("Tandanya Kamu "+red+"ALAY");
    }else if ((19 < umur)&&(umur <= 29)){
        System.out.println("Tandanya Kamu "+red+"LAGI GALAU NYARI JODOH");
    }else if ((29 < umur)&&(umur <= 35)){
        System.out.println("Tandanya Kamu "+red+"LAGI SIBUK NYARI UANG");
    }else if ((35 < umur)&&(umur <= 150)){
        System.out.println("Tandanya Kamu "+red+"SUDAH TUA");
    }else
        System.out.println("Tandanya Kamu "+red+"TIDAK TERDETEKSI DI KEHIDUPAN");
    
        return red;
    }
}
