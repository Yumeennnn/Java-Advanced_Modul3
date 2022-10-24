package Task_1_2_4;

import java.util.Scanner;

public class Drivers {
    static private int Panjang;
    static private int Lebar;
    static private int Tinggi;

    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        Balok b = new Balok();

        System.out.println("== Program Menghitung Luas dan Volume Balok ==");
        System.out.print("Masukkan Panjang\t: ");
        Panjang = d.nextInt();
        b.setPanjang(Panjang);
        System.out.print("Masukkan Lebar\t\t: ");
        Lebar = d.nextInt();
        b.setLebar(Lebar);
        System.out.print("Masukkan Tinggi\t\t: ");
        Tinggi = d.nextInt();
        b.setTinggi(Tinggi);
        b.Result();

    }
}
