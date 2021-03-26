package Matematika;

public class MatematikaCanggihBeraksi {
    public static void main(String[] args) {
        MatematikaCanggih math = new MatematikaCanggih();

        System.out.println("12 % 5 = " + math.modulus(12,5));

        System.out.println("2 + 4 = " + math.tambah(2,4));
        System.out.println("5 - 4 = " + math.kurang(5,4));
        System.out.println("4 / 2 = " + math.bagi(4,2));
        System.out.println("2 x 4 = " + math.kali(2,4));

//        uji konsep overlaoding
        System.out.println("12.5 + 28.7 + 14.2 = " + math.tambah(12.5,28.7,14.2));
        System.out.println("12 + 28 + 14 = " + math.tambah(12,28,14));
        System.out.println("23 + 24 = " + math.tambah(23,24));
        System.out.println("3.4 + 4.9 = " + math.tambah(3.4,4.9));
    }
}
