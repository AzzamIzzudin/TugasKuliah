package Matematika;

public class MatematikaCanggih extends Matematika {

    static int modulus(int x,int y){
       int z = x % y;
       return z;
   }

//   overloading
    static int modulus(int x,int y, int v){
        int z = x % y % v;
        return z;
    }

    static double tambah(double x, double y, double z){
        double v = x + y + z;
        return v;
    }

    static double tambah(double x, double y){
        double z = x + y;
        return z;
    }
}
