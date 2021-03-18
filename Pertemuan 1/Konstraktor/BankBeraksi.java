package Konstraktor;

public class BankBeraksi {
    public static void main(String[] args) {

        // mengambil konstraktor
        Bank nasabah = new Bank(100000);

        // program
        System.out.println("Selamat Datang di Bank CBA");
        nasabah.getSaldo();

        nasabah.simpanUang(500000);
        nasabah.getSaldo();

        nasabah.ambilUang(150000);
        nasabah.getSaldo();

    }
}
