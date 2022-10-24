package Task_1;

import java.util.Scanner;

public class Drivers {
    static private int Panjang;
    static private int Lebar;
    static private int Tinggi;
//
//    private int Hasil;
//
//    public int getPanjang() {
//        return Panjang;
//    }
//
//    public static void setPanjang(int panjang) {
//        Panjang = panjang;
//    }
//
//    public int getLebar() {
//        return Lebar;
//    }
//
//    public static void setLebar(int lebar) {
//        Lebar = lebar;
//    }
//
//    public int getTinggi() {
//        return Tinggi;
//    }
//
//    public static void setTinggi(int tinggi) {
//        Tinggi = tinggi;
//    }
//
//    public void setHasil(int hasil) {
//        Hasil = hasil;
//    }
//
//    public int getHasil() {
//        return Hasil;
//    }

//    void TotalHasil(){
//        setHasil(getPanjang()*getLebar()*getTinggi());
//        System.out.println("\nHasilnya Adalah: " + getHasil());
//    }

    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
//        Drivers D = new Drivers();
        Balok b = new Balok();

        System.out.print("Masukkan Panjang: ");
        Panjang = d.nextInt();
        b.setPanjang(Panjang);
        System.out.print("Masukkan Lebar: ");
        Lebar = d.nextInt();
        b.setLebar(Lebar);
        System.out.print("Masukkan Tinggi: ");
        Tinggi = d.nextInt();
        b.setTinggi(Tinggi);
        b.Result();

    }
}
