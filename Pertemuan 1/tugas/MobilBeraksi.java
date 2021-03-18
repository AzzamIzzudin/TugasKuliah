package tugas;

public class MobilBeraksi {
    public static void main(String[] args){

        // Membuat objek
        Mobil mobilku = new Mobil();

        // memanggil attrb dan memberi value
        mobilku.warna = "Hitam";
        mobilku.tahunProduksi = 2006;
        System.out.println("Warna = " + mobilku.warna);
        System.out.println("Tahun Produksi = " + mobilku.tahunProduksi);
    }
}
