package Konstraktor;

public class Mobil {

    // deklarasi variabel
    String warna;
    int tahunProduksi;

    // deklarasi konstraktor
    public Mobil(String a, int b){
        this.warna = a;
        this.tahunProduksi = b;
    }

    public void info(){
        System.out.println("Warna = " + warna);
        System.out.println("Tahun Produksi = " + tahunProduksi);


    }
}
