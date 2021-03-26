package Matematika;

public class Matematika {

    static int tambah(int x, int y){
        int z = x + y;
        return z;
    }

    static int kurang(int x, int y){
        int z = x - y;
        return z;
    }

    static int kali(int x, int y){
        int z = x * y;
        return z;
    }

    static int bagi(int x, int y){
        int z = x / y;
        return z;
    }

//    overloading

    static int tambah(int x, int y, int v){
        int z = x + y + v;
        return z;
    }

    static int kurang(int x, int y, int v){
        int z = x - y - v;
        return z;
    }

    static int kali(int x, int y, int v){
        int z = (x * y) * v;
        return z;
    }

    static int bagi(int x, int y, int v){
        int z = (x / y) / v;
        return z;
    }
}
