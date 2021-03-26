package tugas2.sepeda;

public class SepedaBeraksi {
    public static void main(String[] args) {
        sepeda sepedaku = new sepeda();

        sepedaku.setGir(2);

//        sepedaku.gir = 5;  tidak akan berpengaruh karena pada sepeda.java variabelnya sudah di private

        System.out.println("gir saat ini = " + sepedaku.getGir());

//        lebih singkat seperti ini
//        System.out.println("gir saat ini = " + sepedaku.setGir(2));
    }
}
