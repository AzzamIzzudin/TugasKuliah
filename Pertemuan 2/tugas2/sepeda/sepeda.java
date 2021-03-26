package tugas2.sepeda;

public class sepeda {

    private int gir;  // diprivate agar di sepedaBeraksi tidak berubah nilai girnya

    void setGir(int x){
        gir = gir + x;
    }

    int getGir(){
        return gir;
    }

//    lebih singkat begini :
////    int setGir(int x){
////        gir = gir + x;
////        return gir;
    }
