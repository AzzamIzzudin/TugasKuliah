package hp;

public class HandphoneBeraksi {
    public static void main(String[] args) {
        // membuat objek
        Handphone HpKu = new Handphone();

        // memanggil method
        HpKu.hidupkan();
        HpKu.kirimSMS();
        HpKu.lakukanPanggilan();
        HpKu.matikan();
    }

}
