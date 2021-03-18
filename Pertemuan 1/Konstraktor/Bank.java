package Konstraktor;

public class Bank {

   // deklarasi variabel
    int saldo;

    // membuat konstraktor
    public Bank(int a){
        this.saldo = a;
    }

    // membuat method
    void simpanUang(int a){
        System.out.println("Simpan Uang = Rp. " + a);
        saldo = saldo + a;
    }

    void ambilUang(int a){
        System.out.println("Ambil Uang = Rp. " + a);
        saldo = saldo - a;
    }

    void getSaldo(){
        System.out.println("Saldo saat ini = Rp. " + saldo + "\n");
    }
}
