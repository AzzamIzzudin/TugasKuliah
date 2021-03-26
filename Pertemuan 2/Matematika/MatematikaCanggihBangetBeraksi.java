package Matematika;

public class MatematikaCanggihBangetBeraksi {
    public static void main(String[] args) {
        MatenatikaCanggihBanget math = new MatenatikaCanggihBanget();

        System.out.println("5 + 6 = " + math.tambah(5,6));
        System.out.println("10 x 2 = " + math.kali(10,2));
        System.out.println("20 % 3 = " + math.modulus(20,3));
        System.out.println("1 + 2 + 3 = " + math.tambahTiga(1,2,3));
    }
}
